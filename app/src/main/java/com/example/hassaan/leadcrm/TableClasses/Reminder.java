package com.example.hassaan.leadcrm.TableClasses;

public class Reminder {

    public static final String TABLE_NAME = "tbl_Reminder";
    public static final String KEY_ID = "ID";
    public static final String KEY_TIME = "Time";
    public static final String KEY_REPEAT = "Repeat";
    public static final String KEY_AlERT = "Alert";

    private String ID;
    private String Time;
    private String Repeat;
    private String Alert;

    public Reminder(String ID, String time, String repeat, String alert) {
        this.ID = ID;
        Time = time;
        Repeat = repeat;
        Alert = alert;
    }

    public Reminder(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
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
