package com.thinkbiggs.contactos;

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

}
