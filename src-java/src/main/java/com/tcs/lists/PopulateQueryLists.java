package com.tcs.lists;

import com.tcs.Application;
import com.tcs.model.GlobalView;
import com.tcs.model.QueryView;
import com.tcs.model.QueryViewData;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Component
public class PopulateQueryLists {

    public void querylists(List<Map<String, Object>> rows) {
        SimpleDateFormat form = new SimpleDateFormat("dd-MMM-yy HH:mm");
        Lists.workpackageList.clear();
        Lists.MelDataList.clear();
        Lists.wpList.clear();

        Application.logger.info("Entering the PopulateQueryLists");

        for (Map row : rows) {
            QueryView qv = new QueryView();
            GlobalView gv = new GlobalView();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
            gv.setDue_date((String) row.get("DUE_DATE"));
            qv.setLoc((String) row.get("LOC"));
            gv.setMel_cnt((String) row.get("MEL_CNT"));
            qv.setRego((String) row.get("REGO"));
            gv.setGrego((String) row.get("REGO"));
            qv.setMxflight((String) row.get("MX_FLIGHT")); //Added to get the flight to be compared
            qv.setStatus((String) row.get("STATUS"));
            qv.setWp((String) row.get("WP"));
            try {
                qv.setWp_start(sdf.parse((String) row.get("WP_START")));
                qv.setWp_end(sdf.parse((String) row.get("WP_END")));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            qv.setWp_loc((String) row.get("WP_LOC"));
            qv.setLocal_wp_start((String) row.get("LOCAL_WP_START")); //Added the data here
            qv.setIndicate((String) row.get("INDICATE"));
            qv.seteLogBookCap((BigDecimal) row.get("ELOG_CAP"));

            try {
                Lists.wpList.add(new QueryViewData((String) row.get("REGO"), (String) row.get("WP"),
                        ((String) row.get("LOCAL_WP_START")).toUpperCase(), sdf.parse((String) row.get("WP_START")),
                        (String) row.get("STATUS"), (String) row.get("LOC"), (String) row.get("INDICATE"), (BigDecimal) row.get("ELOG_CAP")));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Lists.workpackageList.put(row.get("LOC").toString().toUpperCase(), qv);
            Lists.MelDataList.put(row.get("REGO").toString(), gv); // added the values for the global view
        }
        Lists.wpListData.clear();
        Lists.wpListData.addAll(Lists.wpList);
    }
}

