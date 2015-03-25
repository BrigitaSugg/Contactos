package com.thinkbiggs.contactos.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.thinkbiggs.contactos.R;
import com.thinkbiggs.contactos.database.DatabaseHandler;
import com.thinkbiggs.contactos.model.Contact;

import java.security.SignatureException;
import java.util.List;

public class ProfileActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        DatabaseHandler db = new DatabaseHandler(this);

        //Create some test Contact objects

       // Contact nate = db.getContact(1);
        //nate.setNotes("Changed Notes");
        //List contacts = db.getAllContacts();
        //db.updateContact(nate);
       //List newContacts = db.getAllContacts();
        //db.deleteContact(nate);

    }
    /*public void onBack(View v) {
        Intent intent = new Intent(this, ConnectionListActivity.class);
        startActivity(intent);
    }*/

    public void showDialog(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);

        builder.setTitle("Warning Message")
               .setMessage("Are you sure to go back?")
               .setCancelable(false)
               .setIcon(R.drawable.ic_launcher)
               .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       Toast toast = Toast.makeText(getApplicationContext(), "Complete contact info please", Toast.LENGTH_SHORT);
                       toast.setGravity(Gravity.CENTER, 0, 0);
                       toast.show();
                   }
               });

        AlertDialog alert = builder.create();
        alert.show();

    }


    public void onShow(View view){
       //on save, push all data to database. need to call the variable and pass it to a database
       // String name = "whatever was entered into the name field";
        Toast toast = Toast.makeText(getApplicationContext(), "Contact was saved!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0); //it sets the position of the pop-up message
        toast.show();
    }
}
