package com.zackoji.fault_reportmockup.model;

/**
 * Created by Zackoji on 15/7/2558.
 */
public class Full_DDN_Fault_Report_Model {
    String cirID;
    String region;
    String rcu;
    String location;
    String down;
    String up;
    String totaltime;
    String truetime;
    String cause;
    String notes;
    String groupcase;

    public String getCirID() {
        return cirID;
    }

    public void setCirID(String cirID) {
        this.cirID = cirID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRcu() {
        return rcu;
    }

    public void setRcu(String rcu) {
        this.rcu = rcu;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(String totaltime) {
        this.totaltime = totaltime;
    }

    public String getTruetime() {
        return truetime;
    }

    public void setTruetime(String truetime) {
        this.truetime = truetime;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getGroupcase() {
        return groupcase;
    }

    public void setGroupcase(String groupcase) {
        this.groupcase = groupcase;
    }

    public Full_DDN_Fault_Report_Model() {
        this.cirID = "TEXT1234234";
        this.region = "region 123";

        this.rcu = "I see U asdf";
        this.location = "";
        this.down = "";
        this.up = "";
        this.totaltime = "";
        this.truetime = "";
        this.cause = "";
        this.notes = "";
        this.groupcase = "";
    }

    public Full_DDN_Fault_Report_Model(String cirID) {
        this.cirID = cirID;
        this.region = "region 123";

        this.rcu = "I see U asdf";
        this.location = "";
        this.down = "";
        this.up = "";
        this.totaltime = "";
        this.truetime = "";
        this.cause = "";
        this.notes = "";
        this.groupcase = "";
    }

    public Full_DDN_Fault_Report_Model(String cirID, String region, String rcu, String location, String down, String up, String totaltime, String truetime, String cause, String notes, String groupcase) {
        this.cirID = cirID;
        this.region = region;
        this.rcu = rcu;
        this.location = location;
        this.down = down;
        this.up = up;
        this.totaltime = totaltime;
        this.truetime = truetime;
        this.cause = cause;
        this.notes = notes;
        this.groupcase = groupcase;
    }


}
