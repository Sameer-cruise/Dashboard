package com.tcs.controller;

import com.tcs.lists.Lists;
import com.tcs.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/Dashboard/LMODashboard")
public class RestController {

    private static final DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd-MMM-yy");
    LocalDate todayDate = null;


    //Workload Dashboard: For Non-Australian Ports
    @RequestMapping(value = "/Graph", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CommitWP> returnGraphData(@RequestParam(value = "loc") String loc) {
        List<CommitWP> commitWPs = Lists.commitWPList.stream().filter(wp -> wp.getWpLocation().equalsIgnoreCase(loc + "/LINE"))
                .collect(Collectors.toList());

        if (commitWPs.size() > 0) {
            if ((!loc.equalsIgnoreCase("LAX")) && (!loc.equalsIgnoreCase("SFO"))) {
                if (commitWPs.size() == 1) {
                    try {
                        todayDate = LocalDate.parse(commitWPs.get(0).getWpStartDate(), sdf);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    CommitWP dummyWP = new CommitWP("", todayDate.plusDays(1).format(sdf).toUpperCase(), "", 0, 0, 0, 0, 0);
                    commitWPs.add(dummyWP);
                }
                return commitWPs;
            } else {
                if (commitWPs.size() != 4) {
                    try {
                        todayDate = LocalDate.parse(commitWPs.get(0).getWpStartDate(), sdf);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 4; i++) {
                        try {
                            if (commitWPs.get(i).getWpStartDate().equalsIgnoreCase(todayDate.plusDays(i).format(sdf))) {
                                continue;
                            } else {
                                CommitWP dummyWP = new CommitWP("", todayDate.plusDays(i).format(sdf).toUpperCase(), "", 0, 0, 0, 0, 0);
                                commitWPs.add(i, dummyWP); //add at the specific position only
                            }
                        } catch (Exception e) {
                            CommitWP dummyWP = new CommitWP("", todayDate.plusDays(i).format(sdf).toUpperCase().toUpperCase(), "", 0, 0, 0, 0, 0);
                            commitWPs.add(dummyWP);
                        }
                    }

                }
                return commitWPs;
            }
        } else {
            if ((!loc.equalsIgnoreCase("LAX")) && (!loc.equalsIgnoreCase("SFO"))) {
                for (int i = 0; i < 2; i++) {
                    String dayStr = LocalDate.now().plusDays(i).format(DateTimeFormatter.ofPattern("d-MMM-YY")).toUpperCase();
                    CommitWP dummyWP = new CommitWP("", dayStr, "", 0, 0, 0, 0, 0);
                    commitWPs.add(dummyWP);
                }
            } else {
                for (int i = 0; i < 4; i++) {
                    String dayStr = LocalDate.now().plusDays(i).format(DateTimeFormatter.ofPattern("d-MMM-YY")).toUpperCase();
                    CommitWP dummyWP = new CommitWP("", dayStr, "", 0, 0, 0, 0, 0);
                    commitWPs.add(dummyWP);
                }
            }
            return commitWPs;
        }
    }

    //Workload Dashboard: For Australian Ports
    @RequestMapping(value = "/GraphAustralian", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CommitWPAustralianPorts> returnGraphDataFLMODashboardorAustralianPorts(@RequestParam(value = "loc") String loc) {
        return Lists.commitWPListAustralianPorts.stream().filter(wp -> wp.getWpLocation().equalsIgnoreCase(loc + "/LINE"))
                .collect(Collectors.toList());
    }

    //Workload Dashboard: Drilled down data for both Australian and Non-Australian Ports
    @RequestMapping(value = "/GraphDrill", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CommitWPDrill> commitWPDrills(@RequestParam(value = "loc") String loc) {
//        System.out.println("-=-=-=-=-=-=-=-=-=-=-"+Lists.commitWPDrillList.size()+"-=-==-=-=-===-=-");
        return Lists.commitWPDrillList.stream().filter(wp -> wp.getWpLocation().equalsIgnoreCase(loc + "/LINE"))
                .collect(Collectors.toList());
    }

    //Workload Dashboard: SIM Dashboard Data
    @RequestMapping(value = "/LocationsSam", produces = {"application/json"})
    @ResponseBody
    public List<CommitWPSam> CommitWPSam() {
        List<SamMOUHours> SamMOUHoursList = Lists.samMouHrsArrayList;
        Collections.sort(SamMOUHoursList, new Comparator<SamMOUHours>() {
            public int compare(SamMOUHours p1, SamMOUHours p2) {
                return p1.getCheckGroup().compareTo(p2.getCheckGroup());
            }
        });
        List<CommitWPSam> CommitWPSamList = new ArrayList<>();
        for (SamMOUHours mou : SamMOUHoursList) {
            List<CommitWPSam> commitWPSamList = Lists.commitWPSamList
                    .stream()
                    .filter(s -> s.getLoc().equalsIgnoreCase(mou.getLocation()) && s.getAssembly().equalsIgnoreCase(mou.getAssembly()) && s.getDayOfWeek().equalsIgnoreCase(mou.getDay()) && s.getCheckGroup().equalsIgnoreCase((mou.getCheckGroup())))
                    .collect(Collectors.toList());
            if (commitWPSamList.size() > 0) {
                if (commitWPSamList.get(0).getSchedHR() != 0 || commitWPSamList.get(0).getMouHR() != 0) {
                    CommitWPSamList.add(commitWPSamList.get(0));
                }
            } else {
                LocalDate ld = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.DATE));
                DayOfWeek dayofweek = DayOfWeek.MONDAY;
                if (mou.getDay().equalsIgnoreCase("MON")) {
                    dayofweek = DayOfWeek.MONDAY;
                } else if (mou.getDay().equalsIgnoreCase("TUE")) {
                    dayofweek = DayOfWeek.TUESDAY;
                } else if (mou.getDay().equalsIgnoreCase("WED")) {
                    dayofweek = DayOfWeek.WEDNESDAY;
                } else if (mou.getDay().equalsIgnoreCase("THU")) {
                    dayofweek = DayOfWeek.THURSDAY;
                } else if (mou.getDay().equalsIgnoreCase("FRI")) {
                    dayofweek = DayOfWeek.FRIDAY;
                } else if (mou.getDay().equalsIgnoreCase("SAT")) {
                    dayofweek = DayOfWeek.SATURDAY;
                } else if (mou.getDay().equalsIgnoreCase("SUN")) {
                    dayofweek = DayOfWeek.SUNDAY;
                }
                ld = ld.with(TemporalAdjusters.nextOrSame(dayofweek));
                String mouDate = ld.format(DateTimeFormatter.ofPattern("dd-MMM-yy")).toUpperCase();
                if (mou.getHrs() != 0) {
                    CommitWPSam dummyWP = new CommitWPSam(mou.getCheckGroup(), mou.getDay(), mouDate, mou.getAssembly(), mou.getLocation(), mou.getHrs(), 0, 0, 0, 0, 0);
                    CommitWPSamList.add(dummyWP);
                }
            }
        }
        Collections.sort(CommitWPSamList, new Comparator<CommitWPSam>() {
            public int compare(CommitWPSam p1, CommitWPSam p2) {
                int i = 0;
                try {
                    i = Long.valueOf(new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse(p1.getDateValue()).getTime()).compareTo(new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse(p2.getDateValue()).getTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return i;
            }
        });
        return CommitWPSamList;
    }

    //Workload Dashboard: SIM Dashboard drilled down data for individual day
    @RequestMapping(value = "/LocationsSamDetail", produces = {"application/json"})
    @ResponseBody
    public List<CommitWPSamDetail> CommitWPSamDetail() {
        return Lists.commitWPSamListDetail.stream().collect(Collectors.toList());
    }

    //LMO Dashboard: This has been added to extract the work package information out for the work package widget
    @RequestMapping(value = "/wpData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QueryViewData> wpdata(@RequestParam(value = "loc") String loc) {
        if (loc.equalsIgnoreCase("SYDI")) {
            return Lists.wpListData.stream().filter(wp -> wp.getLoc().equalsIgnoreCase("SYD") && wp.getIndicate().equalsIgnoreCase("I"))
                    .collect(Collectors.toList());
        } else if (loc.equalsIgnoreCase("SYD")) {
            return Lists.wpListData.stream().filter(wp -> wp.getLoc().equalsIgnoreCase("SYD") && wp.getIndicate().equalsIgnoreCase("D"))
                    .collect(Collectors.toList());
        } else {
            return Lists.wpListData.stream().filter(wp -> wp.getLoc().equalsIgnoreCase(loc))
                    .collect(Collectors.toList());
        }
    }

    //LMO Dashboard: Locations Data
    @RequestMapping("/Locations")
    public String returndata(@RequestParam(value = "loc") String loc) {
        if (loc.equals("ADL")) {
            return Lists.adljson;
        } else if (loc.equals("ASP")) {
            return Lists.aspjson;
        } else if (loc.equals("DRW")) {
            return Lists.drwjson;
        } else if (loc.equals("TSV")) {
            return Lists.tsvjson;
        } else if (loc.equals("CNS")) {
            return Lists.cnsjson;
        } else if (loc.equals("CBR")) {
            return Lists.cbrjson;
        } else if (loc.equals("LAX")) {
            return Lists.laxjson;
        } else if (loc.equals("SYD")) {
            return Lists.sydjson;
        } else if (loc.equals("MEL")) {
            return Lists.meljson;
        } else if (loc.equals("BNE")) {
            return Lists.bnejson;
        } else if (loc.equals("PER")) {
            return Lists.perjson;
        } else if (loc.equals("SYDI")) {
            return Lists.sydijson;
        } else if (loc.equals("AKL")) {
            return Lists.akljson;
        } else if (loc.equals("CHC")) {
            return Lists.chcjson;
        } else if (loc.equals("WLG")) {
            return Lists.wlgjson;
        } else if (loc.equals("SIN")) {
            return Lists.sinjson;
        } else if (loc.equals("ZQN")) {
            return Lists.zqnjson;
        }

        return null;
    }

    //LMO Dashboard: Timings details
    @RequestMapping("/Timings")
    public String times() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return "Snapshot At :" + Lists.currentRun + " UTC," + "Next Refresh At :" + Lists.nextRun + " UTC";
    }
}
