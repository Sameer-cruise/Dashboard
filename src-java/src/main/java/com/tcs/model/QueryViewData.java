package com.tcs.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 547885 on 6/07/2016.
 */
public class QueryViewData {

    private String Rego;
    private String WP;
    private String WP_START;
    private Date WP_START_DATE;
    private String Status;
    private String Loc;
    private String indicate;
    private BigDecimal eLogBookCap;

    public QueryViewData(String rego, String WP, String WP_START,Date WP_START_DATE,String status,String loc,String indicate, BigDecimal elogbookCap) {
        Rego = rego;
        Loc = loc;
        Status = status;
        this.WP_START_DATE = WP_START_DATE;
        this.WP = WP;
        this.WP_START = WP_START;
        this.indicate=indicate;
        this.eLogBookCap = elogbookCap;
    }

    public BigDecimal geteLogBookCap(){
        return eLogBookCap;
    }
    public void seteLogBookCap(BigDecimal eLogBookCap){
        this.eLogBookCap = eLogBookCap;
    }
    public String getIndicate() {
        return indicate;
    }

    public void setIndicate(String indicate) {
        this.indicate = indicate;
    }

    public Date getWP_START_DATE() {
        return WP_START_DATE;
    }

    public void setWP_START_DATE(Date WP_START_DATE) {
        this.WP_START_DATE = WP_START_DATE;
    }

    public String getRego() {
        return Rego;
    }

    public void setRego(String rego) {
        Rego = rego;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getWP_START() {
        return WP_START;
    }

    public void setWP_START(String WP_START) {
        this.WP_START = WP_START;
    }

    public String getWP() {
        return WP;
    }

    public void setWP(String WP) {
        this.WP = WP;
    }
}
