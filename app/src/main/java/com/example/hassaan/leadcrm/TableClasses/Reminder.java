package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Reminder {

    public static final String TABLE_NAME = "tbl_Reminder";
    public static final String KEY_ID = "ID";
    public static final String KEY_TIME = "Time";
    public static final String KEY_REPEAT = "Repeat";
    public static final String KEY_AlERT = "Alert";

    private Integer ID;
    private Date Time;
    private String Repeat;
    private String Alert;

    public Reminder(Integer ID, Date time, String repeat, String alert) {
        this.ID = ID;
        Time = time;
        Repeat = repeat;
        Alert = alert;
    }

    public Reminder(){}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public String getRepeat() {
        return Repeat;
    }

    public void setRepeat(String repeat) {
        Repeat = repeat;
    }

    public String getAlert() {
        return Alert;
    }

    public void setAlert(String alert) {
        Alert = alert;
    }
}
