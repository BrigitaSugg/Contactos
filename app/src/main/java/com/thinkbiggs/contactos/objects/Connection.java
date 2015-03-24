package com.thinkbiggs.contactos.objects;

import android.location.Location;
import android.provider.ContactsContract;

import java.io.File;

/**
 * Created by NB on 3/24/2015.
 * Data structure for a User's connections.
 */
public class Connection {
    private ContactsContract.CommonDataKinds.Email userEmail;
    private ContactsContract.CommonDataKinds.Email email;
    private String firstName;
    private String lastName;
    private Location location;
    private File picture;
    private String notes;

    public ContactsContract.CommonDataKinds.Email getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(ContactsContract.CommonDataKinds.Email userEmail) {
        this.userEmail = userEmail;
    }

    public ContactsContract.CommonDataKinds.Email getEmail() {
        return email;
    }

    public void setEmail(ContactsContract.CommonDataKinds.Email email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
