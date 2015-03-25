package com.thinkbiggs.contactos.model;

import android.location.Location;
import android.provider.ContactsContract;

import java.io.File;

/**
 * Created by NB on 3/24/2015.
 * Data structure for a User's connections.
 */
public class Connection {
    private ContactsContract.CommonDataKinds.Email mUserEmail;
    private ContactsContract.CommonDataKinds.Email mEmail;
    private String mFirstName;
    private String mLastName;
    private Location mLocation;
    private File mPicture;
    private String mNotes;

    public ContactsContract.CommonDataKinds.Email getUserEmail() {
        return mUserEmail;
    }

    public void setUserEmail(ContactsContract.CommonDataKinds.Email mUserEmail) {
        this.mUserEmail = mUserEmail;
    }

    public ContactsContract.CommonDataKinds.Email getEmail() {
        return mEmail;
    }

    public void setEmail(ContactsContract.CommonDataKinds.Email email) {
        this.mEmail = email;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        this.mLocation = location;
    }

    public File getPicture() {
        return mPicture;
    }

    public void setPicture(File picture) {
        this.mPicture = picture;
    }

    public String getNotes() {
        return mNotes;
    }

    public void setNotes(String notes) {
        this.mNotes = notes;
    }
}
