package com.tcs.model;

import java.math.BigDecimal;
import java.util.Date;

public class AtlasBoardView {

    private String indicator;
    private String workpack;
    private String due;
    private String depfltno;
    private String arrfltno;
    private Date arrivalDate;
    private Date deptDate;
    private String port;
    private String nxtport;
    private String melcnt;
    private String status;
    private Date arrivalDateUTC;
    private Date deptDateUTC;
    private String rego;
    private String deptstatus;
    private String arrstatus;
    private String owner;
    private String flightstatus;
    private String arrivalPort;
    private String arrSeq;
    private String depSeq;
    private Date schedArrDate;
    private Date schedDeptDate;
    private String eLogbookCap;

    public void seteLogbookCap(String eLogbookCap){
        this.eLogbookCap = eLogbookCap;
    }
    public String geteLogbookCap(){
        return eLogbookCap;
    }


    public Date getSchedArrDate() {
        return schedArrDate;
    }

    public void setSchedArrDate(Date schedArrDate) {
        this.schedArrDate = schedArrDate;
    }

    public Date getSchedDeptDate() {
        return schedDeptDate;
    }

    public void setSchedDeptDate(Date schedDeptDate) {
        this.schedDeptDate = schedDeptDate;
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }

    public String getArrSeq() {
        return arrSeq;
    }

    public void setArrSeq(String arrSeq) {
        this.arrSeq = arrSeq;
    }

    public String getDepSeq() {
        return depSeq;
    }

    public void setDepSeq(String depSeq) {
        this.depSeq = depSeq;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getWorkpack() {
        return workpack;
    }

    public void setWorkpack(String workpack) {
        this.workpack = workpack;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getDepfltno() {
        return depfltno;
    }

    public void setDepfltno(String depfltno) {
        this.depfltno = depfltno;
    }

    public String getArrfltno() {
        return arrfltno;
    }

    public void setArrfltno(String arrfltno) {
        this.arrfltno = arrfltno;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDeptDate() {
        return deptDate;
    }

    public void setDeptDate(Date deptDate) {
        this.deptDate = deptDate;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getNxtport() {
        return nxtport;
    }

    public void setNxtport(String nxtport) {
        this.nxtport = nxtport;
    }

    public String getMelcnt() {
        return melcnt;
    }

    public void setMelcnt(String melcnt) {
        this.melcnt = melcnt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getArrivalDateUTC() {
        return arrivalDateUTC;
    }

    public void setArrivalDateUTC(Date arrivalDateUTC) {
        this.arrivalDateUTC = arrivalDateUTC;
    }

    public Date getDeptDateUTC() {
        return deptDateUTC;
    }

    public void setDeptDateUTC(Date deptDateUTC) {
        this.deptDateUTC = deptDateUTC;
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public String getDeptstatus() {
        return deptstatus;
    }

    public void setDeptstatus(String deptstatus) {
        this.deptstatus = deptstatus;
    }

    public String getArrstatus() {
        return arrstatus;
    }

    public void setArrstatus(String arrstatus) {
        this.arrstatus = arrstatus;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFlightstatus() {
        return flightstatus;
    }

    public void setFlightstatus(String flightstatus) {
        this.flightstatus = flightstatus;
    }
}
