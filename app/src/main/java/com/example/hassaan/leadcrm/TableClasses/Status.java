package com.example.hassaan.leadcrm.TableClasses;

public class Status {
    public static final String TABLE_NAME = "tbl_Status";
    public static final String KEY_Name = "Name";
    public static final String KEY_ID = "ID";

    private String Name;
    private Integer ID;

    public Status(String Name,Integer ID ) {

        this.Name = Name;
        this.ID = ID;
    }

    public Status(){

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
}
