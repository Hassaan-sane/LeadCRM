package com.example.hassaan.leadcrm.Repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.hassaan.leadcrm.Data.DatabaseManager;
import com.example.hassaan.leadcrm.TableClasses.Contact;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ContactRepo {

    private Contact contact;

    public ContactRepo() {
        this.contact = new Contact();
    }

    public static String createTable() {
        return "CREATE TABLE " + Contact.TABLE_NAME +
    "( "+ Contact.KEY_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Contact.KEY_UserID+ " INTEGER, " +
                Contact.KEY_LeadSource+ " VARCHAR, " +
                Contact.KEY_FirstName+" VARCHAR, " +
                Contact.KEY_LastName+" VARCHAR, " +
                Contact.KEY_Email+" VARCHAR, " +
                Contact.KEY_PhoneNo+ " INTEGER, " +
                Contact.KEY_Department+" VARCHAR, " +
                Contact.KEY_MobileNo+" VARCHAR, " +
                Contact.KEY_Fax+" VARCHAR, " +
                Contact.KEY_AssistantName+" VARCHAR, " +
                Contact.KEY_DOB+ " DATETIME, " +
                Contact.KEY_ReportsTo+ " VARCHAR, " +
                Contact.KEY_AsstntPhoneNo+ " INTEGER, " +
                Contact.KEY_SkypeID+" VARCHAR, " +
                Contact.KEY_MStreet+" VARCHAR, " +
                Contact.KEY_MCity+ " VARCHAR, " +
                Contact.KEY_MState+" VARCHAR, " +
                Contact.KEY_MZip+" INTEGER, " +
                Contact.KEY_MCountry+" VARCHAR, " +
                Contact.KEY_OthCity+" VARCHAR, " +
                Contact.KEY_OthState+" VARCHAR, " +
                Contact.KEY_OthZip+" INTEGER, " +
                Contact.KEY_OthCountry+" VARCHAR, " +
                Contact.KEY_OthStreet+" VARCHAR, " +
                Contact.KEY_Details+" VARCHAR  )";
    }

    public int insertInContacts(Contact contact){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();

        values.put(Contact.KEY_UserID,contact.getUserID());
        values.put(Contact.KEY_LeadSource,contact.getLeadSource());
        values.put(Contact.KEY_FirstName,contact.getFirstName());
        values.put(Contact.KEY_LastName,contact.getLastName());
        values.put(Contact.KEY_Email,contact.getEmail());
        values.put(Contact.KEY_PhoneNo,contact.getPhoneNo());
        values.put(Contact.KEY_Department,contact.getDepartment());
        values.put(Contact.KEY_MobileNo,contact.getMobileNo());
        values.put(Contact.KEY_Fax,contact.getFax());
        values.put(Contact.KEY_AssistantName,contact.getAssistantName());
        values.put(Contact.KEY_DOB,contact.getDOB());
        values.put(Contact.KEY_ReportsTo,contact.getReportsTo());
        values.put(Contact.KEY_AsstntPhoneNo,contact.getAsstntPhoneNo());
        values.put(Contact.KEY_SkypeID,contact.getSkypeID());
        values.put(Contact.KEY_MStreet,contact.getMStreet());
        values.put(Contact.KEY_MCity,contact.getMCity());
        values.put(Contact.KEY_MState,contact.getMState());
        values.put(Contact.KEY_MZip,contact.getMZip());
        values.put(Contact.KEY_MCountry,contact.getMCountry());
        values.put(Contact.KEY_OthCity,contact.getOthCity());
        values.put(Contact.KEY_OthState,contact.getOthState());
        values.put(Contact.KEY_OthZip,contact.getOthZip());
        values.put(Contact.KEY_OthCountry,contact.getOthCountry());
        values.put(Contact.KEY_OthStreet,contact.getOthStreet());
        values.put(Contact.KEY_Details,contact.getDetails());

        int ContactId =(int)db.insert(contact.TABLE_NAME, null, values);
        DatabaseManager.getInstance().closeDatabase();
        return ContactId;

    }

    public List<Contact> getContactList() {

        Contact GetContact;
        List<Contact> ContactLists = new ArrayList<>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT * FROM " + Contact.TABLE_NAME;

        Log.d("TAG", selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                GetContact = new Contact();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                GetContact.setID(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Contact.KEY_ID))));
                GetContact.setUserID(cursor.getInt(cursor.getColumnIndex(Contact.KEY_UserID)));
                GetContact.setLeadSource(cursor.getString(cursor.getColumnIndex(Contact.KEY_LeadSource)));
                GetContact.setFirstName(cursor.getString(cursor.getColumnIndex(Contact.KEY_FirstName)));
                GetContact.setLastName(cursor.getString(cursor.getColumnIndex(Contact.KEY_LastName)));
                GetContact.setEmail(cursor.getString(cursor.getColumnIndex(Contact.KEY_Email)));
                GetContact.setPhoneNo(cursor.getString(cursor.getColumnIndex(Contact.KEY_PhoneNo)));
                GetContact.setDepartment(cursor.getString(cursor.getColumnIndex(Contact.KEY_Department)));
                GetContact.setMobileNo(cursor.getString(cursor.getColumnIndex(Contact.KEY_MobileNo)));
                GetContact.setFax(cursor.getString(cursor.getColumnIndex(Contact.KEY_Fax)));
                GetContact.setAssistantName(cursor.getString(cursor.getColumnIndex(Contact.KEY_AssistantName)));

                try {
                    GetContact.setDOB(sdf.parse(cursor.getString(cursor.getColumnIndex(Contact.KEY_DOB))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                GetContact.setReportsTo(cursor.getString(cursor.getColumnIndex(Contact.KEY_ReportsTo)));
                GetContact.setAsstntPhoneNo(cursor.getString(cursor.getColumnIndex(Contact.KEY_AsstntPhoneNo)));
                GetContact.setSkypeID(cursor.getString(cursor.getColumnIndex(Contact.KEY_SkypeID)));
                GetContact.setMStreet(cursor.getString(cursor.getColumnIndex(Contact.KEY_MStreet)));
                GetContact.setMCity(cursor.getString(cursor.getColumnIndex(Contact.KEY_MCity)));
                GetContact.setMState(cursor.getString(cursor.getColumnIndex(Contact.KEY_MState)));
                GetContact.setMZip(cursor.getInt(cursor.getColumnIndex(Contact.KEY_MZip)));
                GetContact.setMCountry(cursor.getString(cursor.getColumnIndex(Contact.KEY_MCountry)));
                GetContact.setOthCity(cursor.getString(cursor.getColumnIndex(Contact.KEY_OthCity)));
                GetContact.setOthState(cursor.getString(cursor.getColumnIndex(Contact.KEY_OthState)));
                GetContact.setOthZip(cursor.getInt(cursor.getColumnIndex(Contact.KEY_OthZip)));
                GetContact.setOthCountry(cursor.getString(cursor.getColumnIndex(Contact.KEY_OthCountry)));
                GetContact.setOthStreet(cursor.getString(cursor.getColumnIndex(Contact.KEY_OthStreet)));
                GetContact.setDetails(cursor.getString(cursor.getColumnIndex(Contact.KEY_Details)));


                ContactLists.add(GetContact);
            } while (cursor.moveToNext());
        }

        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return ContactLists;
    }



    public long deletefromContacts(Integer id) {

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String[] whereArgs= {id.toString()};
        long deleteId = db.delete(Contact.TABLE_NAME,"ID=?",whereArgs );
        DatabaseManager.getInstance().closeDatabase();

        return deleteId;
    }
}
