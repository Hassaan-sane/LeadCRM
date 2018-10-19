package com.example.hassaan.leadcrm.TableClasses;


import java.util.Date;

public class Leads {
    public static final String TABLE_NAME = "tbl_Lead";
    public static final String KEY_LeadOwner = "LeadOwner";
    public static final String KEY_ID = "ID";
    public static final String KEY_Title = "Ttile";
    public static final String KEY_Phone = "PhoneNo";
    public static final String KEY_Mobile = "MobileNo";
    public static final String KEY_LeadSource = "LeadSource";
    public static final String KEY_Industry = "Industry";
    public static final String KEY_AnnualRevenue = "AnnualRevenue";
    public static final String KEY_ModifiedBy = "ModifiedDate";
    public static final String KEY_CompanyName = "CompanyName";
    public static final String KEY_LeadName = "LeadName";
    public static final String KEY_Email = "LeadEmail";
    public static final String KEY_Website = "Website";
    public static final String KEY_No_of_Employees = "NoOfEmployee";
    public static final String KEY_CreatedBy = "CreatedBy";
    public static final String KEY_SkypeID = "SkypeID";


    private String LeadOwner;
    private Integer ID;
    private String Title;
    private String Phone;
    private String Mobile;
    private String LeadSource;
    private String Industry;
    private Integer AnnualRevenue;
    private Date ModifiedBy;
    private String CompanyName;
    private String LeadName;
    private String Email;
    private String Website;
    private Integer No_of_Employees;
    private Date CreatedBy;
    private String SkypeID;

    public Leads(String LeadOwner, Integer ID, String Title, String Phone, String Mobile, String LeadSource, String Industry,
                 Integer AnnualRevenue, Date ModifiedBy, String CompanyName, String LeadName, String Email, String Website,
                 Integer No_of_Employees, Date CreatedBy, String SkypeID) {
        this.LeadOwner = LeadOwner;
        this.ID = ID;
        this.Title = Title;
        this.Phone = Phone;
        this.Mobile = Mobile;
        this.LeadSource = LeadSource;
        this.Industry = Industry;
        this.AnnualRevenue = AnnualRevenue;
        this.ModifiedBy = ModifiedBy;
        this.CompanyName = CompanyName;
        this.LeadName = LeadName;
        this.Email = Email;
        this.Website = Website;
        this.No_of_Employees =No_of_Employees;
        this.CreatedBy=CreatedBy;
        this.SkypeID=SkypeID;
    }

    public Leads() {

    }

    public String getLeadOwner() {
        return LeadOwner;
    }

    public void setLeadOwner(String leadOwner) {
        LeadOwner = leadOwner;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getLeadSource() {
        return LeadSource;
    }

    public void setLeadSource(String leadSource) {
        LeadSource = leadSource;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public Integer getAnnualRevenue() {
        return AnnualRevenue;
    }

    public void setAnnualRevenue(Integer annualRevenue) {
        AnnualRevenue = annualRevenue;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getLeadName() {
        return LeadName;
    }

    public void setLeadName(String leadName) {
        LeadName = leadName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getNo_of_Employees() {
        return No_of_Employees;
    }

    public void setNo_of_Employees(Integer no_of_Employees) {
        No_of_Employees = no_of_Employees;
    }

    public Date getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(Date modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public Date getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Date createdBy) {
        CreatedBy = createdBy;
    }

    public String getSkypeID() {
        return SkypeID;
    }

    public void setSkypeID(String skypeID) {
        SkypeID = skypeID;
    }


}
