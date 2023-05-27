package com.tcs.lists;

import com.tcs.commons.CommonFunctions;
import com.tcs.model.AtlasBoardView;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PopulateAtlasList {

    public void jsongenerate(String loc) {
        ArrayList<AtlasBoardView> localList;

        switch (loc) {
            case "SYD":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("SYD"));
                Lists.sydijson = CommonFunctions.jsongeneration(localList).toJSONString();
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("SYDD"));
                Lists.sydjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "MEL":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("MELD"));
                Lists.meljson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "BNE":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("BNED"));
                Lists.bnejson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "PER":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("PERD"));
                Lists.perjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "ADL":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("ADLD"));
                Lists.adljson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "ASP":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("ASPD"));
                Lists.aspjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "DRW":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("DRWD"));
                Lists.drwjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "TSV":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("TSVD"));
                Lists.tsvjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "CNS":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("CNSD"));
                Lists.cnsjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "CBR":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("CBRD"));
                Lists.cbrjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "LAX":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("LAXD"));
                Lists.laxjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "AKL":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("AKLD"));
                Lists.akljson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "WLG":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("WLGD"));
                Lists.wlgjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "CHC":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("CHCD"));
                Lists.chcjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "ZQN":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("ZQND"));
                Lists.zqnjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
            case "SIN":
                localList = new ArrayList<>(Lists.AtlasBoardViewList.get("SIND"));
                Lists.sinjson = CommonFunctions.jsongeneration(localList).toJSONString();
                break;
        }
    }
}
