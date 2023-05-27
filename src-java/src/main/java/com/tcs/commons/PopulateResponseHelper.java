package com.tcs.commons;

import com.tcs.model.SummaryVO;
import org.iata.iata.x2007.x00.FlightLegIdentifierType;
import org.iata.iata.x2007.x00.FlightLegType;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by 547885 on 11/10/2015.
 */
@Component
public class PopulateResponseHelper {

    private SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(
            "yyyy-MM-dd'T'HH:mm:ss");

    public void populateSummaryVOFromDepartureFlightLeg(SummaryVO lSummaryVO,
                                                         FlightLegType departureFlightLeg) throws java.text.ParseException {
        // TODO Auto-generated method stub
        FlightLegIdentifierType lDepartureFlightLegIdentifierType = departureFlightLeg
                .getLegIdentifier();

        lSummaryVO.setDepartingFlightNo(lDepartureFlightLegIdentifierType
                .getFlightNumber() != null ? lDepartureFlightLegIdentifierType
                .getFlightNumber() : "");
        if (lDepartureFlightLegIdentifierType.getOriginDate() != null) {

            lSummaryVO
                    .setDepartureLegOriginDate(lDepartureFlightLegIdentifierType
                            .getOriginDate().getTime());

        }

        lSummaryVO
                .setDepartingToPort(lDepartureFlightLegIdentifierType
                        .getArrivalAirport() != null ? lDepartureFlightLegIdentifierType
                        .getArrivalAirport().getStringValue() : "");
        if (lDepartureFlightLegIdentifierType.getRepeatNumber() != null) {
            lSummaryVO.setDepartureLegSequent(lDepartureFlightLegIdentifierType
                    .getRepeatNumber().intValue());
        }

        FlightLegType.LegData lDepartureLegData = departureFlightLeg.getLegData();

        if ((lDepartureLegData.getOperationalStatusArray() != null)
                && (lDepartureLegData.getOperationalStatusArray().length > 0)) {
            String operationalStatus = lDepartureLegData
                    .getOperationalStatusArray(0).getStringValue();

            if (operationalStatus.toLowerCase().contains("chockson")) {
                lSummaryVO.setDepartureFlightStatus("BLOCKS ON");
                lSummaryVO.setDepartureStatus("DEPARTED");
            } else if (operationalStatus.toLowerCase().contains("chocksoff")) {
                lSummaryVO.setDepartureFlightStatus("BLOCKS OFF");

            } else if (operationalStatus.toLowerCase().contains("planned")) {
                lSummaryVO.setDepartureFlightStatus("PLANNED");

            } else if (operationalStatus.toLowerCase().contains("wheelson")) {
                lSummaryVO.setDepartureFlightStatus("WHEELS DOWN");
                lSummaryVO.setDepartureStatus("DEPARTED");
            } else if (operationalStatus.toLowerCase().contains("wheelsoff")) {
                lSummaryVO.setDepartureFlightStatus("WHEELS UP");
                lSummaryVO.setDepartureStatus("DEPARTED");
            }

        }

        if ((lDepartureLegData.getOperationTimeArray() != null)
                && (lDepartureLegData.getOperationTimeArray().length > 0)) {
            org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] ldepartueTime = lDepartureLegData
                    .getOperationTimeArray();

            for (int j = 0; j < ldepartueTime.length; j++) {


                if (ldepartueTime[j].getOperationQualifier().equalsIgnoreCase(
                        "SA")) {
                    if (ldepartueTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setDepartureLegSchedArrDateUTC(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));
                    } else {
                        lSummaryVO.setDepartureLegSchedArrDateLocal(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    }
                }

                if (ldepartueTime[j].getOperationQualifier()
                        .equalsIgnoreCase("EA")) {
                    if (ldepartueTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setDepartureLegActArrvDateUTC(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    } else {
                        lSummaryVO.setDepartureLegActArrvDateLocal(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    }
                }

                if (ldepartueTime[j].getOperationQualifier().equalsIgnoreCase(
                        "SD")) {
                    if (ldepartueTime[j].getTimeType().equalsIgnoreCase("U")) {

                        lSummaryVO.setDepartureLegScheduleDepartureDateUTC(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));
                    } else {
                        lSummaryVO.setDepartureLegScheduleDepartureDateLocal(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));
                    }
                }

                if (ldepartueTime[j].getOperationQualifier().equalsIgnoreCase(
                        "ED")) {
                    if (ldepartueTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setUtcDepartureTime(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    } else {
                        lSummaryVO.setDepartureDate(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));
                        lSummaryVO.setDepartureTime(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    }
                }
                if (ldepartueTime[j].getOperationQualifier().equalsIgnoreCase(
                        "AD")) {
                    if (ldepartueTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setUtcDepartureTime(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    } else {
                        lSummaryVO.setDepartureDate(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));
                        lSummaryVO.setDepartureTime(lSimpleDateFormat
                                .parse(ldepartueTime[j].getStringValue()));

                    }
                }

            }

        }

    }

