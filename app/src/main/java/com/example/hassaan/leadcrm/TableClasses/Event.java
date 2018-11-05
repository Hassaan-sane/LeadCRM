package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Event {
    public static final String TABLE_NAME = "tbl_Event";
    public static final String KEY_ID = "ID";
    public static final String KEY_LOCATIONS = "Location";
    public static final String KEY_STARTDATE = "StartDate";
    public static final String KEY_ENDDATE = "EndDate";
    public static final String KEY_HOSTNAME = "HostName";
    public static final String KEY_EVENTNAME = "EventName";
    public static final String KEY_STARTTIME = "StartTime";
    public static final String KEY_ENDTIME = "EndTime";

    private Integer ID;
    private String Location;
    private String StartDate;
    private String EndDate;
    private String HostName;
    private String EventName;
    private String StartTime;
    private String EndTime;

    public Event(Integer ID, String location, String startDate, String endDate, String hostName, String eventName, String startTime, String endTime) {
        this.ID = ID;
        Location = location;
        StartDate = startDate;
        EndDate = endDate;
        HostName = hostName;
        EventName = eventName;
        StartTime = startTime;
        EndTime = endTime;
    }

    public Event(){}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
}
