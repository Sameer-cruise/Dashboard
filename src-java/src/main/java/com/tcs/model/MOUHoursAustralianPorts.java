package com.tcs.model;

public class MOUHoursAustralianPorts {
    private String day;
    private String location;
    private String slot;
    private int hrs;

    public MOUHoursAustralianPorts(String day, String location, String slot, int hrs) {
        this.day = day;
        this.location = location;
        this.slot = slot;
        this.hrs = hrs;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    @Override
    public String toString() {
        return "MOUHoursAustralianPorts{" +
                "day='" + day + '\'' +
                ", location='" + location + '\'' +
                ", slot='" + slot + '\'' +
                ", hrs=" + hrs +
                '}';
    }
}
