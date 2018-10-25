package com.example.hassaan.leadcrm.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.hassaan.leadcrm.Repo.AccountsRepo;
import com.example.hassaan.leadcrm.Repo.UserRepo;
import com.example.hassaan.leadcrm.Repo.ActivityRepo;
import com.example.hassaan.leadcrm.Repo.EventParticipientRepo;
import com.example.hassaan.leadcrm.Repo.EventRepo;
import com.example.hassaan.leadcrm.Repo.LeadStatusRepo;
import com.example.hassaan.leadcrm.Repo.LeadsRepo;
import com.example.hassaan.leadcrm.Repo.NoteRepo;
import com.example.hassaan.leadcrm.Repo.POIStatusRepo;
import com.example.hassaan.leadcrm.Repo.ParticipientRepo;
import com.example.hassaan.leadcrm.Repo.PriorityRepo;
import com.example.hassaan.leadcrm.Repo.ReminderRepo;
import com.example.hassaan.leadcrm.Repo.RoleRepo;
import com.example.hassaan.leadcrm.Repo.StatusRepo;
import com.example.hassaan.leadcrm.Repo.TaskRepo;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.Leads;

public class DBHelper extends SQLiteOpenHelper {
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION =3;
    // Database Name
    private static final String DATABASE_NAME = "leadcrmdb.db";
    private Context context;


    public DBHelper(Context context) {
        super(context.getApplicationContext(), DATABASE_NAME, null, DATABASE_VERSION);
        Log.e("Tag","In Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e("Tag","OnCreate");
        db.execSQL(ParticipientRepo.createTable());
        db.execSQL(POIStatusRepo.createTable());
        db.execSQL(PriorityRepo.createTable());
        db.execSQL(ReminderRepo.createTable());
        db.execSQL(RoleRepo.createTable());
        db.execSQL(StatusRepo.createTable());
        Log.e("Tag","AfterSatus");
        db.execSQL(TaskRepo.createTable());
        Log.e("Tag","Aftertask");
        db.execSQL(UserRepo.createTable());
        Log.e("Tag","AfterAccounts");
        db.execSQL(EventRepo.createTable());
        Log.e("Tag","AfterEventRepo");
        db.execSQL(LeadsRepo.createTable());
        Log.e("Tag","AfterLeadsRepo");
        db.execSQL(EventParticipientRepo.createTable());
        db.execSQL(NoteRepo.createTable());
        db.execSQL(LeadStatusRepo.createTable());
        db.execSQL(ActivityRepo.createTable());
        Log.e("Tag","Finish OnCreate");
        db.execSQL(AccountsRepo.createTable());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + Leads.TABLE_NAME + Event.TABLE_NAME);
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
