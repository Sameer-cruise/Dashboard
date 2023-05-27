package com.tcs.model;

import java.util.Date;

/**
 * Created by 547885 on 11/10/2015.
 */
public class SummaryVO {

        private String rego;
        private String aircraftType;
        private String owner;
        private String arrivalFlightNo;
        private String arrivingFromPort;
        private Date arrivalDate;
        private Date scheduleArrivalDate;
        private Date scheduleArrivalDateUTC;
        private Date arrivingFromPortOriginDate;
        private Date departureLegOriginDate;
        private String arivingToPort;
        private Date arrivalTime;
        private String station;
        private String departingFlightNo;
        private String departingToPort;
        private String arrivalSectorUnscheduledPort;
        private String departureSectorUnscheduledPort;
        private Date departureTime;
        /**
         * Schedule Local Departure date of departure leg
         */
        private Date departureDate;
        private String arrivalFlightStatus;
        /**
         * Aircraft Event Status
         */
        private String eventStatus;
        /**
         * Form Event status
         */
        private String formEventStatus;
        private String lastComment;
        private Date lastCommentTime;
        private String eventOwner;
        private String eventOwnerName;
        private String eventCoordinator;
        private String eventCoordinatorName;
        private int arrivalLegSequent;

        private Date arrivalLegScheduleArrivalDateLocal;
        private Date arrivalLegScheduleArrivalDateUTC;

        private Date arrivalLegScheduleDepartureDateLocal;
        private Date arrivalLegScheduleDepartureDateUTC;

        private Date arrivalLegActualArrivalDateLocal;
        private Date arrivalLegActualArrivalDateUTC;

        private Date arrivalLegActualDepartureDateLocal;
        private Date arrivalLegActualDepartureDateUTC;


        private Date arrivalLegWheelsOnDateLocal;
        private Date arrivalLegWheelsOnDateUTC;

        private int departureLegSequent;
        private String eventCoordinatorNameTwo;

        private Date departureLegBoradingDate;
        /**
         * This departureLegBlocksOffDateUTC is used for estimate departure and actual departure date of departure leg
         */
        private Date departureLegBlocksOffDateUTC;
        /**
         * Estimate and actual Departure date Local
         */
        private Date departureLegBlocksOffDateLocal;

        private Date departureLegWheelsOffDateUTC;
        private Date departureLegWheelsOffDateLocal;

        private Date departureLegScheduleDepartureDateUTC;
        private Date departureLegScheduleDepartureDateLocal;

        private Date departureLegArrivalDateUTC;
        private Date departureLegWheelsOnDateUTC;
        private Date departureLegWheelsOnDateLocal;

        private boolean departureLegScedhuledDelaypositive;
        private boolean departureLegActualDelaypositive;
        private boolean aircraftIsOnPTS;
        private Date departureLegSchedArrDateUTC;
        private Date departureLegSchedArrDateLocal;

        private Date departureLegEstdArrvDateUTC;
        private Date departureLegEstdArrvDateLocal;

        private Date departureLegActArrvDateUTC;
        private Date departureLegActArrvDateLocal;

        private String departureLegPlannedDelay;
        private String departureLegActualDelay;
        private String departureLegBoardingStatus;
        private String departureLegConfigs;
        private double groundTime;
        private String arrivalLegGroundTime;
        private String departureLegGroundTime;
        private int arrivalLegActualGroundTimeMinutes;
        private boolean ownerCheck;
        private boolean coordinatorCheck;
        private Integer eventId;
        private String userWithLastComment;
        private String arrivalGate;
        private String departureGate;
        private String arrivalStatus;
        private String departureStatus;
        private String departureFlightStatus;
        private String domIntReg;
        private String flightStatus;
        private String ptsStatus;
        private String ptsTime;
        private String region;
        private Date utcArrivalTime;
        /**
         ScheduleDepartureDateofDepartureLeg
         *
         */
        private Date utcDepartureTime;
        private Date utcPTSTime;
        private int statusId;
        private String statusAlert;
        private double arrSector;
        private double currentRecord;
        private String departureLegDepartureDelayMin;
        private String departureLegForcastedDelayMin;
        private Integer delayReportEventId;
        private Integer delayReportEventStatusID;
        private String delayReportStatusName;
        private Integer iocEventEventId;
        private Integer iocEventEventStatusID;
        private String iocEventEventStatusName;
        private Integer iocCallEventId;
        private Integer iocCallEventStatusID;
        private String iocCallEventStatusName;
        private Integer iocCrewEventId;
        private Integer iocCrewEventStatusID;
        private String iocCrewEventStatusName;
        private Integer iocWheatherEventId;
        private Integer iocWheatherEventStatusID;
        private String iocWheatherEventStatusName;
        private String iocWheatherEventPort;
        private Integer iocDelayEventId;
        private Integer iocDelayEventStatusID;
        private String iocDelayEventStatusName;
        private Integer iocFppEventId;
        private String iocEventEventCount;
        private String iocCallEventCount;
        private String iocCrewEventCount;
        private String iocWheatherEventCount;
        private String iocDelayEventCount;
        private String iocFppEventCount;
        private String subEventName;
        private String arrivalLegDisruption;
        private String departureLegDisruption;
        private Integer iocFppEventStatusID;
        private String iocFppEventStatusName;
        boolean eventOld;
        private String opsCommentSummary;
        private Date opsETSDate;
        private String hangLocation;
        private boolean logisticBool;
        private String eventSubTypeCd;
        private Integer rowCount;
        private String etsDate;
        private Integer etsHour;
        private Integer etsMin;
        private String commentSummary;
        private Integer histBool;
        private String flightNumber;
        private String eventCategoryCd;
        private Integer flightId;
        private String eventCondition;
        private String paxCount;
        //private DelayReportFormVO delayReportFormVO;

