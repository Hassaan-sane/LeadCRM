package com.example.hassaan.leadcrm.TableClasses;

public class Priority {
    public static final String TABLE_NAME = "tbl_Priority";
    public static final String KEY_Name = "Name";
    public static final String KEY_ID = "ID";


    public String Name;
    public Integer ID;

    public Priority(String Name,Integer ID ) {

        this.Name = Name;
        this.ID = ID;
    }

    public Priority(){

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
