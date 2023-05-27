package com.tcs.commons;

import com.tcs.lists.Lists;
import com.tcs.model.AtlasBoardView;
import com.tcs.model.GlobalView;
import com.tcs.model.QueryView;
import org.apache.commons.lang.time.DateUtils;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 547885 on 11/10/2015.
 */
@Component
public class CommonFunctions {

    //Have changed here to differentiate DOM and INT sectors
    public static String domint(String departingFlightNo,String loc) {
        // TODO Auto-generated method stub

        int flightno=Integer.parseInt(departingFlightNo);

       /* if(loc.toUpperCase().equals("ADL")||loc.toUpperCase().equals("ASP")||loc.toUpperCase().equals("CNS")||
                loc.toUpperCase().equals("CBR")||loc.toUpperCase().equals("DRW")||
                loc.toUpperCase().equals("LAX")||loc.toUpperCase().equals("TSV"))*/
        if(!(loc.toUpperCase().equals("SYD")))
        {
            return "Dom";
        }
        else {
            if ((flightno >= 1 && flightno <= 399) || (flightno > 1601)) {
                return "Int";
            } else {
                return "Dom";
            }
        }
    }
   /* public static String workpackage(String loc, String rego, Date schedarr, Date scheddept) throws ParseException
    {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");

        Collection<QueryView> qdata = Lists.workpackageList.get(loc);

        for(QueryView dat : qdata)
        {
            if(!(dat.getWp().equalsIgnoreCase("EMPTY"))) {
                if (!(schedarr == null || scheddept == null)) {
                    Date wpstartdt = dat.getWp_start();
                    if ((((sdf.parse(sdf.format(schedarr)).compareTo(wpstartdt) < 0) && (sdf.parse(sdf.format(scheddept)).compareTo(wpstartdt) > 0))
                            || ((sdf.parse(sdf.format(schedarr)).compareTo(wpstartdt) == 0)))
                            && (rego.equalsIgnoreCase(dat.getRego()))) {
                        return dat.getWp() + "," + dat.getStatus();
                    }
                }
            }
            else
            {
                return " "+","+"IGNORE";
            }
        }

        return " "+","+"IGNORE";
    }*/

    public static String workpackage(String loc, String rego, String flight,Date schedarr, Date scheddept) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");

        Collection<QueryView> qdata = Lists.workpackageList.get(loc);
        for (QueryView dat : qdata) {
            if (!(dat.getWp().equalsIgnoreCase("EMPTY"))) {
                if (!(schedarr == null || scheddept == null)) {
                    Date wpstartdt = dat.getWp_start();
                    Date wpend=dat.getWp_end();
                    if ((((sdf.parse(sdf.format(schedarr)).compareTo(wpstartdt) < 0) && (sdf.parse(sdf.format(scheddept)).compareTo(wpstartdt) > 0))
                            || ((sdf.parse(sdf.format(schedarr)).compareTo(wpstartdt) == 0)))
                            && (rego.equalsIgnoreCase(dat.getRego()))) {
                        return dat.getWp() + "," + dat.getStatus();
                    }

                    else
                    {
                        if(rego.equalsIgnoreCase(dat.getRego()) && flight.equalsIgnoreCase(dat.getMxflight()) && (sdf.parse(sdf.format(schedarr)).compareTo(wpstartdt)>0) &&  (sdf.parse(sdf.format(schedarr)).compareTo(wpend)<0))
                        {
                            return dat.getWp() + "," + dat.getStatus();
                        }
                    }
                }
            } /*else {
                return " " + "," + "IGNORE";
            }*/
        }

