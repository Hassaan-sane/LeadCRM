package com.example.hassaan.leadcrm.TableClasses;


public class Leads {
    public static final String TABLE_NAME = "LEADS";
    public static final String KEY_LeadOwner = "LeadOwner";
    public static final String KEY_ID = "ID";
    public static final String KEY_Title = "Ttile";
    public static final String KEY_Phone = "PhoneNo";
    public static final String KEY_Mobile = "MobileNo";
    public static final String KEY_LeadSource = "LeadSource";
    public static final String KEY_Industry = "Industry";
    public static final String KEY_AnnualRevenue = "AnnualRevenue";
    public static final String KEY_ModifiedBy = "ModifiedDate";
    public static final String KEY_CompanyName = "GroupName";
    public static final String KEY_LeadName = "LeadName";
    public static final String KEY_Email = "LeadEmail";
    public static final String KEY_Website = "Website";
    public static final String KEY_LeadStatus = "LeadStatus";
    public static final String KEY_No_of_Employees = "NoOfEmployee";
    public static final String KEY_CreatedBy = "CreatedBy";
    public static final String KEY_SkypeID = "SkypeID";
//    public static final String KEY_Street = "Street";
//    public static final String KEY_State = "State";
//    public static final String KEY_City = "City";
//    public static final String KEY_ZipCode = "ZipCode";
//    public static final String KEY_Country = "Country";


    public String LeadOwner;
    public String ID;
    public String Title;
    public String Phone;
    public String Mobile;
    public String LeadSource;
    public String Industry;
    public String AnnualRevenue;
    public String ModifiedBy;
    public String CompanyName;
    public String LeadName;
    public String Email;
    public String Website;
    public String LeadStatus;
    public String No_of_Employees;
    public String CreatedBy;
    public String SkypeID;
//    public String Street;
//    public String State;
//    public String City;
//    public String ZipCode;
//    public String Country;

    public Leads(String LeadOwner, String ID, String Title, String Phone, String Mobile, String LeadSource, String Industry,
                 String AnnualRevenue, String ModifiedBy, String CompanyName, String LeadName, String Email, String Website, String LeadStatus,
                 String No_of_Employees, String CreatedBy, String SkypeID) {
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
        this.LeadStatus = LeadStatus;
        this.No_of_Employees =No_of_Employees;
        this.CreatedBy=CreatedBy;
        this.SkypeID=SkypeID;
//        this.Street=Street;
//        this.State=State;
//        this.City=City;
//        this.ZipCode=ZipCode;
//        this.Country=Country;
    }

    public Leads() {

    }

    public String getLeadOwner() {
        return LeadOwner;
    }

    public void setLeadOwner(String leadOwner) {
        LeadOwner = leadOwner;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getAnnualRevenue() {
        return AnnualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        AnnualRevenue = annualRevenue;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
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

    public String getLeadStatus() {
        return LeadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        LeadStatus = leadStatus;
    }

    public String getNo_of_Employees() {
        return No_of_Employees;
    }

    public void setNo_of_Employees(String no_of_Employees) {
        No_of_Employees = no_of_Employees;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getSkypeID() {
        return SkypeID;
    }

    public void setSkypeID(String skypeID) {
        SkypeID = skypeID;
    }


}
