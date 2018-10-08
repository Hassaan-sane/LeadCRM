package com.example.hassaan.leadcrm.Repo;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.POIStatus;
import com.example.hassaan.leadcrm.TableClasses.Participient;

import java.util.ArrayList;
import java.util.List;


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
    public int insertInPOIStatus(POIStatus poiStatus1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(POIStatus.KEY_ID, poiStatus1.getID());
        values.put(POIStatus.KEY_POIStatusName, poiStatus1.getPOIStatusName());

        int POIStatusId =(int)db.insert(POIStatus.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return POIStatusId;
    }
    public List<POIStatus> getPOIStatusList() {

        POIStatus GetPOIStatus;
        List<POIStatus> POIStatusLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + POIStatus.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetPOIStatus= new POIStatus();
                GetPOIStatus.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(POIStatus.KEY_ID))));
                GetPOIStatus.setPOIStatusName(cursor.getString(cursor.getColumnIndex(POIStatus.KEY_POIStatusName)));


                POIStatusLists.add(GetPOIStatus);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return POIStatusLists;
    }

    public long deletefromPOIStatus(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(POIStatus.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
