package com.tcs.lists;

import com.tcs.Application;
import com.tcs.model.ElogBookRego;
import com.tcs.model.OpsView;
import com.tcs.model.SummaryVO;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;

@Component
public class PopulateQSOALists {
    public void parseresponse(ArrayList<SummaryVO> summaryVOs, String location) {
        Lists.flightList.removeAll(location.toUpperCase());
        for (SummaryVO sv : summaryVOs) {
            OpsView ov = new OpsView();
            ov.setOwner(sv.getOwner());
            ov.setArrivalFlightNo(sv.getArrivalFlightNo());  //Arrival Leg
            ov.setArrivalStatus(sv.getArrivalStatus()); //Arrival Leg
            ov.setArrivalFlightStatus(sv.getFlightStatus());
            ov.setArrivalTimeLocal(sv.getArrivalTime()); //Arrival Leg
            ov.setArrivalTimeUTC(sv.getUtcArrivalTime());
            ov.setArrivingToPort(sv.getArivingToPort());
            ov.setSchedArrivalTimeLocal(sv.getScheduleArrivalDate());
            ov.setSchedArrivalTimeUTC(sv.getScheduleArrivalDateUTC());
            ov.setDepartingFlightNo(sv.getDepartingFlightNo());
            ov.setDepartingToPort(sv.getDepartingToPort());
            ov.setDepartureStatus(sv.getDepartureStatus());
            ov.setDepartureTimeLocal(sv.getDepartureTime());
            ov.setDepartureTimeUTC(sv.getUtcDepartureTime());
            ov.setRego(sv.getRego());
            ov.setSchedDepartureLegDeptTimeLocal(sv.getDepartureLegScheduleDepartureDateLocal());
            ov.setSchedDepartureLegDeptTimeUTC(sv.getDepartureLegScheduleDepartureDateUTC());
            ov.setSchedDepartureLegArrivalTimeLocal(sv.getDepartureLegSchedArrDateLocal());
            ov.setSchedDepartureLegArrivalTimeUTC(sv.getDepartureLegSchedArrDateUTC());
            ov.setDepartureLegActualArrivalUTC(sv.getDepartureLegActArrvDateUTC());
            ov.setDepartureLegActualArrivalLocal(sv.getDepartureLegActArrvDateLocal());
            ov.setStation(sv.getStation());
            ov.setArrivingFromStation(sv.getArrivingFromPort());
            ov.setArrivalFlightSeq(sv.getArrivalLegSequent());
            ov.setDepFlightSeq(sv.getDepartureLegSequent());
            if(Lists.eLogBookRegosString.contains(ov.getRego().substring(ov.getRego().length()-3))) {
                ov.seteLogBookCap("1");
            }
            else{
                ov.seteLogBookCap("0");
            }
            Lists.flightList.put(location, ov);
        }
    }
}


