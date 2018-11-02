package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Role;
import com.example.hassaan.leadcrm.TableClasses.Status;

import java.util.ArrayList;
import java.util.List;

public class StatusRepo {
    private Status status;
    public StatusRepo() {
        status = new Status();
    }

    public static String createTable() {
        return "CREATE TABLE " + Status.TABLE_NAME +
                " (" + Status.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Status.KEY_Name + " VARCHAR)";
    }
    public int insertInStatus(Status status1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Status.KEY_ID, status1.getID());
        values.put(Status.KEY_Name, status1.getName());


        int StatusId =(int)db.insert(Status.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return StatusId;
    }


    public List<Status> getStatusList() {

        Status GetStatus;
        List<Status> StatusLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Status.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetStatus= new Status();
                GetStatus.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Status.KEY_ID))));
                GetStatus.setName(cursor.getString(cursor.getColumnIndex(Status.KEY_Name)));


                StatusLists.add(GetStatus);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return StatusLists;
    }


    public long deletefromStatus(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Status.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }

    public void delete() {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Status.TABLE_NAME, null, null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