        return " " + "," + "IGNORE";
    }


    public static String duelist(String rego, Date arrdate, Date schedarrdate, Date deptdate, Date scheddeptdate,String loc,Date schedarr,String flight) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        Collection<GlobalView> gdata = Lists.MelDataList.get(rego);

        for(GlobalView dat : gdata)
        {
            if(!(dat.getDue_date().equalsIgnoreCase("NA"))) {
                if (!(((arrdate == null) && (schedarrdate == null)) || ((deptdate == null) && (scheddeptdate == null)))) {

                    Date duedate = sdf.parse(dat.getDue_date().split(",")[1]);
                    String workpackage=dat.getDue_date().split(",")[2];

                    {
                        if ((((sdf.parse(sdf.format((deptdate == null) ? scheddeptdate : deptdate)).compareTo(duedate) < 0) && (sdf.parse(sdf.format((arrdate == null) ? schedarrdate : arrdate)).compareTo(duedate) > 0))
                                || ((sdf.parse(sdf.format((deptdate == null) ? scheddeptdate : deptdate))).compareTo(duedate) == 0) || ((sdf.parse(sdf.format((arrdate == null) ? schedarrdate : arrdate))).compareTo(duedate) == 0)
                                || ((sdf.parse(sdf.format((deptdate == null) ? scheddeptdate : deptdate))).compareTo(duedate) > 0))
                                && (rego.equalsIgnoreCase(dat.getGrego()))  && ((CommonFunctions.workpackage(loc,rego,flight,schedarr,scheddeptdate).split(",")[0].equals(workpackage))||
                                (workpackage.equals("NOWP")))) {
                            return "YES";
                        }
                    }

                }
            }
        }
        return " ";

    }

    public static String melcount(String rego)
    {
        //GlobalView[] gdata=Lists.global.toArray(new GlobalView[Lists.global.size()]);
        Collection<GlobalView> gdata = Lists.MelDataList.get(rego);

        for(GlobalView dat : gdata)
        {
            if(rego.equals(dat.getGrego()))
            {
                return (dat.getMel_cnt().equalsIgnoreCase("NA"))? " ":dat.getMel_cnt();
            }

        }
        return " ";
    }

    public static JSONArray jsongeneration(ArrayList<AtlasBoardView> atlas)
    {
        JSONArray comjson=new JSONArray();
        comjson.clear();

        for(AtlasBoardView vw: atlas)
        {
            /*if((!(vw.getArrstatus().equalsIgnoreCase("ARRIVED") && vw.getDeptstatus().equalsIgnoreCase("DEPARTED")) &&
                    (displaylogic(vw).equals("YES"))) || (vw.getWorkpack().split(",")[1].equals("IN WORK")) )*/
            if((!(vw.getArrstatus().equalsIgnoreCase("ARRIVED") && vw.getDeptstatus().equalsIgnoreCase("DEPARTED")) &&
                    (displaylogic(vw).equals("YES"))) || (!(vw.getWorkpack().split(",")[0].equals(" ")) ))
            {
                LinkedHashMap<Object, Object> obj = new LinkedHashMap<Object, Object>();
                obj.put("LOCATION",vw.getPort());
                obj.put("ARRLOCATION",vw.getArrivalPort());  // Added extra
                obj.put("AC_REG_CD", vw.getRego());
                obj.put("ARR_FLT_NO", vw.getOwner()+vw.getArrfltno());
                obj.put("ARR_FLT_SEQ", vw.getArrSeq()); // Added extra
                obj.put("ARR_TIME", nullhandlerdates(vw.getArrivalDate()));//sdf.format(vw.getArrivalDate()).toUpperCase());
                obj.put("ARR_TIME_UTC", nullhandlerdates(vw.getArrivalDateUTC()));//sdf.format(vw.getArrivalDateUTC()).toUpperCase());
                obj.put("SCHED_ARR_TIME_UTC",nullhandlerdates(vw.getSchedArrDate()));
                obj.put("DEP_FLT_NO", vw.getOwner()+vw.getDepfltno());
                obj.put("DEP_FLT_SEQ", vw.getDepSeq()); // Added extra
                obj.put("DEP_TIME", nullhandlerdates(vw.getDeptDate()));//sdf.format(vw.getDeptDate()).toUpperCase());
                obj.put("DEP_TIME_UTC", nullhandlerdates(vw.getDeptDateUTC()));//sdf.format(vw.getDeptDateUTC()).toUpperCase());
                obj.put("SCHED_DEP_TIME_UTC", nullhandlerdates(vw.getSchedDeptDate()));//sdf.format(vw.getDeptDateUTC()).toUpperCase());
                obj.put("NXT_PORT", vw.getNxtport());
                obj.put("WORK_PACK", vw.getWorkpack().split(",")[0]);
                obj.put("WP_STATUS", vw.getWorkpack().split(",")[1]);
                obj.put("MEL_COUNT", vw.getMelcnt());
                obj.put("FAULTS_DUE", vw.getDue());
                obj.put("ElogBookCap", vw.geteLogbookCap());

                //REFRESH TIMES

                obj.put("CUR_REFRESH", Lists.currentRun);
                obj.put("NXT_REFRESH", Lists.nextRun);


                comjson.add(obj);
            }
        }
        return comjson;

    }

    public static Object nullhandlerdates(Date dates) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
       // SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM HH:mm");

        if(dates!=null)
        {
            return sdf.format(dates).toUpperCase();
        }
        else
        {
            return " ";
        }
    }



    public static String displaylogic(AtlasBoardView vw) {
        // TODO Auto-generated method stub
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm");
        SimpleDateFormat udf = new SimpleDateFormat("dd-MM-yy HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = null;
        try {
            date = udf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if((vw.getDeptDateUTC().compareTo(date)>=0 && vw.getDeptDateUTC().compareTo(DateUtils.addHours(date, 14))<=0) ||
                ((vw.getFlightstatus().equalsIgnoreCase("WHEELS UP"))))
        {
            return "YES";
        }
  else
  {
            return "NO";
        }
    }

    public static String queryview(String loc) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        Collection<QueryView> qv=Lists.workpackageList.get(loc);
        JSONArray comjson=new JSONArray();
        comjson.clear();

        for(QueryView vw:qv)
        {

            LinkedHashMap<Object, Object> obj = new LinkedHashMap<Object, Object>();
            obj.put("LOCATION",vw.getLoc());
            obj.put("AC_REG_CD", vw.getRego());
            obj.put("WORK_PACK", vw.getWp());
            obj.put("WP_STATUS", vw.getStatus());
            obj.put("WP_LOC", vw.getWp_loc());
            obj.put("WP_START",sdf.format(vw.getWp_start()).toUpperCase()+" UTC");
            comjson.add(obj);
        }

        return comjson.toJSONString();
    }

    public static String acftview(String acft) {

        Collection<GlobalView> qv=Lists.MelDataList.get(acft);
        JSONArray comjson=new JSONArray();
        comjson.clear();

        Set<GlobalView> set=new HashSet<GlobalView>(qv);

        for(GlobalView vw:set)
        {

            LinkedHashMap<Object, Object> obj = new LinkedHashMap<Object, Object>();
            obj.put("AC_REG_CD",vw.getGrego());
            obj.put("MEL_CNT", (vw.getMel_cnt().equalsIgnoreCase("NA"))?"":vw.getMel_cnt());
            obj.put("FAULT",(vw.getDue_date().equalsIgnoreCase("NA"))?"":vw.getDue_date().split(",")[0]);
            obj.put("DUE_DATE",(vw.getDue_date().equalsIgnoreCase("NA"))?"":(vw.getDue_date().split(",")[1]).toUpperCase()+" UTC");
            comjson.add(obj);
        }

        return comjson.toJSONString();

    }


   /* public static JSONArray logFile() {

        JSONArray logs=new JSONArray();
        logs.clear();

        LinkedHashMap<Object, Object> obj = new LinkedHashMap<Object, Object>();
        obj.put("MOU_FILE",Lists.appLogs.get("MOU FILE"));
        obj.put("SAM_MOU_FILE",Lists.appLogs.get("SAM MOU FILE"));  // Added extra
        obj.put("GRAPH_DATA", Lists.appLogs.get("GRAPH DATA"));
        obj.put("GRAPH_DATA_SIZE", Lists.appLogs.get("GRAPH DATA SIZE"));
        obj.put("GRAPH_DATA_TABLE", Lists.appLogs.get("GRAPH DATA TABLE"));
        obj.put("GRAPH_DATA_TABLE_SIZE", Lists.appLogs.get("GRAPH DATA TABLE SIZE"));
        obj.put("SAM_GRAPH_DATA", Lists.appLogs.get("SAM GRAPH DATA"));
        obj.put("SAM_GRAPH_DATA_SIZE",Lists.appLogs.get("SAM GRAPH DATA SIZE"));

        return logs;
    }

*/

}
