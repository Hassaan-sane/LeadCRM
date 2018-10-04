package com.example.hassaan.leadcrm.TableClasses;

public class Task {
    public static final String TABLE_NAME = "tbl_Task";
    public static final String KEY_ID = "ID";
    public static final String KEY_SUBJECT = "Subject";
    public static final String KEY_DUEDATE = "DueDate";
    public static final String KEY_PRIORITYID = "PriorityID";
    public static final String KEY_OWNERNAME = "OwnerName";
    public static final String KEY_STATUSID = "StatusID";

    public String ID;
    public String Subject;
    public String DueDate;
    public String PriorityID;
    public String OwnerName;
    public String StatusID;

    public Task(String ID, String subject, String dueDate, String priorityID, String ownerName, String statusID) {
        this.ID = ID;
        Subject = subject;
        DueDate = dueDate;
        PriorityID = priorityID;
        OwnerName = ownerName;
        StatusID = statusID;
    }

    public Task(){}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String dueDate) {
        DueDate = dueDate;
    }

    public String getPriorityID() {
        return PriorityID;
    }

    public void setPriorityID(String priorityID) {
        PriorityID = priorityID;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getStatusID() {
        return StatusID;
    }

    public void setStatusID(String statusID) {
        StatusID = statusID;
    }
}
