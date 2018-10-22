package com.example.hassaan.leadcrm;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DBHelper;
import com.example.hassaan.leadcrm.Data.DatabaseManager;


public class app extends Application {

    private static Context context;
    private static DBHelper dbHelper;
    private static DatabaseManager databaseManager;

    @Override
    public void onCreate() {
        super.onCreate();

        context=this.getApplicationContext();
        dbHelper=new DBHelper(context);
        databaseManager.initialize(dbHelper);

        SharedPreferences wmbPreference = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = wmbPreference.getBoolean("FIRSTRUN", true);
        Log.e("OnCreate","App");
        if (isFirstRun)
        {
            SharedPreferences.Editor editor = wmbPreference.edit();
            editor.putBoolean("FIRSTRUN", false);
            editor.commit();
        }

    }
    public static Context getContext() {
        return context;
    }

    /*  private static Context context;
    private static DBHelper dbHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        dbHelper = new DBHelper();
        DatabaseManager.initialize(dbHelper);
        SharedPreferences wmbPreference = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = wmbPreference.getBoolean("FIRSTRUN", true);
        Log.e("OnCreate","App");
        if (isFirstRun)
        {
            SharedPreferences.Editor editor = wmbPreference.edit();
            editor.putBoolean("FIRSTRUN", false);
            editor.commit();
        }



    }

    public static Context getContext() {
        return context;
    }*/
}
