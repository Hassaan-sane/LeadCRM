package com.example.hassaan.leadcrm.TableClasses;

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

    public String ID;
    public String Location;
    public String StartDate;
    public String EndDate;
    public String HostName;
    public String EventName;
    public String StartTime;
    public String EndTime;

    public Event(String ID, String location, String startDate, String endDate, String hostName, String eventName, String startTime, String endTime) {
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
