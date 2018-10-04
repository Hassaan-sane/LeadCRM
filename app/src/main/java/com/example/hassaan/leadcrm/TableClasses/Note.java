package com.example.hassaan.leadcrm.TableClasses;

public class Note {

    public static final String TABLE_NAME = "tbl_Note";
    public static final String KEY_ID = "ID";
    public static final String KEY_TITLENAME = "TitleName";
    public static final String KEY_DETAILS = "Details";
    public static final String KEY_LEADID = "LeadID";
    public static final String CREATED_DATE = "CreatedDate";

    private String ID;
    private String TitleName;
    private String Details;
    private String LeadID;
    private String CreatedDate;

    public Note(String ID, String titleName, String details, String leadID, String createdDate) {
        this.ID = ID;
        this.TitleName = titleName;
        this.Details = details;
        this.LeadID = leadID;
        this.CreatedDate = createdDate;
    }

    public Note()
    {}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getLeadID() {
        return LeadID;
    }

    public void setLeadID(String leadID) {
        LeadID = leadID;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }
}
