package com.example.hassaan.leadcrm.TableClasses;

public class Activity {
    public static final String TABLE_NAME = "tbl_Activity";
    public static final String KEY_Subject = "Subject";
    public static final String KEY_ID = "ID";
    public static final String KEY_TaskID = "TaskID";
    public static final String KEY_EventID = "EventID";
    public static final String KEY_ModifiedDate = "ModifiedDate";
    public static final String KEY_ActivityStatus = "ActivityStatus";


    public String Subject;
    public String ID;
    public String TaskID;
    public String EventID;
    public String ModifiedDate;
    public String ActivityStatus;

    public Activity(String Subject, String ID, String TaskID, String EventID, String ModifiedDate, String ActivityStatus) {

        this.Subject = Subject;
        this.ID = ID;
        this.TaskID = TaskID;
        this.EventID = EventID;
        this.ModifiedDate = ModifiedDate;
        this.ActivityStatus = ActivityStatus;
    }

    public Activity() {

    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTaskID() {
        return TaskID;
    }

    public void setTaskID(String taskID) {
        TaskID = taskID;
    }

    public String getEventID() {
        return EventID;
    }

    public void setEventID(String eventID) {
        EventID = eventID;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getActivityStatus() {
        return ActivityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        ActivityStatus = activityStatus;
    }
}