    public void populateSummaryVOFromArrvalFlightLeg(SummaryVO lSummaryVO,
                                                      FlightLegType arrivalFlightLeg) throws java.text.ParseException {
        // TODO Auto-generated method stub
        FlightLegIdentifierType lFlightLegIdentifierType = arrivalFlightLeg
                .getLegIdentifier();
        // Setting Owner
        lSummaryVO
                .setOwner(lFlightLegIdentifierType.getAirline() != null ? lFlightLegIdentifierType
                        .getAirline().getStringValue() : "");

        // Setting arrival flight number
        lSummaryVO.setArrivalFlightNo(lFlightLegIdentifierType
                .getFlightNumber() != null ? lFlightLegIdentifierType
                .getFlightNumber() : "");

        // Setting Arrival from port for arrival port
        lSummaryVO.setArrivingFromPort(lFlightLegIdentifierType
                .getDepartureAirport() != null ? lFlightLegIdentifierType
                .getDepartureAirport().getStringValue() : "");

        lSummaryVO.setArivingToPort(lFlightLegIdentifierType
                .getArrivalAirport() != null ? lFlightLegIdentifierType
                .getArrivalAirport().getStringValue() : "");

        if (lFlightLegIdentifierType.getOriginDate() != null) {

            lSummaryVO.setArrivingFromPortOriginDate(lFlightLegIdentifierType
                    .getOriginDate().getTime());

        }
        if (lFlightLegIdentifierType.getRepeatNumber() != null) {

            lSummaryVO.setArrivalLegSequent(lFlightLegIdentifierType
                    .getRepeatNumber().intValue());

        }

        FlightLegType.LegData lLegData = arrivalFlightLeg.getLegData();

        // Setting Arrival flight status

        if ((lLegData.getOperationalStatusArray() != null)
                && (lLegData.getOperationalStatusArray().length > 0)) {
            String operationalStatus = lLegData.getOperationalStatusArray(0)
                    .getStringValue();

            if (operationalStatus.toLowerCase().contains("chockson")) {
                lSummaryVO.setFlightStatus("BLOCKS ON");
                lSummaryVO.setArrivalStatus("ARRIVED");
            } else if (operationalStatus.toLowerCase().contains("chocksoff")) {
                lSummaryVO.setFlightStatus("BLOCKS OFF");

            } else if (operationalStatus.toLowerCase().contains("wheelson")) {
                lSummaryVO.setFlightStatus("WHEELS DOWN");
                lSummaryVO.setArrivalStatus("ARRIVED");
            } else if (operationalStatus.toLowerCase().contains("wheelsoff")) {
                lSummaryVO.setFlightStatus("WHEELS UP");

            } else if (operationalStatus.toLowerCase().contains("planned")) {
                lSummaryVO.setFlightStatus("PLANNED");

            }

        }

        if (lLegData.getPlannedArrivalAptHistoryArray() != null
                && (lLegData.getPlannedArrivalAptHistoryArray().length > 0)) {

            lSummaryVO.setArrivalSectorUnscheduledPort(lLegData
                    .getPlannedArrivalAptHistoryArray()[0].getStringValue());
        }

        if (lLegData.getAircraftInfo() != null) {
            lSummaryVO.setAircraftType(lLegData.getAircraftInfo()
                    .getAircraftType() != null ? lLegData.getAircraftInfo()
                    .getAircraftType() : "");
            lSummaryVO
                    .setRego(lLegData.getAircraftInfo().getRegistration() != null ? lLegData
                            .getAircraftInfo().getRegistration() : "");

        }

        if ((lLegData.getOperationTimeArray() != null)
                && (lLegData.getOperationTimeArray().length > 0)) {

            org.iata.iata.x2007.x00.FlightLegType.LegData.OperationTime[] larrivalTime = lLegData
                    .getOperationTimeArray();
            for (int j = 0; j < larrivalTime.length; j++) {

                if (larrivalTime[j].getOperationQualifier().equalsIgnoreCase(
                        "SA")) {
                    if (larrivalTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setScheduleArrivalDateUTC(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));
                        lSummaryVO.setUtcArrivalTime(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));
                    } else {
                        lSummaryVO.setScheduleArrivalDate(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));
                        lSummaryVO.setArrivalDate(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));
                        lSummaryVO.setArrivalTime(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));

                    }
                } else if (larrivalTime[j].getOperationQualifier()
                        .equalsIgnoreCase("EA")) {
                    if (larrivalTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setUtcArrivalTime(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));

                    } else {
                        lSummaryVO.setArrivalDate(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));
                        lSummaryVO.setArrivalTime(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));

                    }
                } else if (larrivalTime[j].getOperationQualifier()
                        .equalsIgnoreCase("AA")) {
                    if (larrivalTime[j].getTimeType().equalsIgnoreCase("U")) {
                        lSummaryVO.setUtcArrivalTime(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));

                    } else {
                        lSummaryVO.setArrivalDate(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));
                        lSummaryVO.setArrivalTime(lSimpleDateFormat
                                .parse(larrivalTime[j].getStringValue()));

                    }
                }
            }

        }

    }
}
