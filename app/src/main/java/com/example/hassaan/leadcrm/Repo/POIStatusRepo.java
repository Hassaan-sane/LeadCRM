package com.example.hassaan.leadcrm.Repo;


import com.example.hassaan.leadcrm.TableClasses.POIStatus;

public class POIStatusRepo {
    private POIStatus poiStatus;
    public POIStatusRepo() {
        poiStatus = new POIStatus();
    }

    public static String createTable() {
        return "CREATE TABLE " + POIStatus.TABLE_NAME +
                " (" + POIStatus.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                POIStatus.KEY_POIStatusName + " VARCHAR)";
    }
}
