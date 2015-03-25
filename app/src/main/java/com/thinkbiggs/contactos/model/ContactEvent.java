package com.thinkbiggs.contactos.model;

import java.util.Date;


/**
 * Created by NB on 3/24/2015.
 * Data structure for the ContactEvent (event) Object

public class ContactEvent {
    private int _id;
    private int mUserId;
    private int mContactId;
    private Date mDate;
    private String mType;
    private String mVenue;
    private String mReport;

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        this.mUserId = userId;
    }

    public int getContactId() {
        return mContactId;
    }

    public void setContactId(int contactId) {
        this.mContactId = contactId;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public String getVenue() {
        return mVenue;
    }

    public void setVenue(String venue) {
        this.mVenue = venue;
    }

    public String getReport() {
        return mReport;
    }

    public void setReport(String report) {
        this.mReport = report;
    }

}
*/