package com.tcs.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 547885 on 11/10/2015.
 */
public class QueryView {

    private String rego;
    private String wp;
    private String wp_loc;
    private Date wp_start;
    private Date wp_end;//Added for wp end
    private String status;
    private String loc;
    /* columns added for the change to the dashboard*/
    private String local_wp_start;  //Added the column for the work packages
    private String indicate; //added for SYD international
    private String mxflight; //added for the next flight;
    private BigDecimal eLogBookCap;

    public BigDecimal getElogBookCap(){
        return eLogBookCap;
    }
    public void seteLogBookCap(BigDecimal eLogBookCap){
        this.eLogBookCap = eLogBookCap;
    }

    public String getMxflight() {
        return mxflight;
    }

    public void setMxflight(String mxflight) {
        this.mxflight = mxflight;
    }

    public String getIndicate() {
        return indicate;
    }

    public void setIndicate(String indicate) {
        this.indicate = indicate;
    }

    public String getLocal_wp_start() {
        return local_wp_start;
    }

    public void setLocal_wp_start(String local_wp_start) {
        this.local_wp_start = local_wp_start;
    }
 //Changes reverted 17th Aug 2016
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getWp_start() {
        return wp_start;
    }

    public void setWp_start(Date wp_start) {
        this.wp_start = wp_start;
    }

    public String getWp_loc() {
        return wp_loc;
    }

    public void setWp_loc(String wp_loc) {
        this.wp_loc = wp_loc;
    }

    public String getWp() {
        return wp;
    }

    public void setWp(String wp) {
        this.wp = wp;
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public Date getWp_end() {
        return wp_end;
    }

    public void setWp_end(Date wp_end) {
        this.wp_end = wp_end;
    }
}
