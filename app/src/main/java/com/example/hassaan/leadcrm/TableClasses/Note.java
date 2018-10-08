package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Note {

    public static final String TABLE_NAME = "tbl_Note";
    public static final String KEY_ID = "ID";
    public static final String KEY_TITLENAME = "TitleName";
    public static final String KEY_DETAILS = "Details";
    public static final String KEY_LEADID = "LeadID";
    public static final String KEY_CREATED_DATE = "CreatedDate";

    private Integer ID;
    private String TitleName;
    private String Details;
    private Integer LeadID;
    private Date CreatedDate;

    public Note(Integer ID, String titleName, String details, Integer leadID, Date createdDate) {
        this.ID = ID;
        this.TitleName = titleName;
        this.Details = details;
        this.LeadID = leadID;
        this.CreatedDate = createdDate;
    }

    public Note()
    {}

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
