package com.tcs.model;

public class MOUHours {
    private String day;
    private String location;
    private int hrs;

    public MOUHours(String day, String location, int hrs) {
        this.day = day;
        this.location = location;
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

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    @Override
    public String toString() {
        return "MOUHours{" +
                "day='" + day + '\'' +
                ", location='" + location + '\'' +
                ", hrs=" + hrs +
                '}';
    }
}
