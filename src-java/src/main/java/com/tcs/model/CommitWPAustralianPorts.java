package com.tcs.model;

import org.springframework.stereotype.Component;

@Component
public class CommitWPAustralianPorts {
    private String wpLocation;
    private String wpStartDate;
    private String dayOfWeek;
    private String slot;
    private double schedHR;
    private double cmplHR;
    private double overHR;
    private double mouHR;

    public CommitWPAustralianPorts() {
    }

    public CommitWPAustralianPorts(String wpLocation, String wpStartDate, String dayOfWeek, String slot, double schedHR, double cmplHR, double overHR, double mouHR) {
        this.wpLocation = wpLocation;
        this.wpStartDate = wpStartDate;
        this.dayOfWeek = dayOfWeek;
        this.slot = slot;
        this.schedHR = schedHR;
        this.cmplHR = cmplHR;
        this.overHR = overHR;
        this.mouHR = mouHR;
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

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public double getSchedHR() {
        return schedHR;
    }

    public void setSchedHR(double schedHR) {
        this.schedHR = schedHR;
    }

    public double getCmplHR() {
        return cmplHR;
    }

    public void setCmplHR(double cmplHR) {
        this.cmplHR = cmplHR;
    }

    public double getOverHR() {
        return overHR;
    }

    public void setOverHR(double overHR) {
        this.overHR = overHR;
    }

    public double getMouHR() {
        return mouHR;
    }

    public void setMouHR(double mouHR) {
        this.mouHR = mouHR;
    }

    @Override
    public String toString() {
        return "CommitWPAustralianPorts{" +
                "wpLocation='" + wpLocation + '\'' +
                ", wpStartDate='" + wpStartDate + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", slot='" + slot + '\'' +
                ", schedHR=" + schedHR +
                ", cmplHR=" + cmplHR +
                ", overHR=" + overHR +
                ", mouHR=" + mouHR +
                '}';
    }
}
