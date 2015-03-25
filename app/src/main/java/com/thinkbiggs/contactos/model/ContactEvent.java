package com.thinkbiggs.contactos.model;

import android.provider.ContactsContract;

import java.util.Date;


/**
 * Created by NB on 3/24/2015.
 * Data structure for the ContactEvent (event) Object
 */
public class ContactEvent {
    private ContactsContract.CommonDataKinds.Email mUserEmail;
    private ContactsContract.CommonDataKinds.Email mConnectionEmail;
    private Long mKey;
    private Date mDate;
    private String mType;
    private String mVenue;
    private String mReport;

    public ContactsContract.CommonDataKinds.Email getUserEmail() {
        return mUserEmail;
    }

    public void setUserEmail(ContactsContract.CommonDataKinds.Email userEmail) {
        this.mUserEmail = userEmail;
    }

    public ContactsContract.CommonDataKinds.Email getConnectionEmail() {
        return mConnectionEmail;
    }

    public void setConnectionEmail(ContactsContract.CommonDataKinds.Email connectionEmail) {
        this.mConnectionEmail = connectionEmail;
    }

    public Long getKey() {
        return mKey;
    }

    public void setKey(Long key) {
        this.mKey = key;
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
