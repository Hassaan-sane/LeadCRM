package com.example.hassaan.leadcrm.TableClasses;

public class POIStatus {
    public static final String TABLE_NAME = "POI_Status";
    public static final String KEY_POIStatusName = "POIStatusName";
    public static final String KEY_ID = "ID";


    private String POIStatusName;
    private Integer ID;

    public POIStatus(String POIStatusName,Integer ID ) {

        this.POIStatusName = POIStatusName;
        this.ID = ID;
    }

    public POIStatus() {

    }

    public String getPOIStatusName() {
        return POIStatusName;
    }

    public void setPOIStatusName(String POIStatusName) {
        this.POIStatusName = POIStatusName;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
