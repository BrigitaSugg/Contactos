package com.thinkbiggs.contactos.model;

/**
 * Created by NB on 3/24/2015.
 * Data structure for a User's connections.
 *
 */
public class Contact {
    private int _id;
    private String mFirstName;
    private String mLastName;
    private String mLocX;
    private String mLocY;
    private String mPic;
    private String mNotes;
    private String mLastDate;
    private String mNextDate;
    private String mLastReport;
    private String mNextReport;


    public Contact() {

    }

    public Contact(int id, String firstName, String location, String notes, String lastDate, String nextDate, String lastReport, String nextReport) {
        this._id = id;
        this.mFirstName = firstName;
        this.mLocX = location;
        this.mNotes = notes;
        this.mLastDate = lastDate;
        this.mNextDate = nextDate;
        this.mLastReport = lastReport;
        this.mNextReport = nextReport;
    }


    public Contact(String firstName, String location, String notes, String lastDate, String nextDate, String lastReport, String nextReport) {
        this.mFirstName = firstName;
        this.mLocX = location;
        this.mNotes = notes;
        this.mLastDate = lastDate;
        this.mNextDate = nextDate;
        this.mLastReport = lastReport;
        this.mNextReport = nextReport;
    }


    public Contact(int id, String firstName, String lastName, String locX, String locY, String pic, String notes, String lastDate, String nextDate, String lastReport, String nextReport) {
        this._id = id;
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mLocX = locX;
        this.mLocY = locY;
        this.mPic = pic;
        this.mNotes = notes;
        this.mLastDate = lastDate;
        this.mNextDate = nextDate;
        this.mLastReport = lastReport;
        this.mNextReport = nextReport;
    }
    @Override
    public String toString() {
        return _id + ". " + mFirstName + " " + mNextDate;
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

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getLocX() {
        return mLocX;
    }

    public void setLocX(String locX) {
        mLocX = locX;
    }

    public String getLocY() {
        return mLocY;
    }

    public void setLocY(String locY) {
        mLocY = locY;
    }

    public String getPic() {
        return mPic;
    }

    public void setPic(String pic) {
        mPic = pic;
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

}