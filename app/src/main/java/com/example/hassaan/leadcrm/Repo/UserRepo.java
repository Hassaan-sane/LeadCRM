package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.User;
import com.example.hassaan.leadcrm.TableClasses.Role;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private User user;
    public UserRepo() {
        user = new User();
    }

    public static String createTable() {
        return "CREATE TABLE " + User.TABLE_NAME +
                " (" + User.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                User.KEY_Name + " VARCHAR, " +
                User.KEY_Address + " VARCHAR, " +
                User.KEY_DOB + " DATETIME, "+
                User.KEY_Email + " VARCHAR, "+
                User.KEY_PhoneNO + " VARCHAR, "+
                User.KEY_Password + " VARCHAR, "+
                User.KEY_Salt + " VARCHAR, "+
                User.KEY_DateCreated + " DATETIME, "+
                User.KEY_RoleID + " INTEGER, "+
                User.KEY_Desigination + " VARCHAR, FOREIGN KEY(" + User.KEY_RoleID + ")REFERENCES " + Role.TABLE_NAME + "(" + Role.KEY_ID + ") )";
    }
    public int insertInUser(User user1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(User.KEY_ID, user1.getID());
        values.put(User.KEY_Name, user1.getName());
        values.put(User.KEY_Address, user1.getAddress());
        values.put(User.KEY_DOB, user1.getDOB().toString());
        values.put(User.KEY_Email, user1.getEmail());
        values.put(User.KEY_PhoneNO, user1.getPhoneNO());
        values.put(User.KEY_Password, user1.getPassword());
        values.put(User.KEY_Salt, user1.getSalt());
        values.put(User.KEY_DateCreated, user1.getDateCreated().toString());
        values.put(User.KEY_RoleID, user1.getRoleID());
        values.put(User.KEY_Desigination, user1.getDesigination());


        int AccountsId =(int)db.insert(user1.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return AccountsId;
    }

    public int insertShortInUser(User user){

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(User.KEY_ID, user.getID());
        values.put(User.KEY_Name, user.getName());
        values.put(User.KEY_Address, user.getAddress());
        values.put(User.KEY_DOB, user.getDOB().toString());
        values.put(User.KEY_Email, user.getEmail());
        values.put(User.KEY_PhoneNO, user.getPhoneNO());
        values.put(User.KEY_Password, user.getPassword());
        values.put(User.KEY_Salt, user.getSalt());
        values.put(User.KEY_DateCreated, user.getDateCreated().toString());
        values.put(User.KEY_RoleID, user.getRoleID());
        values.put(User.KEY_Desigination, user.getDesigination());


        int AccountsId =(int)db.insert(user.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return AccountsId;
    }

    public List<User> getUserList() {

        User getUser;
        List<User> userLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + User.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                getUser = new User();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                getUser.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(User.KEY_ID))));
                getUser.setName(cursor.getString(cursor.getColumnIndex(User.KEY_Name)));
                getUser.setAddress(cursor.getString(cursor.getColumnIndex(User.KEY_Address)));
                getUser.setEmail(cursor.getString(cursor.getColumnIndex(User.KEY_Email)));
                getUser.setPhoneNO(cursor.getString(cursor.getColumnIndex(User.KEY_PhoneNO)));
                getUser.setPassword(cursor.getString(cursor.getColumnIndex(User.KEY_Password)));
                getUser.setSalt(cursor.getString(cursor.getColumnIndex(User.KEY_Salt)));
                getUser.setRoleID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(User.KEY_RoleID))));
                getUser.setDesigination(cursor.getString(cursor.getColumnIndex(User.KEY_Desigination)));
                try {
                    getUser.setDOB(sdf.parse(cursor.getString(cursor.getColumnIndex(User.KEY_DOB))));
                    getUser.setDateCreated(sdf.parse(cursor.getString(cursor.getColumnIndex(User.KEY_DateCreated))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                userLists.add(getUser);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return userLists;
    }

    public long deletefromUser(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(User.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
