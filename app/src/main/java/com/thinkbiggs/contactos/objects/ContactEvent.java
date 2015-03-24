package com.thinkbiggs.contactos.objects;

import android.provider.ContactsContract;

import java.util.Date;


/**
 * Created by NB on 3/24/2015.
 * Data structure for the ContactEvent (event) Object
 */
public class ContactEvent {
    private ContactsContract.CommonDataKinds.Email userEmail;
    private ContactsContract.CommonDataKinds.Email connectionEmail;
    private Long key;
    private Date date;
    private String type;
    private String venue;
    private String report;

    public ContactsContract.CommonDataKinds.Email getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(ContactsContract.CommonDataKinds.Email userEmail) {
        this.userEmail = userEmail;
    }

    public ContactsContract.CommonDataKinds.Email getConnectionEmail() {
        return connectionEmail;
    }

    public void setConnectionEmail(ContactsContract.CommonDataKinds.Email connectionEmail) {
        this.connectionEmail = connectionEmail;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

}
