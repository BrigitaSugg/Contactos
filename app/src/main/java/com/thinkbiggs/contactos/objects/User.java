package com.thinkbiggs.contactos.objects;

import android.graphics.Picture;
import android.location.Location;
import android.provider.ContactsContract;

import java.util.Date;

/**
 * Created by NB on 3/24/2015.
 * User class representing the person using * the app. Not likely to be used until we move to a database.
 */
public class User {
    private ContactsContract.CommonDataKinds.Email userEmail;
    private String password;
    private String userName;
    private String userLastName;
    private Location userLoc;
    private Picture userPic;

    public ContactsContract.CommonDataKinds.Email getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(ContactsContract.CommonDataKinds.Email userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Picture getUserPic() {
        return userPic;
    }

    public void setUserPic(Picture userPic) {
        this.userPic = userPic;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Location getUserLoc() {
        return userLoc;
    }

    public void setUserLoc(Location userLoc) {
        this.userLoc = userLoc;
    }
}
