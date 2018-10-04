package com.example.hassaan.leadcrm.TableClasses;

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


    public String Name = "Name";
    public String ID = "ID";
    public String Address = "Address";
    public String PhoneNO = "PhoneNo";
    public String BOD = "BOD";
    public String Password = "Password";
    public String Salt = "Salt";
    public String DateCreated = "DateCreated";
    public String RoleID = "RoleID";
    public String Email = "Email";
    public String Desigination = "Desigination";




    public Accounts(String Name,String ID, String Address, String PhoneNO, String BOD, String Password, String Salt, String DateCreated, String RoleID, String Email, String Desigination) {
        this.Name = "Name";
        this.ID = "ID";
        this.Address = "Address";
        this.PhoneNO = "PhoneNo";
        this.BOD = "BOD";
        this.Password = "Password";
        this.Salt = "Salt";
        this.DateCreated = "DateCreated";
        this.RoleID = "RoleID";
        this.Email = "Email";
        this.Desigination = "Desigination";
    }

    public Accounts() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getBOD() {
        return BOD;
    }

    public void setBOD(String BOD) {
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

    public String getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(String dateCreated) {
        DateCreated = dateCreated;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String roleID) {
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
