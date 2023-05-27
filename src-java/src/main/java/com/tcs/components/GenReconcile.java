package com.tcs.components;

import com.google.common.base.Strings;
import com.tcs.Application;
import com.tcs.lists.Lists;
import com.tcs.lists.PopulateAtlasList;
import com.tcs.commons.CommonFunctions;
import com.tcs.model.AtlasBoardView;
import com.tcs.model.OpsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;

/**
 * Created by 547885 on 11/10/2015.
 */
@Component
public class GenReconcile {

    @Autowired
    PopulateAtlasList atlas;

    public void reconcileforloc(String loc)
    {
        Lists.AtlasBoardViewList.removeAll(loc.toUpperCase());
        Lists.AtlasBoardViewList.removeAll(loc.toUpperCase()+"D");

       Collection<OpsView> data=Lists.flightList.get(loc);

        for (OpsView dat : data) {

            AtlasBoardView av = new AtlasBoardView();
            av.setPort(dat.getStation());
            av.setNxtport(dat.getDepartingToPort());
            av.setIndicator(CommonFunctions.domint(dat.getDepartingFlightNo(),loc));  //Added the location check
            av.setArrfltno(Strings.padStart(dat.getArrivalFlightNo(), 4, '0'));
            av.setDepfltno(Strings.padStart(dat.getDepartingFlightNo(), 4, '0'));
            av.setArrivalDate((dat.getArrivalTimeLocal() == null) ? dat.getSchedArrivalTimeLocal() : dat.getArrivalTimeLocal());
            av.setDeptDate((dat.getDepartureTimeLocal() == null) ? dat.getSchedDepartureLegDeptTimeLocal() : dat.getDepartureTimeLocal());
            av.setArrivalDateUTC((dat.getArrivalTimeUTC() == null) ? dat.getSchedArrivalTimeUTC() : dat.getArrivalTimeUTC());
            av.setDeptDateUTC((dat.getDepartureTimeUTC() == null) ? dat.getSchedDepartureLegDeptTimeUTC() : dat.getDepartureTimeUTC());
            av.setArrstatus(dat.getArrivalStatus());
            av.setFlightstatus(dat.getArrivalFlightStatus());
            av.setDeptstatus(dat.getDepartureStatus());
            av.setOwner(dat.getOwner());
            av.setRego(dat.getRego().substring(2));
            av.seteLogbookCap(dat.geteLogBookCap());

            try {

               // av.setWorkpack(CommonFunctions.workpackage(loc, dat.getRego().substring(2), dat.getSchedArrivalTimeUTC(),dat.getSchedDepartureLegDeptTimeUTC()));
                av.setWorkpack(CommonFunctions.workpackage(loc, dat.getRego().substring(2), dat.getOwner() + Strings.padStart(dat.getArrivalFlightNo(), 4, '0'), dat.getSchedArrivalTimeUTC(), dat.getSchedDepartureLegDeptTimeUTC()));

            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
            /*    av.setDue(CommonFunctions.duelist(dat.getRego().substring(2), dat.getDepartureLegActualArrivalUTC(), dat.getSchedDepartureLegArrivalTimeUTC(), dat.getDepartureTimeUTC(),
                        dat.getSchedDepartureLegDeptTimeUTC(),loc, dat.getSchedArrivalTimeUTC())); //The last three values have been added for finding the workpackages*/
                av.setDue(CommonFunctions.duelist(dat.getRego().substring(2), dat.getDepartureLegActualArrivalUTC(), dat.getSchedDepartureLegArrivalTimeUTC(), dat.getDepartureTimeUTC(),
                        dat.getSchedDepartureLegDeptTimeUTC(),loc, dat.getSchedArrivalTimeUTC(),dat.getOwner() + Strings.padStart(dat.getArrivalFlightNo(), 4, '0')));

            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            av.setMelcnt(CommonFunctions.melcount(dat.getRego().substring(2)));


            //Added to get the values

            av.setArrivalPort(dat.getArrivingFromStation());
            av.setDepSeq(Integer.toString(dat.getDepFlightSeq()));
            av.setArrSeq(Integer.toString(dat.getArrivalFlightSeq()));
            av.setSchedArrDate(dat.getSchedArrivalTimeUTC());
            av.setSchedDeptDate(dat.getSchedDepartureLegDeptTimeUTC());


            populateatlasboard(av,loc);

        }
        atlas.jsongenerate(loc);
}

    private void populateatlasboard(AtlasBoardView av, String loc) {

        if(av.getIndicator().equals("Dom")){
            Lists.AtlasBoardViewList.put(loc.toUpperCase()+"D",av);
        }
        else
        {
            Lists.AtlasBoardViewList.put(loc.toUpperCase(),av);
        }
    }
    }
