package com.example.hassaan.leadcrm.TableClasses;

public class Participient {
    public static final String TABLE_NAME = "tbl_Participients";
    public static final String KEY_Name = "Name";
    public static final String KEY_ID = "ID";


    private String Name;
    private Integer ID;

    public Participient(String Name, Integer ID ) {

        this.Name = Name;
        this.ID = ID;
    }

    public Participient(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
