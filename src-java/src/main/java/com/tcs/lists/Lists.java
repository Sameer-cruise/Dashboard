package com.tcs.lists;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.tcs.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class Lists {

    public static String currentRun;

    public static String nextRun;

    public static String apuurl;

    public static String append;

    public static String auth;

    public static Multimap<String, QueryView> workpackageList = ArrayListMultimap.create();

    public static Multimap<String, GlobalView> MelDataList = HashMultimap.create();

    public static Multimap<String, OpsView> flightList = ArrayListMultimap.create();

    public static Multimap<String, AtlasBoardView> AtlasBoardViewList = ArrayListMultimap.create();

    public static LocalDateTime localDateTime;

    public static List<MOUHours> mouHoursArrayList = new ArrayList<>();

    public static List<CommitWP> commitWPList = new ArrayList<>();

    public static List<MOUHoursAustralianPorts> mouHoursArrayListAustralianPorts = new ArrayList<>();

    public static List<CommitWPAustralianPorts> commitWPListAustralianPorts = new ArrayList<>();

    public static List<QueryViewData> wpList = new ArrayList<>();  //each and every wp value is added here

    public static List<QueryViewData> wpListData = new ArrayList<>(); //used by the rest service

    public static List<CommitWPSam> commitWPSamList = new ArrayList<>();

    public static List<CommitWPSamDetail> commitWPSamListDetail = new ArrayList<>();

    public static List<SamMOUHours> samMouHrsArrayList = new ArrayList<>();

    public static List<CommitWPDrill> commitWPDrillList = new ArrayList<>();

    public static Map<String, String> appLogs = new LinkedHashMap<String, String>();

    public static List<ElogBookRego> eLogBookRegos = new ArrayList<>();

    public static List<String> eLogBookRegosString = new ArrayList<>();

    public static String sydjson = null;
    public static String sydijson = null;
    public static String perjson = null;
    public static String perijson = null;
    public static String bnejson = null;
    public static String bneijson = null;
    public static String meljson = null;
    public static String melijson = null;
    public static String adljson = null;
    public static String aspjson = null;
    public static String drwjson = null;
    public static String tsvjson = null;
    public static String cnsjson = null;
    public static String cbrjson = null;
    public static String laxjson = null;
    public static String akljson = null;
    public static String chcjson = null;
    public static String wlgjson = null;
    public static String sinjson = null;
    public static String zqnjson = null;

}
