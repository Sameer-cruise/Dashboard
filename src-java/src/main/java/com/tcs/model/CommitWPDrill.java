package com.tcs.model;

import org.springframework.stereotype.Component;

/**
 * Created by 547885 on 20/10/2016.
 */
@Component
public class CommitWPDrill {

    private String localStartDt;
    private String localStartTime;
    private String localEndDt;
    private String localEndTime;
    private String assmblCd;
    private String rego;
    private String wpBarcode;
    private String wpLocation;
    private double schedHR;
    //private double actualHR;
    private double overflowHr;

    public String getLocalStartDt() {
        return localStartDt;
    }

    public void setLocalStartDt(String localStartDt) {
        this.localStartDt = localStartDt;
    }

    public String getLocalStartTime() {
        return localStartTime;
    }

    public void setLocalStartTime(String localStartTime) {
        this.localStartTime = localStartTime;
    }

    public String getLocalEndDt() {
        return localEndDt;
    }

    public void setLocalEndDt(String localEndDt) {
        this.localEndDt = localEndDt;
    }

    public String getLocalEndTime() {
        return localEndTime;
    }

    public void setLocalEndTime(String localEndTime) {
        this.localEndTime = localEndTime;
    }

    public String getAssmblCd() {
        return assmblCd;
    }

    public void setAssmblCd(String assmblCd) {
        this.assmblCd = assmblCd;
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

    public String getWpLocation() {
        return wpLocation;
    }

    public void setWpLocation(String wpLocation) {
        this.wpLocation = wpLocation;
    }

    public double getSchedHR() {
        return schedHR;
    }

    public void setSchedHR(double schedHR) {
        this.schedHR = schedHR;
    }

    public double getOverflowHr() {
        return overflowHr;
    }

    public void setOverflowHr(double overflowHr) {
        this.overflowHr = overflowHr;
    }

    public CommitWPDrill()
    {

    }

    public CommitWPDrill(String localStartDt, String localStartTime, String localEndDt, String localEndTime, String assmblCd, String rego, String wpBarcode, String wpLocation, double schedHR, double overflowHr) {
        this.localStartDt = localStartDt;
        this.localStartTime = localStartTime;
        this.localEndDt = localEndDt;
        this.localEndTime = localEndTime;
        this.assmblCd = assmblCd;
        this.rego = rego;
        this.wpBarcode = wpBarcode;
        this.wpLocation = wpLocation;
        this.schedHR = schedHR;
        this.overflowHr = overflowHr;
    }
}
