package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Activity {
    public static final String TABLE_NAME = "tbl_Activity";
    public static final String KEY_Subject = "Subject";
    public static final String KEY_ID = "ID";
    public static final String KEY_TaskID = "TaskID";
    public static final String KEY_EventID = "EventID";
    public static final String KEY_ModifiedDate = "ModifiedDate";
    public static final String KEY_ActivityStatus = "ActivityStatus";
    public static final String KEY_LeadID = "LeadID";


    private String Subject;
    private Integer ID;
    private Integer TaskID;
    private Integer EventID;
    private Date ModifiedDate;
    private String ActivityStatus;
    private Integer LeadID;

    public Activity(String Subject, Integer ID, Integer TaskID, Integer EventID, Date ModifiedDate, String ActivityStatus,Integer LeadID) {

        this.Subject = Subject;
        this.ID = ID;
        this.TaskID = TaskID;
        this.EventID = EventID;
        this.ModifiedDate = ModifiedDate;
        this.ActivityStatus = ActivityStatus;
        this.LeadID = LeadID;
    }

    public Activity() {

    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getTaskID() {
        return TaskID;
    }

    public void setTaskID(Integer taskID) {
        TaskID = taskID;
    }

    public Integer getEventID() {
        return EventID;
    }

    public void setEventID(Integer eventID) {
        EventID = eventID;
    }

    public Date getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getActivityStatus() {
        return ActivityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        ActivityStatus = activityStatus;
    }
}