        public Integer getIocEventEventStatusID() {
            return iocEventEventStatusID;
        }

        public void setIocEventEventStatusID(Integer iocEventEventStatusID) {
            this.iocEventEventStatusID = iocEventEventStatusID;
        }
        public Date getArrivalLegScheduleDepartureDateLocal() {
            return arrivalLegScheduleDepartureDateLocal;
        }

        public void setArrivalLegScheduleDepartureDateLocal(
                Date arrivalLegScheduleDepartureDateLocal) {
            this.arrivalLegScheduleDepartureDateLocal = arrivalLegScheduleDepartureDateLocal;
        }

        public Date getArrivalLegScheduleDepartureDateUTC() {
            return arrivalLegScheduleDepartureDateUTC;
        }

        public void setArrivalLegScheduleDepartureDateUTC(
                Date arrivalLegScheduleDepartureDateUTC) {
            this.arrivalLegScheduleDepartureDateUTC = arrivalLegScheduleDepartureDateUTC;
        }

        public Date getArrivalLegActualDepartureDateLocal() {
            return arrivalLegActualDepartureDateLocal;
        }

        public void setArrivalLegActualDepartureDateLocal(
                Date arrivalLegActualDepartureDateLocal) {
            this.arrivalLegActualDepartureDateLocal = arrivalLegActualDepartureDateLocal;
        }

        public Date getArrivalLegActualDepartureDateUTC() {
            return arrivalLegActualDepartureDateUTC;
        }

        public void setArrivalLegActualDepartureDateUTC(
                Date arrivalLegActualDepartureDateUTC) {
            this.arrivalLegActualDepartureDateUTC = arrivalLegActualDepartureDateUTC;
        }

        public String getIocEventEventStatusName() {
            return iocEventEventStatusName;
        }

        public void setIocEventEventStatusName(String iocEventEventStatusName) {
            this.iocEventEventStatusName = iocEventEventStatusName;
        }

        public Integer getIocCallEventStatusID() {
            return iocCallEventStatusID;
        }

        public Date getArrivalLegScheduleArrivalDateUTC() {
            return arrivalLegScheduleArrivalDateUTC;
        }

        public void setArrivalLegScheduleArrivalDateUTC(
                Date arrivalLegScheduleArrivalDateUTC) {
            this.arrivalLegScheduleArrivalDateUTC = arrivalLegScheduleArrivalDateUTC;
        }

        public Date getArrivalLegActualArrivalDateLocal() {
            return arrivalLegActualArrivalDateLocal;
        }

        public void setArrivalLegActualArrivalDateLocal(
                Date arrivalLegActualArrivalDateLocal) {
            this.arrivalLegActualArrivalDateLocal = arrivalLegActualArrivalDateLocal;
        }

        public Date getArrivalLegActualArrivalDateUTC() {
            return arrivalLegActualArrivalDateUTC;
        }

        public void setArrivalLegActualArrivalDateUTC(
                Date arrivalLegActualArrivalDateUTC) {
            this.arrivalLegActualArrivalDateUTC = arrivalLegActualArrivalDateUTC;
        }

        public Date getArrivalLegWheelsOnDateLocal() {
            return arrivalLegWheelsOnDateLocal;
        }

