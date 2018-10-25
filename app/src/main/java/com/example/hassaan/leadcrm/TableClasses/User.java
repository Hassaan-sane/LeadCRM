package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class User {

    public static final String TABLE_NAME = "tbl_User";
    public static final String KEY_Name = "Name";
    public static final String KEY_ID = "ID";
    public static final String KEY_Address = "Address";
    public static final String KEY_PhoneNO = "PhoneNo";
    public static final String KEY_DOB = "DOB";
    public static final String KEY_Password = "Password";
    public static final String KEY_Salt = "Salt";
    public static final String KEY_DateCreated = "DateCreated";
    public static final String KEY_RoleID = "RoleID";
    public static final String KEY_Email = "Email";
    public static final String KEY_Desigination = "Desigination";


    private String Name;
    private Integer ID;
    private String Address;
    private String PhoneNO;
    private Date DOB;
    private String Password;
    private String Salt;
    private Date DateCreated;
    private Integer RoleID;
    private String Email;
    private String Desigination;



    public User() {

    }

    public User(String name, Integer ID, String address, String phoneNO, Date DOB, String password, String salt, Date dateCreated, Integer roleID, String email, String desigination) {
        Name = name;
        this.ID = ID;
        Address = address;
        PhoneNO = phoneNO;
        this.DOB = DOB;
        Password = password;
        Salt = salt;
        DateCreated = dateCreated;
        RoleID = roleID;
        Email = email;
        Desigination = desigination;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNO() {
        return PhoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        PhoneNO = phoneNO;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        DateCreated = dateCreated;
    }

    public Integer getRoleID() {
        return RoleID;
    }

    public void setRoleID(Integer roleID) {
        RoleID = roleID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDesigination() {
        return Desigination;
    }

    public void setDesigination(String desigination) {
        Desigination = desigination;
    }
}
