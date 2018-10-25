package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Account;
import com.example.hassaan.leadcrm.TableClasses.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AccountsRepo {
    private Account account;

    public AccountsRepo() {
        this.account = account;
    }

    public static String createTable() {
        return "CREATE TABLE " + Account.TABLE_NAME+
                " ( " +Account.KEY_ID +" INTEGER PRIMARY KEY AUTOINCREMENT , "+
                Account.KEY_USERID + " INTEGER, " +
                Account.KEY_ACCOUNTNAME + " VARCHAR, " +
                Account.KEY_ACCOUNTNO + " INTEGER, " +
                Account.KEY_INDUSTRY + " VARCHAR, " +
                Account.KEY_RATING + " VARCHAR, " +
                Account.KEY_PHONENO + " VARCHAR, " +
                Account.KEY_WEBSITE + " VARCHAR, " +
                Account.KEY_OWNERSHIP + " VARCHAR, " +
                Account.KEY_EMPLOYEENO + " INTEGER, " +
                Account.KEY_ANNUALREVENUE + " INTEGER, " +
                Account.KEY_CREATEDBY + " DATETIME, " +
                Account.KEY_MODIFIEDBY + " DATETIME, " +
                Account.KEY_BILLINGSTREET + " VARCHAR, " +
                Account.KEY_BILLINGSTATE + " VARCHAR, " +
                Account.KEY_BILLINGZIP + " INTEGER, " +
                Account.KEY_BILLINGCITY + " VARCHAR, " +
                Account.KEY_BILLINGCOUNTRY + " VARCHAR, " +
                Account.KEY_SHIPPINGCITY + " VARCHAR, " +
                Account.KEY_SHIPPINGCOUNTRY + " VARCHAR, " +
                Account.KEY_SHIPPINGZIP + " VARCHAR, " +
                Account.KEY_SHIPPINGSTATE + " VARCHAR, " +
                Account.KEY_SHIPPINGSTREET + " VARCHAR, " +
                Account.KEY_DESCRIPTION + " VARCHAR, " +
                " VARCHAR, FOREIGN KEY(" + Account.KEY_USERID + ")REFERENCES " + User.TABLE_NAME + "(" + User.KEY_ID + ") )";

    }

    public int insertInAccount(Account account){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();

        values.put(Account.KEY_ID, account.getID());
        values.put(Account.KEY_USERID,account.getUserID());
        values.put(Account.KEY_ACCOUNTNAME,account.getAccountName());
        values.put(Account.KEY_ACCOUNTNO,account.getAccountNo());
        values.put(Account.KEY_INDUSTRY,account.getIndustry());
        values.put(Account.KEY_RATING,account.getRating());
        values.put(Account.KEY_PHONENO,account.getPhoneNo());
        values.put(Account.KEY_WEBSITE,account.getWebsite());
        values.put(Account.KEY_OWNERSHIP,account.getOwnerShip());
        values.put(Account.KEY_EMPLOYEENO,account.getEmployeeNo());
        values.put(Account.KEY_ANNUALREVENUE,account.getAnnualRevenue());
        values.put(Account.KEY_CREATEDBY,account.getCreatedBy().toString());
        values.put(Account.KEY_MODIFIEDBY,account.getModifiedBy().toString());
        values.put(Account.KEY_BILLINGSTREET,account.getBillingStreet());
        values.put(Account.KEY_BILLINGSTATE,account.getBillingState());
        values.put(Account.KEY_BILLINGZIP,account.getBillingZip());
        values.put(Account.KEY_BILLINGCITY,account.getBillingCity());
        values.put(Account.KEY_BILLINGCOUNTRY,account.getBillingCountry());
        values.put(Account.KEY_SHIPPINGCOUNTRY,account.getShippingCountry());
        values.put(Account.KEY_SHIPPINGCITY,account.getShippingCity());
        values.put(Account.KEY_SHIPPINGZIP,account.getShippingZip());
        values.put(Account.KEY_SHIPPINGSTATE,account.getShippingState());
        values.put(Account.KEY_SHIPPINGSTREET,account.getShippingState());
        values.put(Account.KEY_DESCRIPTION,account.getDescription());


        int AccountsId =(int)db.insert(account.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return AccountsId;
    }


    public int insertShortInAccount(Account account){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();

        values.put(Account.KEY_ID, account.getID());
        values.put(Account.KEY_USERID,account.getUserID());
        values.put(Account.KEY_ACCOUNTNAME,account.getAccountName());
        values.put(Account.KEY_CREATEDBY,account.getCreatedBy().toString());
        values.put(Account.KEY_MODIFIEDBY,account.getModifiedBy().toString());


        int AccountsId =(int)db.insert(account.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return AccountsId;
    }

    public int updateAccountShort(Account account){

        int AccountId;

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Account.KEY_ID, account.getID());
        values.put(Account.KEY_USERID,account.getUserID());
        values.put(Account.KEY_ACCOUNTNAME,account.getAccountName());
        values.put(Account.KEY_CREATEDBY,account.getCreatedBy().toString());
        values.put(Account.KEY_MODIFIEDBY,account.getModifiedBy().toString());

        // update-ing Row
        AccountId = db.update(Account.TABLE_NAME, values, Account.KEY_ID + " = " + account.getID(), null);
        DatabaseManager.getInstance().closeDatabase();
        return AccountId;

    }


    public List<Account> getAccountShortList() {

        Account getAccount;
        List<Account> accountLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Account.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                getAccount = new Account();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                getAccount.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Account.KEY_ID))));
                getAccount.setAccountName(cursor.getString(cursor.getColumnIndex(Account.KEY_ACCOUNTNAME)));
                getAccount.setUserID(cursor.getInt(cursor.getColumnIndex(Account.KEY_USERID)));
                try {

                    getAccount.setCreatedBy(sdf.parse(cursor.getString(cursor.getColumnIndex(Account.KEY_CREATEDBY))));
                    getAccount.setModifiedBy(sdf.parse(cursor.getString(cursor.getColumnIndex(Account.KEY_MODIFIEDBY))));
                   } catch (ParseException e) {
                    e.printStackTrace();
                }


                accountLists.add(getAccount);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return accountLists;
    }



    public long deletefromAccount(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Account.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }

}
