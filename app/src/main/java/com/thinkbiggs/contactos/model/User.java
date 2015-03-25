package com.thinkbiggs.contactos.model;

import android.graphics.Picture;
import android.location.Location;
import android.provider.ContactsContract;

/**
 * Created by NB on 3/24/2015.
 * User class representing the person using * the app. Not likely to be used until we move to a database.

public class User {
    private int _id;
    private String mUserEmail;
    private String mPassword;
    private String mUserName;
    private String mUserLastName;
    private Location mUserLoc;
    private Picture mUserPic;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getUserEmail() {
        return mUserEmail;
    }

    public void setUserEmail(String userEmail) {
        mUserEmail = userEmail;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        this.mUserName = userName;
    }

    public Picture getUserPic() {
        return mUserPic;
    }

    public void setUserPic(Picture userPic) {
        this.mUserPic = userPic;
    }

    public String getUserLastName() {
        return mUserLastName;
    }

    public void setUserLastName(String userLastName) {
        this.mUserLastName = userLastName;
    }

    public Location getUserLoc() {
        return mUserLoc;
    }

    public void setUserLoc(Location userLoc) {
        this.mUserLoc = userLoc;
    }
}
*/