        public void setArrivalLegWheelsOnDateLocal(Date arrivalLegWheelsOnDateLocal) {
            this.arrivalLegWheelsOnDateLocal = arrivalLegWheelsOnDateLocal;
        }

        public Date getArrivalLegWheelsOnDateUTC() {
            return arrivalLegWheelsOnDateUTC;
        }

        public void setArrivalLegWheelsOnDateUTC(Date arrivalLegWheelsOnDateUTC) {
            this.arrivalLegWheelsOnDateUTC = arrivalLegWheelsOnDateUTC;
        }

        public void setIocCallEventStatusID(Integer iocCallEventStatusID) {
            this.iocCallEventStatusID = iocCallEventStatusID;
        }

        public String getIocCallEventStatusName() {
            return iocCallEventStatusName;
        }

        public void setIocCallEventStatusName(String iocCallEventStatusName) {
            this.iocCallEventStatusName = iocCallEventStatusName;
        }

        public Integer getIocCrewEventStatusID() {
            return iocCrewEventStatusID;
        }

        public void setIocCrewEventStatusID(Integer iocCrewEventStatusID) {
            this.iocCrewEventStatusID = iocCrewEventStatusID;
        }

        public String getIocCrewEventStatusName() {
            return iocCrewEventStatusName;
        }

        public void setIocCrewEventStatusName(String iocCrewEventStatusName) {
            this.iocCrewEventStatusName = iocCrewEventStatusName;
        }

        public Integer getIocWheatherEventStatusID() {
            return iocWheatherEventStatusID;
        }

        public void setIocWheatherEventStatusID(Integer iocWheatherEventStatusID) {
            this.iocWheatherEventStatusID = iocWheatherEventStatusID;
        }

        public String getIocWheatherEventStatusName() {
            return iocWheatherEventStatusName;
        }

        public void setIocWheatherEventStatusName(String iocWheatherEventStatusName) {
            this.iocWheatherEventStatusName = iocWheatherEventStatusName;
        }

        public Integer getIocDelayEventStatusID() {
            return iocDelayEventStatusID;
        }

        public void setIocDelayEventStatusID(Integer iocDelayEventStatusID) {
            this.iocDelayEventStatusID = iocDelayEventStatusID;
        }

        public String getIocDelayEventStatusName() {
            return iocDelayEventStatusName;
        }

        public void setIocDelayEventStatusName(String iocDelayEventStatusName) {
            this.iocDelayEventStatusName = iocDelayEventStatusName;
        }

        public Integer getIocFppEventStatusID() {
            return iocFppEventStatusID;
        }

        public void setIocFppEventStatusID(Integer iocFppEventStatusID) {
            this.iocFppEventStatusID = iocFppEventStatusID;
        }

        public String getIocFppEventStatusName() {
            return iocFppEventStatusName;
        }

        public void setIocFppEventStatusName(String iocFppEventStatusName) {
            this.iocFppEventStatusName = iocFppEventStatusName;
        }

        public String getCommentSummary() {
            return commentSummary;
        }

        public void setCommentSummary(String commentSummary) {
            this.commentSummary = commentSummary;
        }

        public String getHangLocation() {
            return hangLocation;
        }

        public void setHangLocation(String hangLocation) {
            this.hangLocation = hangLocation;
        }

        public boolean getLogisticBool() {
            return logisticBool;
        }

        public void setLogisticBool(boolean logisticBool) {
            this.logisticBool = logisticBool;
        }

        public String getEventCoordinatorNameTwo() {
            return eventCoordinatorNameTwo;
        }

        public void setEventCoordinatorNameTwo(String eventCoordinatorNameTwo) {
            this.eventCoordinatorNameTwo = eventCoordinatorNameTwo;
        }

        public Integer getIocEventEventId() {
            return iocEventEventId;
        }

        public void setIocEventEventId(Integer iocEventEventId) {
            this.iocEventEventId = iocEventEventId;
        }

        public Integer getIocCallEventId() {
            return iocCallEventId;
        }

        public void setIocCallEventId(Integer iocCallEventId) {
            this.iocCallEventId = iocCallEventId;
        }

        public Integer getIocCrewEventId() {
            return iocCrewEventId;
        }

        public void setIocCrewEventId(Integer iocCrewEventId) {
            this.iocCrewEventId = iocCrewEventId;
        }

        public Integer getIocWheatherEventId() {
            return iocWheatherEventId;
        }

        public void setIocWheatherEventId(Integer iocWheatherEventId) {
            this.iocWheatherEventId = iocWheatherEventId;
        }

        public Integer getIocDelayEventId() {
            return iocDelayEventId;
        }

