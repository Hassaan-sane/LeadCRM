package com.example.hassaan.leadcrm.TableClasses;

public class Role {
    public static final String TABLE_NAME = "tbl_Role";
    public static final String KEY_Name = "Name";
    public static final String KEY_ID = "ID";

    private String Name;
    private Integer ID;

    public Role(String Name,Integer ID ) {

        this.Name = Name;
        this.ID = ID;
    }

    public Role(){

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
