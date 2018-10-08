package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.POIStatus;
import com.example.hassaan.leadcrm.TableClasses.Participient;
import com.example.hassaan.leadcrm.TableClasses.Priority;

import java.util.ArrayList;
import java.util.List;

public class PriorityRepo {
    private Priority priority;
    public PriorityRepo() {
        priority = new Priority();
    }

    public static String createTable() {
        return "CREATE TABLE " + Priority.TABLE_NAME +
                " (" + Priority.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Priority.KEY_Name + " VARCHAR)";
    }
    public int insertInPriority(Priority priority1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Priority.KEY_ID, priority1.getID());
        values.put(Priority.KEY_Name, priority1.getName());

        int PriorityId =(int)db.insert(Priority.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return PriorityId;
    }


    public List<Priority> getPriorityList() {

        Priority GetPriority;
        List<Priority> PriorityLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Priority.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetPriority= new Priority();
                GetPriority.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Priority.KEY_ID))));
                GetPriority.setName(cursor.getString(cursor.getColumnIndex(Priority.KEY_Name)));


                PriorityLists.add(GetPriority);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return PriorityLists;
    }


    public long deletefromPriority(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Priority.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