        public void setIocDelayEventId(Integer iocDelayEventId) {
            this.iocDelayEventId = iocDelayEventId;
        }

        public Integer getIocFppEventId() {
            return iocFppEventId;
        }

        public void setIocFppEventId(Integer iocFppEventId) {
            this.iocFppEventId = iocFppEventId;
        }

        public String getStatusAlert() {
            return statusAlert;
        }

        public String getRego() {
            return rego;
        }

        public void setRego(String rego) {
            this.rego = rego;
        }

        public String getAircraftType() {
            return aircraftType;
        }

        public void setAircraftType(String aircraftType) {
            this.aircraftType = aircraftType;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public String getArrivalFlightStatus() {
            return arrivalFlightStatus;
        }

        public void setArrivalFlightStatus(String arrivalFlightStatus) {
            this.arrivalFlightStatus = arrivalFlightStatus;
        }

        public String getEventStatus() {
            return eventStatus;
        }

        public void setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
        }

        public String getLastComment() {
            return lastComment;
        }

        public void setLastComment(String lastComment) {
            this.lastComment = lastComment;
        }

        public String getEventOwner() {
            return eventOwner;
        }

        public void setEventOwner(String eventOwner) {
            this.eventOwner = eventOwner;
        }

        public String getEventCoordinator() {
            return eventCoordinator;
        }

        public void setEventCoordinator(String eventCoordinator) {
            this.eventCoordinator = eventCoordinator;
        }

        public Date getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(Date departureTime) {
            this.departureTime = departureTime;
        }

