package com.tcs.commons;

import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.ArrivalDepartureType;
import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.FilterDataType;
import comSchemaCdmOperationsFlightOperationsRetrieveFlightLegV1.qantas.RetriveFlightLegMsgRqDocument;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.impl.regex.ParseException;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 547885 on 10/10/2015.
 */
@Component
public class FlightDocument {

    public RetriveFlightLegMsgRqDocument getFlightRequest(String loc)
    {

        RetriveFlightLegMsgRqDocument lRetriveFlightLegMsgRqDocument = RetriveFlightLegMsgRqDocument.Factory
                .newInstance();
        RetriveFlightLegMsgRqDocument.RetriveFlightLegMsgRq lRetriveFlightLegMsgRq = lRetriveFlightLegMsgRqDocument
                .addNewRetriveFlightLegMsgRq();
        FilterDataType lFilterDataType = lRetriveFlightLegMsgRq
                .addNewFilterData();
        setAirlines(lFilterDataType);
        setEventStations(lFilterDataType,loc);
        setDepartureStartDate(lFilterDataType);
        setArrivalEndDate(lFilterDataType);
        setPriority(lFilterDataType);
        setResultOrder(lFilterDataType);
        setRowLimit(lFilterDataType);
        setAircraftInfo(lFilterDataType);

        return lRetriveFlightLegMsgRqDocument;
    }

    private void setAircraftInfo(FilterDataType lFilterDataType) {
        //String types="330,380,737,73F,747,767,76F";
        String types="330,380,737,73F,747,767,76F,787,788";
        String[] aircraftsTypes = types.split(",");

        for (int j = 0; j < aircraftsTypes.length; j++) {

            lFilterDataType.addNewAircraftInfo().setAircraftType(aircraftsTypes[j]);
        }


    }

    private void setRowLimit(FilterDataType lFilterDataType) {
        lFilterDataType.setRowLimit(new BigInteger("200"));
    }

    private void setResultOrder(FilterDataType lFilterDataType) {
        FilterDataType.ResultOrder lResultOrder = lFilterDataType.addNewResultOrder();
        lResultOrder.set(ArrivalDepartureType.DEPARTURE);
        lResultOrder.setOrder(FilterDataType.ResultOrder.Order.ASC);
    }

    private void setPriority(FilterDataType lFilterDataType) {
        lFilterDataType.addNewPriority().set(FilterDataType.Priority.ALL);
    }

    private void setArrivalEndDate(FilterDataType lFilterDataType) {
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(formatter.parse(formatter.format(date)));
        } catch (java.text.ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        cal.add( Calendar.DATE, 1 );
        String nxtdate=formatter.format(cal.getTime());

        SimpleDateFormat tempFormatter = new SimpleDateFormat("yyyy-MM-dd");

        XmlDate lXmlDate = XmlDate.Factory.newInstance();

        try {
            try {
                lXmlDate.setStringValue(tempFormatter.format(formatter
                        .parse(nxtdate)));
            } catch (java.text.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            lFilterDataType.xsetArrivalEndDate(lXmlDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private void setDepartureStartDate(FilterDataType lFilterDataType) {

        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(formatter.parse(formatter.format(date)));
        } catch (java.text.ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        cal.add( Calendar.DATE, -1 );
        String prevdate=formatter.format(cal.getTime());

        SimpleDateFormat tempFormatter = new SimpleDateFormat("yyyy-MM-dd");

        XmlDate lXmlDate = XmlDate.Factory.newInstance();

        try {
            try {
                lXmlDate.setStringValue(tempFormatter.format(formatter
                        .parse(prevdate)));
            } catch (java.text.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            lFilterDataType.xsetDepartureStartDate(lXmlDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private void setAirlines(FilterDataType lFilterDataType) {

        String[] airlines = "QFA".split(",");  //changed made here to include the Jet Connect flights

        for (int i = 0; i < airlines.length; i++) {

            lFilterDataType.addNewAirline().setStringValue(airlines[i]);

        }
    }

    private void setEventStations(FilterDataType lFilterDataType,String loc) {

        lFilterDataType.addNewArrivalAirport().setStringValue(loc.toUpperCase());

    }
}
