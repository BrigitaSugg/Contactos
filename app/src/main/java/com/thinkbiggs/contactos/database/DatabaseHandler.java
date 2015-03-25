package com.thinkbiggs.contactos.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.thinkbiggs.contactos.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NB on 3/25/2015.
 */
public class DatabaseHandler extends SQLiteOpenHelper {
    //All Static Variables
    //Database Version
    private static final int DATABASE_VERSION = 1;

    //database name
    private static final String DATABASE_NAME = "contactsManager";

    // table names
    private static final String TABLE_CONTACTS = "contacts";
    //private static final String TABLE_USERS = "users";
    //private static final String TABLE_EVENTS = "events";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_FNAME = "firstName";
    private static final String KEY_LNAME = "lastName";
    private static final String KEY_LOCX = "locX";
    private static final String KEY_LOCY = "locY";
    private static final String KEY_PIC = "pic";
    private static final String KEY_NOTES = "notes";
    private static final String KEY_LDATE = "lastDate";
    private static final String KEY_NDATE = "nextDate";
    private static final String KEY_LREPORT = "lastReport";
    private static final String KEY_NREPORT = "nextReport";

    public DatabaseHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    //Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
                + KEY_ID + " INTEGER PRIMARY KEY,"
                + KEY_FNAME + " TEXT,"
                + KEY_LNAME + " TEXT,"
                + KEY_LOCX + " TEXT,"
                + KEY_LOCY + " TEXT,"
                + KEY_PIC + " TEXT,"
                + KEY_NOTES + " TEXT,"
                + KEY_LDATE + " TEXT,"
                + KEY_NDATE + " TEXT,"
                + KEY_LREPORT + " TEXT,"
                + KEY_NREPORT + " TEXT,"
                + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }
    //Upgrading Database
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
        //Create tables again
        onCreate(db);
    }

    // Adding a new contact
    public void addContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FNAME, contact.getFirstName());
        values.put(KEY_NOTES, contact.getNotes());
        values.put(KEY_LDATE, contact.getLastDate());
        values.put(KEY_NDATE, contact.getNextDate());
        values.put(KEY_LREPORT, contact.getLastReport());
        values.put(KEY_NREPORT, contact.getNextReport());

        // Insert Row
        db.insert(TABLE_CONTACTS, null, values);
        db.close(); //Closing the DB
    }

    // Getting a single contact
    public Contact getContact(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_ID, KEY_FNAME, KEY_NOTES, KEY_LDATE, KEY_NDATE, KEY_LREPORT, KEY_NREPORT }, KEY_ID + "=?", new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
        // return contact
        return contact;
    }
    //Getting All Contacts
    public List<Contact> getAllContacts() {
        List<Contact> contactList = new ArrayList<Contact>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_CONTACTS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Contact contact = new Contact();
                contact.set_id(Integer.parseInt(cursor.getString(0)));
                contact.setFirstName(cursor.getString(1));
                contact.setNotes(cursor.getString(2));
                contact.setLastDate(cursor.getString(3));
                contact.setNextDate(cursor.getString(4));
                contact.setLastReport(cursor.getString(5));
                contact.setNextReport(cursor.getString(6));
            } while (cursor.moveToNext());
        }
        return contactList;
    }

    // Getting contacts count
    public int getContactsCount() {
        String countQuery = "SELECT * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
        return cursor.getCount();
    }

    //Updating single contact
    public int updateContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FNAME, contact.getFirstName());
        values.put(KEY_NOTES, contact.getNotes());
        values.put(KEY_LDATE, contact.getLastDate());
        values.put(KEY_NDATE, contact.getNextDate());
        values.put(KEY_LREPORT, contact.getLastReport());
        values.put(KEY_NREPORT, contact.getNextReport());

        //Update row
        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.get_id()) });
    }

    //Deleting single contact
    public void deleteContact(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[] { String.valueOf(contact.get_id()) });
        db.close();
    }



}


































