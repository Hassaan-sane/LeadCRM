package com.example.hassaan.leadcrm.App;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.hassaan.leadcrm.Data.DBHelper;
import com.example.hassaan.leadcrm.Data.DatabaseManager;

public class app extends Application {
    private static Context context;
    private static DBHelper dbHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        dbHelper = new DBHelper(context);
        DatabaseManager.initializeInstance(dbHelper);
        SharedPreferences wmbPreference = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun = wmbPreference.getBoolean("FIRSTRUN", true);
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
}
