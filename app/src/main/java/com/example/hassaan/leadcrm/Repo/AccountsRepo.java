package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Accounts;
import com.example.hassaan.leadcrm.TableClasses.Role;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AccountsRepo {
    private Accounts accounts;
    public AccountsRepo() {
        accounts = new Accounts();
    }

    public static String createTable() {
        return "CREATE TABLE " + Accounts.TABLE_NAME +
                " (" + Accounts.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Accounts.KEY_Name + " VARCHAR, " +
                Accounts.KEY_Address + " VARCHAR, " +
                Accounts.KEY_DOB + " DATETIME, "+
                Accounts.KEY_Email + " VARCHAR, "+
                Accounts.KEY_PhoneNO + " VARCHAR, "+
                Accounts.KEY_Password + " VARCHAR, "+
                Accounts.KEY_Salt + " VARCHAR, "+
                Accounts.KEY_DateCreated + " DATETIME, "+
                Accounts.KEY_RoleID + " INTEGER, "+
                Accounts.KEY_Desigination + " VARCHAR, FOREIGN KEY(" + Accounts.KEY_RoleID + ")REFERENCES " + Role.TABLE_NAME + "(" + Role.KEY_ID + ") )";
    }
    public int insertInAccounts(Accounts accounts1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Accounts.KEY_ID, accounts1.getID());
        values.put(Accounts.KEY_Name, accounts1.getName());
        values.put(Accounts.KEY_Address, accounts1.getAddress());
        values.put(Accounts.KEY_DOB, accounts1.getDOB().toString());
        values.put(Accounts.KEY_Email, accounts1.getEmail());
        values.put(Accounts.KEY_PhoneNO, accounts1.getPhoneNO());
        values.put(Accounts.KEY_Password, accounts1.getPassword());
        values.put(Accounts.KEY_Salt, accounts1.getSalt());
        values.put(Accounts.KEY_DateCreated, accounts1.getDateCreated().toString());
        values.put(Accounts.KEY_RoleID, accounts1.getRoleID());
        values.put(Accounts.KEY_Desigination, accounts1.getDesigination());


        int AccountsId =(int)db.insert(accounts1.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return AccountsId;
    }
    public List<Accounts> getAccountsList() {

        Accounts GetAccounts;
        List<Accounts> AccountsLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Accounts.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetAccounts = new Accounts();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                GetAccounts.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Accounts.KEY_ID))));
                GetAccounts.setName(cursor.getString(cursor.getColumnIndex(Accounts.KEY_Name)));
                GetAccounts.setAddress(cursor.getString(cursor.getColumnIndex(Accounts.KEY_Address)));
                GetAccounts.setEmail(cursor.getString(cursor.getColumnIndex(Accounts.KEY_Email)));
                GetAccounts.setPhoneNO(cursor.getString(cursor.getColumnIndex(Accounts.KEY_PhoneNO)));
                GetAccounts.setPassword(cursor.getString(cursor.getColumnIndex(Accounts.KEY_Password)));
                GetAccounts.setSalt(cursor.getString(cursor.getColumnIndex(Accounts.KEY_Salt)));
                GetAccounts.setRoleID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Accounts.KEY_RoleID))));
                GetAccounts.setDesigination(cursor.getString(cursor.getColumnIndex(Accounts.KEY_Desigination)));
                try {
                    GetAccounts.setDOB(sdf.parse(cursor.getString(cursor.getColumnIndex(Accounts.KEY_DOB))));
                    GetAccounts.setDateCreated(sdf.parse(cursor.getString(cursor.getColumnIndex(Accounts.KEY_DateCreated))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                AccountsLists.add(GetAccounts);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return AccountsLists;
    }

    public long deletefromAccounts(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Accounts.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
