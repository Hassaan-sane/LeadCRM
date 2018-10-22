package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Note {

    public static final String TABLE_NAME = "tbl_Note";
    public static final String KEY_ID = "ID";
    public static final String KEY_TITLENAME = "TitleName";
    public static final String KEY_DETAILS = "Details";
    public static final String KEY_LEADID = "LeadID";
    public static final String KEY_CREATED_DATE = "CreatedDate";
    public static final String KEY_ACCOUNTID = "AccountID";
    public static final String KEY_CONTACTID = "ContactID";

    private Integer ID;
    private String TitleName;
    private String Details;
    private Integer LeadID;
    private Date CreatedDate;
    private int AccountID;
    private int ContactID;

    public Note(Integer ID, String titleName, String details, Integer leadID, Date createdDate, int accountID, int contactID) {
        this.ID = ID;
        TitleName = titleName;
        Details = details;
        LeadID = leadID;
        CreatedDate = createdDate;
        AccountID = accountID;
        ContactID = contactID;
    }

    public Note()
    {}

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public int getContactID() {
        return ContactID;
    }

    public void setContactID(int contactID) {
        ContactID = contactID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitleName() {
        return TitleName;
    }

    public void setTitleName(String titleName) {
        TitleName = titleName;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public Integer getLeadID() {
        return LeadID;
    }

    public void setLeadID(Integer leadID) {
        LeadID = leadID;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }
}
