package com.tcs.model;

import org.springframework.stereotype.Component;

/**
 * Created by 527518 on 09/09/2016.
 */
@Component
public class CommitWPSamDetail {
    private String dateValue;
    private String checkGroup;
    private String assmblCd;
    private String locCd;
    private String dayOFWeek;
    private String wpSchedStartDate;
    private String localStartDate;
    private String localStartTime;
    private String localEndDate;
    private String localEndTime;
    private String wpStatus;
    private String rego;
    private String wpBarcode;
    private double schedHrs;
    private double completeHrs;
    private double mouHrs;
    private double overflowHrs;

    public CommitWPSamDetail() {

    }

    public CommitWPSamDetail(String dateValue, String checkGroup, String assmblCd, String locCd, String dayOFWeek, String localStartDate, String localStartTime, String localEndDate, String localEndTime, String wpStatus, String rego, String wpBarcode, double schedHrs, double completeHrs, double mouHrs, double overflowHrs) {
        this.dateValue = dateValue;
        this.checkGroup = checkGroup;
        this.assmblCd = assmblCd;
        this.locCd = locCd;
        this.dayOFWeek = dayOFWeek;
        this.localStartDate = localStartDate;
        this.localStartTime = localStartTime;
        this.localEndDate = localEndDate;
        this.localEndTime = localEndTime;
        this.wpStatus = wpStatus;
        this.rego = rego;
        this.wpBarcode = wpBarcode;
        this.schedHrs = schedHrs;
        this.completeHrs = completeHrs;
        this.mouHrs = mouHrs;
        this.overflowHrs = overflowHrs;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public String getCheckGroup() {
        return checkGroup;
    }

    public void setCheckGroup(String checkGroup) {
        this.checkGroup = checkGroup;
    }

    public String getAssmblCd() {
        return assmblCd;
    }

    public void setAssmblCd(String assmblCd) {
        this.assmblCd = assmblCd;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getDayOFWeek() {
        return dayOFWeek;
    }

    public void setDayOFWeek(String dayOFWeek) {
        this.dayOFWeek = dayOFWeek;
    }

    public String getLocalStartDate() {
        return localStartDate;
    }

    public void setLocalStartDate(String localStartDate) {
        this.localStartDate = localStartDate;
    }

    public String getLocalStartTime() {
        return localStartTime;
    }

    public void setLocalStartTime(String localStartTime) {
        this.localStartTime = localStartTime;
    }

    public String getLocalEndDate() {
        return localEndDate;
    }

    public void setLocalEndDate(String localEndDate) {
        this.localEndDate = localEndDate;
    }

    public String getLocalEndTime() {
        return localEndTime;
    }

    public void setLocalEndTime(String localEndTime) {
        this.localEndTime = localEndTime;
    }

    public String getWpStatus() {
        return wpStatus;
    }

    public void setWpStatus(String wpStatus) {
        this.wpStatus = wpStatus;
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public String getWpBarcode() {
        return wpBarcode;
    }

    public void setWpBarcode(String wpBarcode) {
        this.wpBarcode = wpBarcode;
    }

    public double getSchedHrs() {
        return schedHrs;
    }

    public void setSchedHrs(double schedHrs) {
        this.schedHrs = schedHrs;
    }

    public double getCompleteHrs() {
        return completeHrs;
    }

    public void setCompleteHrs(double completeHrs) {
        this.completeHrs = completeHrs;
    }

    public double getMouHrs() {
        return mouHrs;
    }

    public void setMouHrs(double mouHrs) {
        this.mouHrs = mouHrs;
    }

    public double getOverflowHrs() {
        return overflowHrs;
    }

    public void setOverflowHrs(double overflowHrs) {
        this.overflowHrs = overflowHrs;
    }

    @Override
    public String toString() {
        return "CommitWPSamDetail{" +
                "dateValue='" + dateValue + '\'' +
                ", checkGroup='" + checkGroup + '\'' +
                ", assmblCd='" + assmblCd + '\'' +
                ", locCd='" + locCd + '\'' +
                ", dayOFWeek='" + dayOFWeek + '\'' +
                ", localStartDate='" + localStartDate + '\'' +
                ", localStartTime='" + localStartTime + '\'' +
                ", localEndDate='" + localEndDate + '\'' +
                ", localEndTime='" + localEndTime + '\'' +
                ", wpStatus='" + wpStatus + '\'' +
                ", rego='" + rego + '\'' +
                ", wpBarcode='" + wpBarcode + '\'' +
                ", schedHrs=" + schedHrs +
                ", completeHrs=" + completeHrs +
                ", mouHrs=" + mouHrs +
                ", overflowHrs=" + overflowHrs +
                '}';
    }
}