        public void setArrivalTime(Date arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public Date getArrivalTime() {
            return arrivalTime;
        }

        public String getDepartingToPort() {
            return departingToPort;
        }

        public void setDepartingToPort(String departingToPort) {
            this.departingToPort = departingToPort;
        }

        public String getDepartingFlightNo() {
            return departingFlightNo;
        }

        public void setDepartingFlightNo(String departingFlightNo) {
            this.departingFlightNo = departingFlightNo;
        }

        public String getStation() {
            return station;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public String getArrivingFromPort() {
            return arrivingFromPort;
        }

        public void setArrivingFromPort(String arrivingFromPort) {
            this.arrivingFromPort = arrivingFromPort;
        }

        public String getArrivalFlightNo() {
            return arrivalFlightNo;
        }

        public void setArrivalFlightNo(String arrivalFlightNo) {
            this.arrivalFlightNo = arrivalFlightNo;
        }

        public boolean isOwnerCheck() {
            return ownerCheck;
        }

        public void setOwnerCheck(boolean ownerCheck) {
            this.ownerCheck = ownerCheck;
        }

        public double getGroundTime() {
            return groundTime;
        }

        public void setGroundTime(double groundTime) {
            this.groundTime = groundTime;
        }

        public String getEventOwnerName() {
            return eventOwnerName;
        }

        public void setEventOwnerName(String eventOwnerName) {
            this.eventOwnerName = eventOwnerName;
        }

        public String getEventCoordinatorName() {
            return eventCoordinatorName;
        }

        public void setEventCoordinatorName(String eventCoordinatorName) {
            this.eventCoordinatorName = eventCoordinatorName;
        }

        public boolean isCoordinatorCheck() {
            return coordinatorCheck;
        }

        public void setCoordinatorCheck(boolean coordinatorCheck) {
            this.coordinatorCheck = coordinatorCheck;
        }

        public String getUserWithLastComment() {
            return userWithLastComment;
        }

        public void setUserWithLastComment(String userWithLastComment) {
            this.userWithLastComment = userWithLastComment;
        }

        public String getArrivalGate() {
            return arrivalGate;
        }

        public void setArrivalGate(String arrivalGate) {
            this.arrivalGate = arrivalGate;
        }

        public String getDepartureGate() {
            return departureGate;
        }

        public void setDepartureGate(String departureGate) {
            this.departureGate = departureGate;
        }

        public String getArrivalStatus() {
            return arrivalStatus;
        }

        public void setArrivalStatus(String arrivalStatus) {
            this.arrivalStatus = arrivalStatus;
        }

        public String getDepartureStatus() {
            return departureStatus;
        }

        public void setDepartureStatus(String departureStatus) {
            this.departureStatus = departureStatus;
        }

        public String getDepartureFlightStatus() {
            return departureFlightStatus;
        }

        public void setDepartureFlightStatus(String departureFlightStatus) {
            this.departureFlightStatus = departureFlightStatus;
        }

        public String getFlightStatus() {
            return flightStatus;
        }

        public void setFlightStatus(String flightStatus) {
            this.flightStatus = flightStatus;
        }

        public String getPtsStatus() {
            return ptsStatus;
        }

        public void setPtsStatus(String ptsStatus) {
            this.ptsStatus = ptsStatus;
        }

        public String getPtsTime() {
            return ptsTime;
        }

        public void setPtsTime(String ptsTime) {
            this.ptsTime = ptsTime;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getDomIntReg() {
            return domIntReg;
        }

        public void setDomIntReg(String domIntReg) {
            this.domIntReg = domIntReg;
        }

        public Date getArrivalDate() {
            return arrivalDate;
        }

        public void setArrivalDate(Date arrivalDate) {
            this.arrivalDate = arrivalDate;
        }

        public Date getDepartureDate() {
            return departureDate;
        }

        public void setDepartureDate(Date departureDate) {
            this.departureDate = departureDate;
        }

        public Date getUtcArrivalTime() {
            return utcArrivalTime;
        }

        public void setUtcArrivalTime(Date utcArrivalTime) {
            this.utcArrivalTime = utcArrivalTime;
        }

        public Date getUtcDepartureTime() {
            return utcDepartureTime;
        }

        public void setUtcDepartureTime(Date utcDepartureTime) {
            this.utcDepartureTime = utcDepartureTime;
        }

        public Integer getEventId() {
            return eventId;
        }

        public void setEventId(Integer eventId) {
            this.eventId = eventId;
        }

        public Date getLastCommentTime() {
            return lastCommentTime;
        }

        public void setLastCommentTime(Date lastCommentTime) {
            this.lastCommentTime = lastCommentTime;
        }

        public int getStatusId() {
            return statusId;
        }

        public void setStatusId(int statusId) {
            this.statusId = statusId;
        }

        public double getArrSector() {
            return arrSector;
        }

        public void setArrSector(double arrSector) {
            this.arrSector = arrSector;
        }

        public double getCurrentRecord() {
            return currentRecord;
        }

        public void setCurrentRecord(double currentRecord) {
            this.currentRecord = currentRecord;
        }

        public Date getScheduleArrivalDate() {
            return scheduleArrivalDate;
        }

        public void setScheduleArrivalDate(Date scheduleArrivalDate) {
            this.scheduleArrivalDate = scheduleArrivalDate;
        }

        public Date getScheduleArrivalDateUTC() {
            return scheduleArrivalDateUTC;
        }

        public void setScheduleArrivalDateUTC(Date scheduleArrivalDateUTC) {
            this.scheduleArrivalDateUTC = scheduleArrivalDateUTC;
        }

        public Date getArrivingFromPortOriginDate() {
            return arrivingFromPortOriginDate;
        }

        public void setArrivingFromPortOriginDate(Date arrivingFromPortOriginDate) {
            this.arrivingFromPortOriginDate = arrivingFromPortOriginDate;
        }

        public String getArrivalSectorUnscheduledPort() {
            return arrivalSectorUnscheduledPort;
        }

        public void setArrivalSectorUnscheduledPort(
                String arrivalSectorUnscheduledPort) {
            this.arrivalSectorUnscheduledPort = arrivalSectorUnscheduledPort;
        }

        public String getDepartureSectorUnscheduledPort() {
            return departureSectorUnscheduledPort;
        }

        public void setDepartureSectorUnscheduledPort(
                String departureSectorUnscheduledPort) {
            this.departureSectorUnscheduledPort = departureSectorUnscheduledPort;
        }

        public String getArivingToPort() {
            return arivingToPort;
        }

        public void setArivingToPort(String arivingToPort) {
            this.arivingToPort = arivingToPort;
        }

        public int getArrivalLegSequent() {
            return arrivalLegSequent;
        }

        public void setArrivalLegSequent(int arrivalLegSequent) {
            this.arrivalLegSequent = arrivalLegSequent;
        }

        public int getDepartureLegSequent() {
            return departureLegSequent;
        }

        public void setDepartureLegSequent(int departureLegSequent) {
            this.departureLegSequent = departureLegSequent;
        }

        public String getSubEventName() {
            return subEventName;
        }

        public void setSubEventName(String subEventName) {
            this.subEventName = subEventName;
        }

        public Date getDepartureLegOriginDate() {
            return departureLegOriginDate;
        }

        public void setDepartureLegOriginDate(Date departureLegOriginDate) {
            this.departureLegOriginDate = departureLegOriginDate;
        }

        public Integer getRowCount() {
            return rowCount;
        }

        public void setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
        }

        public String getEtsDate() {
            return etsDate;
        }

        public void setEtsDate(String etsDate) {
            this.etsDate = etsDate;
        }

        public Integer getEtsHour() {
            return etsHour;
        }

        public void setEtsHour(Integer etsHour) {
            this.etsHour = etsHour;
        }

        public Integer getEtsMin() {
            return etsMin;
        }

        public void setEtsMin(Integer etsMin) {
            this.etsMin = etsMin;
        }

        public Integer getHistBool() {
            return histBool;
        }

        public void setHistBool(Integer histBool) {
            this.histBool = histBool;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getEventCategoryCd() {
            return eventCategoryCd;
        }

        public void setEventCategoryCd(String eventCategoryCd) {
            this.eventCategoryCd = eventCategoryCd;
        }

        public Integer getFlightId() {
            return flightId;
        }

        public void setFlightId(Integer flightId) {
            this.flightId = flightId;
        }

        public String getEventSubTypeCd() {
            return eventSubTypeCd;
        }

        public void setEventSubTypeCd(String eventSubTypeCd) {
            this.eventSubTypeCd = eventSubTypeCd;
        }

        public String getEventCondition() {
            return eventCondition;
        }

        public void setEventCondition(String eventCondition) {
            this.eventCondition = eventCondition;
        }

        public String getPaxCount() {
            return paxCount;
        }

        public void setPaxCount(String paxCount) {
            this.paxCount = paxCount;
        }

        public String getIocEventEventCount() {
            return iocEventEventCount;
        }

        public void setIocEventEventCount(String iocEventEventCount) {
            this.iocEventEventCount = iocEventEventCount;
        }

        public String getIocCallEventCount() {
            return iocCallEventCount;
        }

        public void setIocCallEventCount(String iocCallEventCount) {
            this.iocCallEventCount = iocCallEventCount;
        }

        public String getIocCrewEventCount() {
            return iocCrewEventCount;
        }

        public void setIocCrewEventCount(String iocCrewEventCount) {
            this.iocCrewEventCount = iocCrewEventCount;
        }

        public String getIocWheatherEventCount() {
            return iocWheatherEventCount;
        }

        public void setIocWheatherEventCount(String iocWheatherEventCount) {
            this.iocWheatherEventCount = iocWheatherEventCount;
        }

        public String getIocDelayEventCount() {
            return iocDelayEventCount;
        }

        public void setIocDelayEventCount(String iocDelayEventCount) {
            this.iocDelayEventCount = iocDelayEventCount;
        }

        public String getIocFppEventCount() {
            return iocFppEventCount;
        }

        public void setIocFppEventCount(String iocFppEventCount) {
            this.iocFppEventCount = iocFppEventCount;
        }

        public String getArrivalLegGroundTime() {
            return arrivalLegGroundTime;
        }

        public void setArrivalLegGroundTime(String arrivalLegGroundTime) {
            this.arrivalLegGroundTime = arrivalLegGroundTime;
        }

        public String getDepartureLegGroundTime() {
            return departureLegGroundTime;
        }

        public void setDepartureLegGroundTime(String departureLegGroundTime) {
            this.departureLegGroundTime = departureLegGroundTime;
        }

        public Date getDepartureLegBoradingDate() {
            return departureLegBoradingDate;
        }

        public void setDepartureLegBoradingDate(Date departureLegBoradingDate) {
            this.departureLegBoradingDate = departureLegBoradingDate;
        }

        public String getDepartureLegBoardingStatus() {
            return departureLegBoardingStatus;
        }

        public void setDepartureLegBoardingStatus(String departureLegBoardingStatus) {
            this.departureLegBoardingStatus = departureLegBoardingStatus;
        }

        public Date getDepartureLegBlocksOffDateUTC() {
            return departureLegBlocksOffDateUTC;
        }

        public void setDepartureLegBlocksOffDateUTC(
                Date departureLegBlocksOffDateUTC) {
            this.departureLegBlocksOffDateUTC = departureLegBlocksOffDateUTC;
        }

        public Date getDepartureLegWheelsOffDateUTC() {
            return departureLegWheelsOffDateUTC;
        }

        public void setDepartureLegWheelsOffDateUTC(
                Date departureLegWheelsOffDateUTC) {
            this.departureLegWheelsOffDateUTC = departureLegWheelsOffDateUTC;
        }

        public Date getDepartureLegBlocksOffDateLocal() {
            return departureLegBlocksOffDateLocal;
        }

        public void setDepartureLegBlocksOffDateLocal(
                Date departureLegBlocksOffDateLocal) {
            this.departureLegBlocksOffDateLocal = departureLegBlocksOffDateLocal;
        }

        public Date getDepartureLegWheelsOffDateLocal() {
            return departureLegWheelsOffDateLocal;
        }

        public void setDepartureLegWheelsOffDateLocal(
                Date departureLegWheelsOffDateLocal) {
            this.departureLegWheelsOffDateLocal = departureLegWheelsOffDateLocal;
        }

        public String getDepartureLegConfigs() {
            return departureLegConfigs;
        }

        public void setDepartureLegConfigs(String departureLegConfigs) {
            this.departureLegConfigs = departureLegConfigs;
        }

        public String getDepartureLegDepartureDelayMin() {
            return departureLegDepartureDelayMin;
        }

        public void setDepartureLegDepartureDelayMin(
                String departureLegDepartureDelayMin) {
            this.departureLegDepartureDelayMin = departureLegDepartureDelayMin;
        }

        public Date getDepartureLegArrivalDateUTC() {
            return departureLegArrivalDateUTC;
        }

        public void setDepartureLegArrivalDateUTC(Date departureLegArrivalDateUTC) {
            this.departureLegArrivalDateUTC = departureLegArrivalDateUTC;
        }

        public Date getDepartureLegSchedArrDateUTC() {
            return departureLegSchedArrDateUTC;
        }

        public void setDepartureLegSchedArrDateUTC(Date departureLegSchedArrDateUTC) {
            this.departureLegSchedArrDateUTC = departureLegSchedArrDateUTC;
        }

        public Date getDepartureLegEstdArrvDateUTC() {
            return departureLegEstdArrvDateUTC;
        }

        public void setDepartureLegEstdArrvDateUTC(Date departureLegEstdArrvDateUTC) {
            this.departureLegEstdArrvDateUTC = departureLegEstdArrvDateUTC;
        }

        public Date getDepartureLegActArrvDateUTC() {
            return departureLegActArrvDateUTC;
        }

        public void setDepartureLegActArrvDateUTC(Date departureLegActArrvDateUTC) {
            this.departureLegActArrvDateUTC = departureLegActArrvDateUTC;
        }

        public String getDepartureLegPlannedDelay() {
            return departureLegPlannedDelay;
        }

        public void setDepartureLegPlannedDelay(String departureLegPlannedDelay) {
            this.departureLegPlannedDelay = departureLegPlannedDelay;
        }

        public String getDepartureLegActualDelay() {
            return departureLegActualDelay;
        }

        public void setDepartureLegActualDelay(String departureLegActualDelay) {
            this.departureLegActualDelay = departureLegActualDelay;
        }

        public boolean isDepartureLegScedhuledDelaypositive() {
            return departureLegScedhuledDelaypositive;
        }

        public void setDepartureLegScedhuledDelaypositive(
                boolean departureLegScedhuledDelaypositive) {
            this.departureLegScedhuledDelaypositive = departureLegScedhuledDelaypositive;
        }

        public boolean isDepartureLegActualDelaypositive() {
            return departureLegActualDelaypositive;
        }

        public void setDepartureLegActualDelaypositive(
                boolean departureLegActualDelaypositive) {
            this.departureLegActualDelaypositive = departureLegActualDelaypositive;
        }

        public String getIocWheatherEventPort() {
            return iocWheatherEventPort;
        }

        public void setIocWheatherEventPort(String iocWheatherEventPort) {
            this.iocWheatherEventPort = iocWheatherEventPort;
        }

        public boolean isAircraftIsOnPTS() {
            return aircraftIsOnPTS;
        }

        public void setAircraftIsOnPTS(boolean aircraftIsOnPTS) {
            this.aircraftIsOnPTS = aircraftIsOnPTS;
        }

        public Date getUtcPTSTime() {
            return utcPTSTime;
        }

        public void setUtcPTSTime(Date utcPTSTime) {
            this.utcPTSTime = utcPTSTime;
        }

        public String getDepartureLegForcastedDelayMin() {
            return departureLegForcastedDelayMin;
        }

        public void setDepartureLegForcastedDelayMin(
                String departureLegForcastedDelayMin) {
            this.departureLegForcastedDelayMin = departureLegForcastedDelayMin;
        }

        public int getArrivalLegActualGroundTimeMinutes() {
            return arrivalLegActualGroundTimeMinutes;
        }

        public void setArrivalLegActualGroundTimeMinutes(
                int arrivalLegActualGroundTimeMinutes) {
            this.arrivalLegActualGroundTimeMinutes = arrivalLegActualGroundTimeMinutes;
        }

        public String getArrivalLegDisruption() {
            return arrivalLegDisruption;
        }

        public void setArrivalLegDisruption(String arrivalLegDisruption) {
            this.arrivalLegDisruption = arrivalLegDisruption;
        }

        public String getDepartureLegDisruption() {
            return departureLegDisruption;
        }

        public void setDepartureLegDisruption(String departureLegDisruption) {
            this.departureLegDisruption = departureLegDisruption;
        }

        public boolean isEventOld() {
            return eventOld;
        }

        public void setEventOld(boolean eventOld) {
            this.eventOld = eventOld;
        }

        public String getOpsCommentSummary() {
            return opsCommentSummary;
        }

        public void setOpsCommentSummary(String opsCommentSummary) {
            this.opsCommentSummary = opsCommentSummary;
        }

        public Date getOpsETSDate() {
            return opsETSDate;
        }

        public void setOpsETSDate(Date opsETSDate) {
            this.opsETSDate = opsETSDate;
        }

        public Integer getDelayReportEventId() {
            return delayReportEventId;
        }

        public void setDelayReportEventId(Integer delayReportEventId) {
            this.delayReportEventId = delayReportEventId;
        }

        public String getDelayReportStatusName() {
            return delayReportStatusName;
        }

        public void setDelayReportStatusName(String delayReportStatusName) {
            this.delayReportStatusName = delayReportStatusName;
        }

        public Integer getDelayReportEventStatusID() {
            return delayReportEventStatusID;
        }

        public void setDelayReportEventStatusID(Integer delayReportEventStatusID) {
            this.delayReportEventStatusID = delayReportEventStatusID;
        }

        public Date getArrivalLegScheduleArrivalDateLocal() {
            return arrivalLegScheduleArrivalDateLocal;
        }

        public void setArrivalLegScheduleArrivalDateLocal(
                Date arrivalLegScheduleArrivalDateLocal) {
            this.arrivalLegScheduleArrivalDateLocal = arrivalLegScheduleArrivalDateLocal;
        }

        public Date getDepartureLegSchedArrDateLocal() {
            return departureLegSchedArrDateLocal;
        }

        public void setDepartureLegSchedArrDateLocal(
                Date departureLegSchedArrDateLocal) {
            this.departureLegSchedArrDateLocal = departureLegSchedArrDateLocal;
        }

        public Date getDepartureLegEstdArrvDateLocal() {
            return departureLegEstdArrvDateLocal;
        }

        public void setDepartureLegEstdArrvDateLocal(
                Date departureLegEstdArrvDateLocal) {
            this.departureLegEstdArrvDateLocal = departureLegEstdArrvDateLocal;
        }

        public Date getDepartureLegWheelsOnDateUTC() {
            return departureLegWheelsOnDateUTC;
        }

        public void setDepartureLegWheelsOnDateUTC(
                Date departureLegWheelsOnDateUTC) {
            this.departureLegWheelsOnDateUTC = departureLegWheelsOnDateUTC;
        }

        public Date getDepartureLegWheelsOnDateLocal() {
            return departureLegWheelsOnDateLocal;
        }

        public void setDepartureLegWheelsOnDateLocal(
                Date departureLegWheelsOnDateLocal) {
            this.departureLegWheelsOnDateLocal = departureLegWheelsOnDateLocal;
        }

        public Date getDepartureLegActArrvDateLocal() {
            return departureLegActArrvDateLocal;
        }

        public void setDepartureLegActArrvDateLocal(
                Date departureLegActArrvDateLocal) {
            this.departureLegActArrvDateLocal = departureLegActArrvDateLocal;
        }

        public Date getDepartureLegScheduleDepartureDateUTC() {
            return departureLegScheduleDepartureDateUTC;
        }

        public void setDepartureLegScheduleDepartureDateUTC(
                Date departureLegScheduleDepartureDateUTC) {
            this.departureLegScheduleDepartureDateUTC = departureLegScheduleDepartureDateUTC;
        }

        public Date getDepartureLegScheduleDepartureDateLocal() {
            return departureLegScheduleDepartureDateLocal;
        }

        public void setDepartureLegScheduleDepartureDateLocal(
                Date departureLegScheduleDepartureDateLocal) {
            this.departureLegScheduleDepartureDateLocal = departureLegScheduleDepartureDateLocal;
        }

        public String getFormEventStatus() {
            return formEventStatus;
        }

        public void setFormEventStatus(String formEventStatus) {
            this.formEventStatus = formEventStatus;
        }

    }
