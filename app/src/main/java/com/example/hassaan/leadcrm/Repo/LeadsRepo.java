package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Event;
import com.example.hassaan.leadcrm.TableClasses.LeadStatus;
import com.example.hassaan.leadcrm.TableClasses.Leads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LeadsRepo {

    private Leads leads;
    public LeadsRepo() {
        leads = new Leads();
    }

    public static String createTable() {
        return "CREATE TABLE " + Leads.TABLE_NAME +
                " (" + Leads.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Leads.KEY_LeadOwner + " VARCHAR, " +
                Leads.KEY_Title + " VARCHAR, " +
                Leads.KEY_Phone + " VARCHAR, "+
                Leads.KEY_Mobile + " VARCHAR, "+
                Leads.KEY_LeadSource + " VARCHAR, "+
                Leads.KEY_Industry + " VARCHAR, "+
                Leads.KEY_AnnualRevenue + " INTEGER, "+
                Leads.KEY_ModifiedBy + " DATETIME, "+
                Leads.KEY_CompanyName+ " VARCHAR, "+
                Leads.KEY_LeadName + " VARCHAR, "+
                Leads.KEY_Email + " VARCHAR, "+
                Leads.KEY_Website + " VARCHAR, "+
                Leads.KEY_No_of_Employees+ " INTEGER, "+
                Leads.KEY_CreatedBy + " VARCHAR, "+
                Leads.KEY_SkypeID + " VARCHAR )";
    }
    public int insertInLeads(Leads lead1){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Leads.KEY_ID, lead1.getID());
        values.put(Leads.KEY_LeadOwner, lead1.getLeadOwner());
        values.put(Leads.KEY_Title, lead1.getTitle());
        values.put(Leads.KEY_Phone, lead1.getPhone());
        values.put(Leads.KEY_Mobile, lead1.getMobile());
        values.put(Leads.KEY_LeadSource, lead1.getLeadSource());
        values.put(Leads.KEY_Industry, lead1.getIndustry());
        values.put(Leads.KEY_AnnualRevenue, lead1.getAnnualRevenue());
        values.put(Leads.KEY_ModifiedBy, lead1.getModifiedBy().toString());
        values.put(Leads.KEY_CompanyName, lead1.getCompanyName());
        values.put(Leads.KEY_LeadName, lead1.getLeadName());
        values.put(Leads.KEY_Email, lead1.getEmail());
        values.put(Leads.KEY_Website, lead1.getWebsite());
        values.put(Leads.KEY_No_of_Employees, lead1.getNo_of_Employees());
        values.put(Leads.KEY_CreatedBy, lead1.getCreatedBy().toString());
        values.put(Leads.KEY_SkypeID, lead1.getSkypeID());

        int LeadId =(int)db.insert(Leads.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return LeadId;
    }

    public int inserShortinLeads(Leads lead){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Leads.KEY_LeadOwner, lead.getLeadOwner());
        values.put(Leads.KEY_Title, lead.getTitle());

        values.put(Leads.KEY_CompanyName, lead.getCompanyName());
        values.put(Leads.KEY_LeadName, lead.getLeadName());
        values.put(Leads.KEY_ModifiedBy, lead.getModifiedBy().toString());
        values.put(Leads.KEY_CreatedBy, lead.getCreatedBy().toString());

        int LeadId =(int)db.insert(Leads.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return LeadId;

    }

    public List<Leads> getLeadsList() {

        Leads GetLeads;
        List<Leads> LeadsLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Leads.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetLeads= new Leads();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                GetLeads.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Leads.KEY_ID))));
//                GetLeads.setNo_of_Employees(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Leads.KEY_No_of_Employees))));
                GetLeads.setLeadOwner(cursor.getString(cursor.getColumnIndex(Leads.KEY_LeadOwner)));
                GetLeads.setLeadName(cursor.getString(cursor.getColumnIndex(Leads.KEY_LeadName)));
//                GetLeads.setLeadSource(cursor.getString(cursor.getColumnIndex(Leads.KEY_LeadSource)));
                GetLeads.setTitle(cursor.getString(cursor.getColumnIndex(Leads.KEY_Title)));
//                GetLeads.setPhone(cursor.getString(cursor.getColumnIndex(Leads.KEY_Phone)));
//                GetLeads.setMobile(cursor.getString(cursor.getColumnIndex(Leads.KEY_Mobile)));
//                GetLeads.setIndustry(cursor.getString(cursor.getColumnIndex(Leads.KEY_Industry)));
//                GetLeads.setAnnualRevenue(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Leads.KEY_AnnualRevenue))));
                GetLeads.setCompanyName(cursor.getString(cursor.getColumnIndex(Leads.KEY_CompanyName)));
//                GetLeads.setEmail(cursor.getString(cursor.getColumnIndex(Leads.KEY_Email)));
//                GetLeads.setWebsite(cursor.getString(cursor.getColumnIndex(Leads.KEY_Website)));
//                GetLeads.setSkypeID(cursor.getString(cursor.getColumnIndex(Leads.KEY_SkypeID)));
                try {
                    GetLeads.setCreatedBy(sdf.parse(cursor.getString(cursor.getColumnIndex(Leads.KEY_CreatedBy))));
                    GetLeads.setModifiedBy(sdf.parse(cursor.getString(cursor.getColumnIndex(Leads.KEY_ModifiedBy))));

                } catch (ParseException e) {
                    e.printStackTrace();
                }


                LeadsLists.add(GetLeads);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return LeadsLists;
    }

    public int updateLead(Leads lead){

        int LeadId;

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();

        values.put(Leads.KEY_ID, lead.getID());

        values.put(Leads.KEY_LeadOwner, lead.getLeadOwner());
        values.put(Leads.KEY_Title, lead.getTitle());

        values.put(Leads.KEY_CompanyName, lead.getCompanyName());
        values.put(Leads.KEY_LeadName, lead.getLeadName());
        values.put(Leads.KEY_ModifiedBy, lead.getModifiedBy().toString());

        // update-ing Row
        LeadId = db.update(Leads.TABLE_NAME, values, Leads.KEY_ID + " = " + lead.getID(), null);
        DatabaseManager.getInstance().closeDatabase();
        return LeadId;

    }

    public long deletefromLeads(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Leads.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
