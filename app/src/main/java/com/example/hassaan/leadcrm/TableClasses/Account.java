package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Account {

    public static final String TABLE_NAME = "tbl_Account";
    public static final String KEY_ID = "ID";
    public static final String KEY_USERID = "UserID";
    public static final String KEY_ACCOUNTNAME = "AccountName";
    public static final String KEY_ACCOUNTNO = "AccountNo";
    public static final String KEY_INDUSTRY = "Industry";
    public static final String KEY_RATING = "Rating";
    public static final String KEY_PHONENO = "PhoneNo";
    public static final String KEY_WEBSITE = "Website";
    public static final String KEY_OWNERSHIP = "OwnerShip";
    public static final String KEY_EMPLOYEENO = "EmployeeNo";
    public static final String KEY_ANNUALREVENUE = "AnnualRevenue";
    public static final String KEY_CREATEDBY = "CreatedBy";
    public static final String KEY_MODIFIEDBY = "ModifiedBy";
    public static final String KEY_BILLINGSTREET = "BillingStreet";
    public static final String KEY_BILLINGSTATE = "BillingState";
    public static final String KEY_BILLINGZIP = "BillingZip";
    public static final String KEY_BILLINGCITY = "BillingCity";
    public static final String KEY_BILLINGCOUNTRY = "BillingCountry";
    public static final String KEY_SHIPPINGCITY = "ShippingCity";
    public static final String KEY_SHIPPINGCOUNTRY = "ShippingCountry";
    public static final String KEY_SHIPPINGZIP = "ShippingZip";
    public static final String KEY_SHIPPINGSTATE = "ShippingState";
    public static final String KEY_SHIPPINGSTREET = "ShipingStreet";
    public static final String KEY_DESCRIPTION = "Description";


    private int UserID;
    private int ID;
    private String AccountName;
    private int AccountNo;
    private String Industry;
    private String Rating;
    private String PhoneNo;
    private String Website;
    private String OwnerShip;
    private int EmployeeNo;
    private int AnnualRevenue;
    private Date CreatedBy;
    private Date ModifiedBy;

    private String BillingStreet;
    private String BillingState;
    private int BillingZip;
    private String BillingCity;
    private String BillingCountry;

    private String ShippingCity;
    private String ShippingCountry;
    private int ShippingZip;
    private String ShippingState;
    private String ShippingStreet;

    private String Description;

    public Account() {
    }

    public Account(int userID, int ID, String accountName, int accountNo, String industry, String rating, String phoneNo, String website, String ownerShip, int employeeNo, int annualRevenue, Date createdBy, Date modifiedBy, String billingStreet, String billingState, int billingZip, String billingCity, String billingCountry, String shippingCity, String shippingCountry, int shippingZip, String shippingState, String shippingStreet, String description) {
        UserID = userID;
        this.ID = ID;
        AccountName = accountName;
        AccountNo = accountNo;
        Industry = industry;
        Rating = rating;
        PhoneNo = phoneNo;
        Website = website;
        OwnerShip = ownerShip;
        EmployeeNo = employeeNo;
        AnnualRevenue = annualRevenue;
        CreatedBy = createdBy;
        ModifiedBy = modifiedBy;
        BillingStreet = billingStreet;
        BillingState = billingState;
        BillingZip = billingZip;
        BillingCity = billingCity;
        BillingCountry = billingCountry;
        ShippingCity = shippingCity;
        ShippingCountry = shippingCountry;
        ShippingZip = shippingZip;
        ShippingState = shippingState;
        ShippingStreet = shippingStreet;
        Description = description;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getOwnerShip() {
        return OwnerShip;
    }

    public void setOwnerShip(String ownerShip) {
        OwnerShip = ownerShip;
    }

    public int getEmployeeNo() {
        return EmployeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        EmployeeNo = employeeNo;
    }

    public int getAnnualRevenue() {
        return AnnualRevenue;
    }

    public void setAnnualRevenue(int annualRevenue) {
        AnnualRevenue = annualRevenue;
    }

    public Date getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Date createdBy) {
        CreatedBy = createdBy;
    }

    public Date getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(Date modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public String getBillingStreet() {
        return BillingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        BillingStreet = billingStreet;
    }

    public String getBillingState() {
        return BillingState;
    }

    public void setBillingState(String billingState) {
        BillingState = billingState;
    }

    public int getBillingZip() {
        return BillingZip;
    }

    public void setBillingZip(int billingZip) {
        BillingZip = billingZip;
    }

    public String getBillingCity() {
        return BillingCity;
    }

    public void setBillingCity(String billingCity) {
        BillingCity = billingCity;
    }

    public String getBillingCountry() {
        return BillingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        BillingCountry = billingCountry;
    }

    public String getShippingCity() {
        return ShippingCity;
    }

    public void setShippingCity(String shippingCity) {
        ShippingCity = shippingCity;
    }

    public String getShippingCountry() {
        return ShippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        ShippingCountry = shippingCountry;
    }

    public int getShippingZip() {
        return ShippingZip;
    }

    public void setShippingZip(int shippingZip) {
        ShippingZip = shippingZip;
    }

    public String getShippingState() {
        return ShippingState;
    }

    public void setShippingState(String shippingState) {
        ShippingState = shippingState;
    }

    public String getShippingStreet() {
        return ShippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        ShippingStreet = shippingStreet;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
