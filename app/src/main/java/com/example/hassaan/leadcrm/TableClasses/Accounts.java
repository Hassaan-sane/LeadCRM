package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Accounts {

    public static final String TABLE_NAME = "tbl_Accounts";
    public static final String KEY_Name = "Name";
    public static final String KEY_ID = "ID";
    public static final String KEY_Address = "Address";
    public static final String KEY_PhoneNO = "PhoneNo";
    public static final String KEY_BOD = "BOD";
    public static final String KEY_Password = "Password";
    public static final String KEY_Salt = "Salt";
    public static final String KEY_DateCreated = "DateCreated";
    public static final String KEY_RoleID = "RoleID";
    public static final String KEY_Email = "Email";
    public static final String KEY_Desigination = "Desigination";


    public String Name;
    public Integer ID;
    public String Address;
    public String PhoneNO;
    public Date BOD;
    public String Password;
    public String Salt;
    public Date DateCreated;
    public Integer RoleID;
    public String Email;
    public String Desigination;




    public Accounts(String Name,Integer ID, String Address, String PhoneNo, Date BOD, String Password, String Salt, Date DateCreated, Integer RoleID, String Email, String Desigination) {
        this.Name = Name;
        this.ID = ID;
        this.Address = Address;
        this.PhoneNO = PhoneNo;
        this.BOD = BOD;
        this.Password = Password;
        this.Salt = Salt;
        this.DateCreated = DateCreated;
        this.RoleID = RoleID;
        this.Email = Email;
        this.Desigination = Desigination;
    }

    public Accounts() {

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

    public Date getBOD() {
        return BOD;
    }

    public void setBOD(Date BOD) {
        this.BOD = BOD;
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
