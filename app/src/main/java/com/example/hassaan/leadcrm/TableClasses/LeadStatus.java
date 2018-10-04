package com.example.hassaan.leadcrm.TableClasses;

public class LeadStatus {
    public static final String TABLE_NAME = "tbl_LeadStatus";
    public static final String KEY_LeadStatusName = "LeadStatusName";
    public static final String KEY_ID = "ID";


    private String LeadStatusName;
    private Integer ID;

    public LeadStatus(String LeadStatusName,Integer ID ) {

        this.LeadStatusName = LeadStatusName;
        this.ID = ID;
    }

    public LeadStatus() {

    }

    public String getLeadStatusName() {
        return LeadStatusName;
    }

    public void setLeadStatusName(String leadStatusName) {
        LeadStatusName = leadStatusName;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
