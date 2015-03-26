package com.thinkbiggs.contactos.model;

/**
 * Created by NB on 3/24/2015.
 * Data structure for a User's connections.
 *
 */
public class Contact {
    private int _id;
    //private int mUserId;
    //private String mEmail;
    private String mFirstName;
    //private String mLastName;
    //private Location mLocation;
    //private File mPicture;
    private String mNotes;
    private String mLastDate;
    private String mNextDate;
    private String mLastReport;
    private String mNextReport;


    public Contact() {

    }

    public Contact(int id, String firstName, String notes, String lastDate, String nextDate, String lastReport, String nextReport) {
        this._id = id;
        this.mFirstName = firstName;
        this.mNotes = notes;
        this.mLastDate = lastDate;
        this.mNextDate = nextDate;
        this.mLastReport = lastReport;
        this.mNextReport = nextReport;
    }
    public Contact(String firstName, String notes, String lastDate, String nextDate, String lastReport, String nextReport) {
        this.mFirstName = firstName;
        this.mNotes = notes;
        this.mLastDate = lastDate;
        this.mNextDate = nextDate;
        this.mLastReport = lastReport;
        this.mNextReport = nextReport;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getNotes() {
        return mNotes;
    }

    public void setNotes(String notes) {
        mNotes = notes;
    }

    public String getLastDate() {
        return mLastDate;
    }

    public void setLastDate(String lastDate) {
        mLastDate = lastDate;
    }

    public String getNextDate() {
        return mNextDate;
    }

    public void setNextDate(String nextDate) {
        mNextDate = nextDate;
    }

    public String getLastReport() {
        return mLastReport;
    }

    public void setLastReport(String lastReport) {
        mLastReport = lastReport;
    }

    public String getNextReport() {
        return mNextReport;
    }

    public void setNextReport(String nextReport) {
        mNextReport = nextReport;
    }
    @Override
    public String toString() {
        return getFirstName();
    }
}