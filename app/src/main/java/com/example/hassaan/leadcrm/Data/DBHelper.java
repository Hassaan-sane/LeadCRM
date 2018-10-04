package com.example.hassaan.leadcrm.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hassaan.leadcrm.App.app;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;

public class DBHelper extends SQLiteOpenHelper {
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION =1;
    // Database Name
    private static final String DATABASE_NAME = "Leadcrm.db";
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

    }

}
