package com.thinkbiggs.contactos;

import android.provider.ContactsContract;

import java.util.Date;


/**
 * Created by NB on 3/24/2015.
 * Data structure for the Contact (event) Object
 */
public class Contact {
    private ContactsContract.CommonDataKinds.Email userEmail;
    private ContactsContract.CommonDataKinds.Email connectionEmail;
    private Long contactKey;
    private Date contactDate;
    private String contactType;
    private String contactVenue;
    private String contactReport;


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

    public Long getContactKey() {
        return contactKey;
    }

    public void setContactKey(Long contactKey) {
        this.contactKey = contactKey;
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactVenue() {
        return contactVenue;
    }

    public void setContactVenue(String contactVenue) {
        this.contactVenue = contactVenue;
    }

    public String getContactReport() {
        return contactReport;
    }

    public void setContactReport(String contactReport) {
        this.contactReport = contactReport;
    }


}
