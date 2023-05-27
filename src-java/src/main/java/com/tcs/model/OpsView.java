package com.tcs.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 547885 on 11/10/2015.
 */
public class OpsView {

    private String station;
    private String rego;
    private String ArrivalFlightNo;
    private String ArrivingToPort;
    private Date ArrivalTimeLocal;
    private Date ArrivalTimeUTC;
    private String ArrivalStatus;
    private String ArrivalFlightStatus;
    private Date SchedArrivalTimeLocal;
    private Date SchedArrivalTimeUTC;
    private String DepartingFlightNo;
    private String DepartingToPort;
    private Date DepartureTimeLocal;
    private Date DepartureTimeUTC;
    private Date SchedDepartureLegDeptTimeLocal;
    private Date SchedDepartureLegDeptTimeUTC;
    private Date SchedDepartureLegArrivalTimeLocal;
    private Date SchedDepartureLegArrivalTimeUTC;
    private Date DepartureLegActualArrivalUTC;
    private Date DepartureLegActualArrivalLocal;
    private String DepartureStatus;
    private String owner;
    private String eLogBookCap;

    public String geteLogBookCap(){
        return eLogBookCap;
    }
    public void seteLogBookCap(String eLogBookCap){
        this.eLogBookCap = eLogBookCap;
    }


    //Added for extra flight details

    // where is the flight arriving from
    private String arrivingFromStation;
    private int arrivalFlightSeq;
    private int depFlightSeq;

    public String getArrivingFromStation() {
        return arrivingFromStation;
    }

    public void setArrivingFromStation(String arrivingFromStation) {
        this.arrivingFromStation = arrivingFromStation;
    }

    public int getArrivalFlightSeq() {
        return arrivalFlightSeq;
    }

    public void setArrivalFlightSeq(int arrivalFlightSeq) {
        this.arrivalFlightSeq = arrivalFlightSeq;
    }

    public int getDepFlightSeq() {
        return depFlightSeq;
    }

    public void setDepFlightSeq(int depFlightSeq) {
        this.depFlightSeq = depFlightSeq;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getRego() {
        return rego;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public String getArrivalFlightNo() {
        return ArrivalFlightNo;
    }

    public void setArrivalFlightNo(String arrivalFlightNo) {
        ArrivalFlightNo = arrivalFlightNo;
    }

    public String getArrivingToPort() {
        return ArrivingToPort;
    }

    public void setArrivingToPort(String arrivingToPort) {
        ArrivingToPort = arrivingToPort;
    }

    public Date getArrivalTimeLocal() {
        return ArrivalTimeLocal;
    }

    public void setArrivalTimeLocal(Date arrivalTimeLocal) {
        ArrivalTimeLocal = arrivalTimeLocal;
    }

    public Date getArrivalTimeUTC() {
        return ArrivalTimeUTC;
    }

    public void setArrivalTimeUTC(Date arrivalTimeUTC) {
        ArrivalTimeUTC = arrivalTimeUTC;
    }

    public String getArrivalStatus() {
        return ArrivalStatus;
    }

    public void setArrivalStatus(String arrivalStatus) {
        ArrivalStatus = arrivalStatus;
    }

    public String getArrivalFlightStatus() {
        return ArrivalFlightStatus;
    }

    public void setArrivalFlightStatus(String arrivalFlightStatus) {
        ArrivalFlightStatus = arrivalFlightStatus;
    }

    public Date getSchedArrivalTimeLocal() {
        return SchedArrivalTimeLocal;
    }

    public void setSchedArrivalTimeLocal(Date schedArrivalTimeLocal) {
        SchedArrivalTimeLocal = schedArrivalTimeLocal;
    }

    public Date getSchedArrivalTimeUTC() {
        return SchedArrivalTimeUTC;
    }

    public void setSchedArrivalTimeUTC(Date schedArrivalTimeUTC) {
        SchedArrivalTimeUTC = schedArrivalTimeUTC;
    }

    public String getDepartingFlightNo() {
        return DepartingFlightNo;
    }

    public void setDepartingFlightNo(String departingFlightNo) {
        DepartingFlightNo = departingFlightNo;
    }

    public String getDepartingToPort() {
        return DepartingToPort;
    }

    public void setDepartingToPort(String departingToPort) {
        DepartingToPort = departingToPort;
    }

    public Date getDepartureTimeLocal() {
        return DepartureTimeLocal;
    }

    public void setDepartureTimeLocal(Date departureTimeLocal) {
        DepartureTimeLocal = departureTimeLocal;
    }

    public Date getDepartureTimeUTC() {
        return DepartureTimeUTC;
    }

    public void setDepartureTimeUTC(Date departureTimeUTC) {
        DepartureTimeUTC = departureTimeUTC;
    }

    public Date getSchedDepartureLegDeptTimeLocal() {
        return SchedDepartureLegDeptTimeLocal;
    }

    public void setSchedDepartureLegDeptTimeLocal(Date schedDepartureLegDeptTimeLocal) {
        SchedDepartureLegDeptTimeLocal = schedDepartureLegDeptTimeLocal;
    }

    public Date getSchedDepartureLegDeptTimeUTC() {
        return SchedDepartureLegDeptTimeUTC;
    }

    public void setSchedDepartureLegDeptTimeUTC(Date schedDepartureLegDeptTimeUTC) {
        SchedDepartureLegDeptTimeUTC = schedDepartureLegDeptTimeUTC;
    }

    public Date getSchedDepartureLegArrivalTimeLocal() {
        return SchedDepartureLegArrivalTimeLocal;
    }

    public void setSchedDepartureLegArrivalTimeLocal(Date schedDepartureLegArrivalTimeLocal) {
        SchedDepartureLegArrivalTimeLocal = schedDepartureLegArrivalTimeLocal;
    }

    public Date getSchedDepartureLegArrivalTimeUTC() {
        return SchedDepartureLegArrivalTimeUTC;
    }

    public void setSchedDepartureLegArrivalTimeUTC(Date schedDepartureLegArrivalTimeUTC) {
        SchedDepartureLegArrivalTimeUTC = schedDepartureLegArrivalTimeUTC;
    }

    public Date getDepartureLegActualArrivalUTC() {
        return DepartureLegActualArrivalUTC;
    }

    public void setDepartureLegActualArrivalUTC(Date departureLegActualArrivalUTC) {
        DepartureLegActualArrivalUTC = departureLegActualArrivalUTC;
    }

    public Date getDepartureLegActualArrivalLocal() {
        return DepartureLegActualArrivalLocal;
    }

    public void setDepartureLegActualArrivalLocal(Date departureLegActualArrivalLocal) {
        DepartureLegActualArrivalLocal = departureLegActualArrivalLocal;
    }

    public String getDepartureStatus() {
        return DepartureStatus;
    }

    public void setDepartureStatus(String departureStatus) {
        DepartureStatus = departureStatus;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
