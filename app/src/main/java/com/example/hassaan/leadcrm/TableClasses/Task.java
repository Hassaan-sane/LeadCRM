package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Task {
    public static final String TABLE_NAME = "tbl_Task";
    public static final String KEY_ID = "ID";
    public static final String KEY_SUBJECT = "Subject";
    public static final String KEY_DUEDATE = "DueDate";
    public static final String KEY_PRIORITYID = "PriorityID";
    public static final String KEY_OWNERNAME = "OwnerName";
    public static final String KEY_STATUSID = "StatusID";

    public Integer ID;
    public String Subject;
    public Date DueDate;
    public Integer PriorityID;
    public String OwnerName;
    public Integer StatusID;

    public Task(Integer ID, String subject, Date dueDate, Integer priorityID, String ownerName, Integer statusID) {
        this.ID = ID;
        Subject = subject;
        DueDate = dueDate;
        PriorityID = priorityID;
        OwnerName = ownerName;
        StatusID = statusID;
    }

    public Task(){}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }

    public Integer getPriorityID() {
        return PriorityID;
    }

    public void setPriorityID(Integer priorityID) {
        PriorityID = priorityID;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public Integer getStatusID() {
        return StatusID;
    }

    public void setStatusID(Integer statusID) {
        StatusID = statusID;
    }
}
