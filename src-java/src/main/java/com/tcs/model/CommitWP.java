package com.tcs.model;

import org.springframework.stereotype.Component;

@Component
public class CommitWP {
    private String wpLocation;
    private String wpStartDate;
    private String dayOfWeek;
    private double schedHR;
    private double cmplHR;
    private double overHR;
    private double mouHR;
    private int monthData;

    public CommitWP() {

    }

    public CommitWP(String wpLocation, String wpStartDate, String dayOfWeek, double schedHR, double cmplHR, double overHR, double mouHR, int monthData) {
        this.wpLocation = wpLocation;
        this.wpStartDate = wpStartDate;
        this.dayOfWeek = dayOfWeek;
        this.schedHR = schedHR;
        this.cmplHR = cmplHR;
        this.overHR = overHR;
        this.mouHR = mouHR;
        this.monthData = monthData;
    }

    public int getMonthData() {
        return monthData;
    }

    public void setMonthData(int monthData) {
        this.monthData = monthData;
    }

    public double getCmplHR() {
        return cmplHR;
    }

    public void setCmplHR(double cmplHR) {
        this.cmplHR = cmplHR;
    }

    public String getWpLocation() {
        return wpLocation;
    }

    public void setWpLocation(String wpLocation) {
        this.wpLocation = wpLocation;
    }

    public String getWpStartDate() {
        return wpStartDate;
    }

    public void setWpStartDate(String wpStartDate) {
        this.wpStartDate = wpStartDate;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public double getSchedHR() {
        return schedHR;
    }

    public void setSchedHR(double schedHR) {
        this.schedHR = schedHR;
    }

    public double getMouHR() {
        return mouHR;
    }

    public void setMouHR(double mouHR) {
        this.mouHR = mouHR;
    }

    public double getOverHR() {
        return overHR;
    }

    public void setOverHR(double overHR) {
        this.overHR = overHR;
    }

    @Override
    public String toString() {
        return "CommitWP{" +
                "wpLocation='" + wpLocation + '\'' +
                ", wpStartDate='" + wpStartDate + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", schedHR=" + schedHR +
                ", cmplHR=" + cmplHR +
                ", overHR=" + overHR +
                ", mouHR=" + mouHR +
                '}';
    }
}
