package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Contact {

    public static final String TABLE_NAME ="tbl_Contact";
    public static final String KEY_ID="ID";
    public static final String KEY_UserID="UserID";
    public static final String KEY_LeadSource ="LeadSource";
    public static final String KEY_FirstName="FirstName";
    public static final String KEY_LastName="LastName";
    public static final String KEY_Email="Email";
    public static final String KEY_PhoneNo="PhoneNo";
    public static final String KEY_Department="Department";
    public static final String KEY_MobileNo="MobileNo";
    public static final String KEY_Fax="Fax";
    public static final String KEY_AssistantName="AssistantName";
    public static final String KEY_DOB="DOB";
    public static final String KEY_ReportsTo="ReportsTo";
    public static final String KEY_AsstntPhoneNo="AsstntPhoneNo";
    public static final String KEY_SkypeID="SkypeID";
    public static final String KEY_MStreet="MStreet";
    public static final String KEY_MCity="MCity";
    public static final String KEY_MState="MState";
    public static final String KEY_MZip="MZip";
    public static final String KEY_MCountry="MCountry";
    public static final String KEY_OthCity="OthCity";
    public static final String KEY_OthState="OthState";
    public static final String KEY_OthZip="OthZip";
    public static final String KEY_OthCountry="OthCountry";
    public static final String KEY_OthStreet="OthStreet";
    public static final String KEY_Details="Details";


    private int ID;
    private int UserID;
    private String LeadSource;
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNo;
    private String Department;
    private String MobileNo;
    private String Fax;
    private String AssistantName;
    private Date DOB;
    private String ReportsTo;
    private String AsstntPhoneNo;
    private String SkypeID;
    private String MStreet;
    private String MCity;
    private String MState;
    private int MZip;
    private String MCountry;
    private String OthCity;
    private String OthState;
    private int OthZip;
    private String OthCountry;
    private String OthStreet;
    private String Details;


    public Contact() {
    }

    public Contact(int ID, int userID, String leadSource, String firstName, String lastName, String email, String phoneNo, String department, String mobileNo, String fax, String assistantName, Date DOB, String reportsTo, String asstntPhoneNo, String skypeID, String MStreet, String MCity, String MState, int MZip, String MCountry, String othCity, String othState, int othZip, String othCountry, String othStreet, String details) {
        this.ID = ID;
        UserID = userID;
        LeadSource = leadSource;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        PhoneNo = phoneNo;
        Department = department;
        MobileNo = mobileNo;
        Fax = fax;
        AssistantName = assistantName;
        this.DOB = DOB;
        ReportsTo = reportsTo;
        AsstntPhoneNo = asstntPhoneNo;
        SkypeID = skypeID;
        this.MStreet = MStreet;
        this.MCity = MCity;
        this.MState = MState;
        this.MZip = MZip;
        this.MCountry = MCountry;
        OthCity = othCity;
        OthState = othState;
        OthZip = othZip;
        OthCountry = othCountry;
        OthStreet = othStreet;
        Details = details;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getLeadSource() {
        return LeadSource;
    }

    public void setLeadSource(String leadSource) {
        LeadSource = leadSource;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getAssistantName() {
        return AssistantName;
    }

    public void setAssistantName(String assistantName) {
        AssistantName = assistantName;
    }

    public String getDOB() {
        return String.valueOf(DOB);
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(String reportsTo) {
        ReportsTo = reportsTo;
    }

    public String getAsstntPhoneNo() {
        return AsstntPhoneNo;
    }

    public void setAsstntPhoneNo(String asstntPhoneNo) {
        AsstntPhoneNo = asstntPhoneNo;
    }

    public String getSkypeID() {
        return SkypeID;
    }

    public void setSkypeID(String skypeID) {
        SkypeID = skypeID;
    }

    public String getMStreet() {
        return MStreet;
    }

    public void setMStreet(String MStreet) {
        this.MStreet = MStreet;
    }

    public String getMCity() {
        return MCity;
    }

    public void setMCity(String MCity) {
        this.MCity = MCity;
    }

    public String getMState() {
        return MState;
    }

    public void setMState(String MState) {
        this.MState = MState;
    }

    public int getMZip() {
        return MZip;
    }

    public void setMZip(int MZip) {
        this.MZip = MZip;
    }

    public String getMCountry() {
        return MCountry;
    }

    public void setMCountry(String MCountry) {
        this.MCountry = MCountry;
    }

    public String getOthCity() {
        return OthCity;
    }

    public void setOthCity(String othCity) {
        OthCity = othCity;
    }

    public String getOthState() {
        return OthState;
    }

    public void setOthState(String othState) {
        OthState = othState;
    }

    public int getOthZip() {
        return OthZip;
    }

    public void setOthZip(int othZip) {
        OthZip = othZip;
    }

    public String getOthCountry() {
        return OthCountry;
    }

    public void setOthCountry(String othCountry) {
        OthCountry = othCountry;
    }

    public String getOthStreet() {
        return OthStreet;
    }

    public void setOthStreet(String othStreet) {
        OthStreet = othStreet;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
