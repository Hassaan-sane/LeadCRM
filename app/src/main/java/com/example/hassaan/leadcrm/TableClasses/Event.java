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
    private Date StartDate;
    private Date EndDate;
    private String HostName;
    private String EventName;
    private Date StartTime;
    private Date EndTime;

    public Event(Integer ID, String location, Date startDate, Date endDate, String hostName, String eventName, Date startTime, Date endTime) {
        this.ID = ID;
        this.Location = location;
        this.StartDate = startDate;
        this.EndDate = endDate;
        this.HostName = hostName;
        this.EventName = eventName;
        this.StartTime = startTime;
        this.EndTime = endTime;
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

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
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

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }
}
