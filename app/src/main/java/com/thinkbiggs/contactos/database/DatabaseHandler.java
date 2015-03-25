package com.thinkbiggs.contactos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

}


































