package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Priority;
import com.example.hassaan.leadcrm.TableClasses.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleRepo {
    private Role role;
    public RoleRepo() {
        role = new Role();
    }

    public static String createTable() {
        return "CREATE TABLE " + Role.TABLE_NAME +
                " (" + Role.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Role.KEY_Name + " VARCHAR)";

    }

    public int insertInRole(Role role1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Role.KEY_ID, role1.getID());
        values.put(Role.KEY_Name, role1.getName());


        int RoleId =(int)db.insert(Role.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return RoleId;
    }

    public List<Role> getRoleList() {

        Role GetRole;
        List<Role> RoleLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Role.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetRole= new Role();
                GetRole.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Role.KEY_ID))));
                GetRole.setName(cursor.getString(cursor.getColumnIndex(Role.KEY_Name)));


                RoleLists.add(GetRole);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return RoleLists;
    }



    public long deletefromRole(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Role.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
