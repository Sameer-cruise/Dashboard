package com.tcs.components;

import com.tcs.Application;
import com.tcs.commons.FlightDocument;
import com.tcs.commons.PopulateResponseHelper;
import com.tcs.lists.PopulateQSOALists;
import com.tcs.model.SummaryVO;
import com.tcs.services.DatabaseService;
import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoListType;
import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FlightLegInfoType;
import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgResDocument;
import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument;
import org.iata.iata.x2007.x00.FlightLegType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class QSOAFlights extends WebServiceGatewaySupport {

    private final WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
    @Autowired
    FlightDocument flightDocument;
    @Autowired
    PopulateResponseHelper response;
    @Autowired
    PopulateQSOALists qsoa;
    private SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(
            "yyyy-MM-dd'T'HH:mm:ss");

    public String getFlightResponse() throws InterruptedException {
        Application.logger.info("Entering the flight response method");
        Application.logger.info("Getting List Of ElogBook Enabled Regos.");

        DatabaseService dbs = new DatabaseService();
//        dbs.getElogBookAircrafts();

        String[] locations = "SYD,MEL,BNE,PER,ADL,ASP,DRW,TSV,CNS,CBR,LAX,AKL,CHC,WLG,SIN,ZQN".split(",");
        for (int i = 0; i < locations.length; i++) {
            //Get Flights for all locations
            Application.logger.info("Location accessed: " + locations[i]);
            RetriveFlightLegMsgRqDocument req = flightDocument.getFlightRequest(locations[i]);
            RetriveFlightLegMsgResDocument lRetriveFlightLegMsgResDocument = (RetriveFlightLegMsgResDocument) getWebServiceTemplate()
                    .marshalSendAndReceive(
                            "https://api.qantas.com.au/flightops/flightdata/soap/v1",
                            req);
            Application.logger.info("Have received a response");
            qsoa.parseresponse(populateResponse(lRetriveFlightLegMsgResDocument), locations[i]);
        }
        return "QSOA Data Extracted";
    }

    private ArrayList<SummaryVO> populateResponse(RetriveFlightLegMsgResDocument lRetriveFlightLegMsgResDocument) {
        ArrayList<SummaryVO> lList = new ArrayList<SummaryVO>();

        try {
            {
                FlightLegInfoListType lFlightLegInfoListType = lRetriveFlightLegMsgResDocument
                        .getRetriveFlightLegMsgRes();
                FlightLegInfoType[] lFlightLegInfoType = lFlightLegInfoListType
                        .getFlightLegInfoArray();
                if (lFlightLegInfoType.length > 0) {
                    for (FlightLegInfoType tempFlightLegInfoType : lFlightLegInfoType) {
                        FlightLegType lDepartueFlightLeg = null;
                        FlightLegType lArrivalFlightLeg = null;
                        boolean valid = validateNoOfLegPresent(tempFlightLegInfoType);
                        if (valid) {
                            int noOfElements = tempFlightLegInfoType
                                    .getFlightLegArray().length;
                            if (noOfElements > 0) {
                                for (FlightLegType flightLegType : tempFlightLegInfoType
                                        .getFlightLegArray()) {
                                    if ((flightLegType.getLegIdentifier() != null)
                                            && (flightLegType
                                            .getLegIdentifier()
                                            .getRepeatNumber() != null)
                                            && (flightLegType
                                            .getLegIdentifier()
                                            .getRepeatNumber()
                                            .isSetCurrentInd())) {
                                        if (flightLegType.getLegIdentifier()
                                                .getRepeatNumber()
                                                .getCurrentInd() == true) {
                                            lArrivalFlightLeg = flightLegType;
                                        }
                                        if (flightLegType.getLegIdentifier()
                                                .getRepeatNumber()
                                                .getCurrentInd() == false) {
                                            lDepartueFlightLeg = flightLegType;
                                        }
                                    }
                                }

                                if (validateFlightLegData(
                                        tempFlightLegInfoType,
                                        lArrivalFlightLeg, lDepartueFlightLeg)) {
                                    SummaryVO lSummaryVO = new SummaryVO();

                                    lSummaryVO
                                            .setDepartureStatus("NOT DEPARTED");
                                    lSummaryVO.setArrivalStatus("NOT ARRIVED");
                                    lSummaryVO
                                            .setStation(tempFlightLegInfoType
                                                    .isSetCurrentStation() == true ? tempFlightLegInfoType
                                                    .getCurrentStation() : "");
                                    lSummaryVO
                                            .setEventStatus(tempFlightLegInfoType
                                                    .isSetEventStatus() == true ? tempFlightLegInfoType
                                                    .getEventStatus() : "");

                                    if (lArrivalFlightLeg != null) {

                                        response.populateSummaryVOFromArrvalFlightLeg(
                                                lSummaryVO, lArrivalFlightLeg);
                                    }
                                    if (lDepartueFlightLeg != null) {

                                        response.populateSummaryVOFromDepartureFlightLeg(
                                                lSummaryVO, lDepartueFlightLeg);

                                    }
                                    lList.add(lSummaryVO);
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
        return lList;
    }

    private boolean validateNoOfLegPresent(
            FlightLegInfoType tempFlightLegInfoType) {
        // TODO Auto-generated method stub
        boolean isValid = false;

        try {
            if (tempFlightLegInfoType.sizeOfFlightLegArray() < 1
                    || tempFlightLegInfoType.sizeOfFlightLegArray() > 2) {
                throw new Exception(
                        "Invalid no of FlightLeg elemnets for the given FlightlegInfo");

            } else {
                isValid = true;
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
        return isValid;
    }

    private boolean validateFlightLegData(
            FlightLegInfoType tempFlightLegInfoType,
            FlightLegType lArrivalFlightLeg, FlightLegType lDepartueFlightLeg) {
        // TODO Auto-generated method stub
        boolean isValida = false;

        try {
            if ((lArrivalFlightLeg == null)
                    || (lArrivalFlightLeg.getLegIdentifier() == null)
                    || (lArrivalFlightLeg.getLegData() == null)) {
                throw new Exception(
                        "Arrival sector information is not present in  current tile");
            } else {
                isValida = true;
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return isValida;
    }


}

