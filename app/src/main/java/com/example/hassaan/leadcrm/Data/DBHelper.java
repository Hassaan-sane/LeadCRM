package com.example.hassaan.leadcrm.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hassaan.leadcrm.App.app;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.TableClasses.Leads;

public class DBHelper extends SQLiteOpenHelper {
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION =1;
    // Database Name
    private static final String DATABASE_NAME = "leadcrm.db";
    private Context context;



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
       // this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(LeadsRepo.createTable());
//        db.execSQL(ExpenseTypeRepo.createTable());
//        db.execSQL(IncomeRepo.createTable());
//        db.execSQL(IncomeTypeRepo.createTable());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + Leads.TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData (String title, String phone, String mobile)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Leads.KEY_Title, title);
        cv.put(Leads.KEY_Phone, phone);
        cv.put(Leads.KEY_Mobile, mobile);
        long result = db.insert(Leads.TABLE_NAME, null, cv);

        if(result == -1)
        {
            return false;
        }
        else
        {return true;}
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+Leads.TABLE_NAME, null);
        return res;
    }

}
