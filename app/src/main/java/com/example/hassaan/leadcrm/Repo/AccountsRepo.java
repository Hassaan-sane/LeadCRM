package com.example.hassaan.leadcrm.Repo;

import com.example.hassaan.leadcrm.TableClasses.Accounts;
import com.example.hassaan.leadcrm.TableClasses.Leads;

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
                Accounts.KEY_BOD + " DATETIME, "+
                Accounts.KEY_Email + " VARCHAR, "+
                Accounts.KEY_PhoneNO + " VARCHAR, "+
                Accounts.KEY_Password + " VARCHAR, "+
                Accounts.KEY_Salt + " VARCHAR, "+
                Accounts.KEY_DateCreated + " DATETIME, "+
                Accounts.KEY_RoleID + " INTEGER, "+
                Accounts.KEY_Desigination + " VARCHAR)";
    }
}
