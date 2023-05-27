package com.tcs.model;

/**
 * Created by 257120 on 5/04/2016.
 */
public class SamMOUHours {
    private String location;
    private String checkGroup;
    private String assembly;
    private String day;
    private int hrs;

    public SamMOUHours(String location, String checkGroup, String assembly, String day, int hrs) {
        this.location = location;
        this.checkGroup = checkGroup;
        this.assembly = assembly;
        this.day = day;
        this.hrs = hrs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckGroup() {
        return checkGroup;
    }

    public void setCheckGroup(String checkGroup) {
        this.checkGroup = checkGroup;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
}
