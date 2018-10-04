package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Role;

public class RoleRepo {
    private Role priority;
    public RoleRepo() {
        priority = new Role();
    }

    public static String createTable() {
        return "CREATE TABLE " + Role.TABLE_NAME +
                " (" + Role.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Role.KEY_Name + " VARCHAR)";

    }
}
