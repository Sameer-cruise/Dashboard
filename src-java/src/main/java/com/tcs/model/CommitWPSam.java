package com.tcs.model;

import org.springframework.stereotype.Component;

/**
 * Created by 527518 on 09/09/2016.
 */
@Component
public class CommitWPSam {
    private String checkGroup;
    private String dayOfWeek;
    private String dateValue;
    private String assembly;
    private String loc;
    private double mouHR;
    private double schedHR;
    private double cmplHR;
    private double overHR;
    private double daysum;
    private double daymou;

    public CommitWPSam() {

    }

    public CommitWPSam(String checkGroup, String dayOfWeek, String dateValue, String assembly, String loc, double mouHR, double schedHR, double cmplHR, double overHR, double daysum, double daymou) {
        this.checkGroup = checkGroup;
        this.dayOfWeek = dayOfWeek;
        this.dateValue = dateValue;
        this.assembly = assembly;
        this.loc = loc;
        this.mouHR = mouHR;
        this.schedHR = schedHR;
        this.cmplHR = cmplHR;
        this.overHR = overHR;
        this.daysum = daysum;
        this.daymou = daymou;
    }

    public String getCheckGroup() {
        return checkGroup;
    }

    public void setCheckGroup(String checkGroup) {
        this.checkGroup = checkGroup;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public double getMouHR() {
        return mouHR;
    }

    public void setMouHR(double mouHR) {
        this.mouHR = mouHR;
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

    public double getDaysum() {
        return daysum;
    }

    public void setDaysum(double daysum) {
        this.daysum = daysum;
    }

    public double getDaymou() {
        return daymou;
    }

    public void setDaymou(double daymou) {
        this.daymou = daymou;
    }
}
