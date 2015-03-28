package com.thinkbiggs.contactos.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.thinkbiggs.contactos.R;
import com.thinkbiggs.contactos.database.DatabaseHandler;
import com.thinkbiggs.contactos.model.Contact;




public class ProfileActivity extends ActionBarActivity {

    private EditText prfNameField; //Name
    private EditText prfLocation; //Location
    private EditText prfNotesField; //Notes
    private EditText prfLDateField; //LastDate
    private EditText prfNDateField; //NextDate
    private EditText prfLNotesField; //LastNotes
    private EditText prfNNotesField; //NextNotes

    private Button mSaveButton;
    private Button mBackButton;
    private Button mDeleteButton;

    final DatabaseHandler db = new DatabaseHandler(this);

    //Code for getting details from intent passed byt ConnectionListActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        final int passed_id = intent.getIntExtra(getString(R.string.contact_id),-1);
        int update = intent.getIntExtra("update", 0);

        prfNameField = (EditText) findViewById(R.id.vFirstName);
        prfLocation = (EditText) findViewById(R.id.vLocation);
        prfNotesField = (EditText) findViewById(R.id.vNotes);
        prfLDateField = (EditText) findViewById(R.id.vLastDate);
        prfNDateField = (EditText) findViewById(R.id.vNextDate);
        prfLNotesField = (EditText) findViewById(R.id.vLastReport);
        prfNNotesField = (EditText) findViewById(R.id.vNextReport);

        //Upon receipt, pull up the object out of the database, based on ID, and populate the object here.
        if (update == 1) {
            Contact bert = db.getContact(passed_id);
            prfNameField.setText(bert.getFirstName());
            prfLocation.setText(bert.getLocX());
            prfNotesField.setText(bert.getNotes());
            prfLDateField.setText(bert.getLastDate());
            prfNDateField.setText(bert.getNextDate());
            prfLNotesField.setText(bert.getLastReport());
            prfNNotesField.setText(bert.getNextReport());

            //Code for UPDATING contact that was already pulled over
            mSaveButton = (Button) findViewById(R.id.vSaveButton);
            mSaveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Contact contact = new Contact(
                            passed_id,
                            prfNameField.getText().toString(), //Name
                            prfLocation.getText().toString(), //Location
                            prfNotesField.getText().toString(), //Notes
                            prfLDateField.getText().toString(), //LastDate
                            prfNDateField.getText().toString(), //NextDate
                            prfLNotesField.getText().toString(), //LastNotes
                            prfNNotesField.getText().toString() //NextNotes
                    );
                    db.updateContact(contact);
                    Toast.makeText(getBaseContext(), contact.getFirstName() + " saved!", Toast.LENGTH_LONG).show();
                    backButton();
                }
            });
            //Delete button implementation
            mDeleteButton = (Button) findViewById(R.id.vDeleteButton);
            mDeleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Contact toBeDeleted = db.getContact(passed_id);
                    AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);

                    builder.setTitle("Warning")
                            .setMessage("Are you sure you want to delete " + toBeDeleted.getFirstName() + "?")
                            .setCancelable(false)
                            .setIcon(R.drawable.ic_launcher)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    db.deleteContact(toBeDeleted);
                                    Toast.makeText(getBaseContext(), toBeDeleted.getFirstName() + " deleted!", Toast.LENGTH_LONG).show();
                                    backButton();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });

                    AlertDialog alert = builder.create();
                    alert.show();


                }
            });
        }
        else {
            //Save Button for adding a new contact, IF contact was not pulled over
            mSaveButton = (Button) findViewById(R.id.vSaveButton);
            mSaveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Contact contact = new Contact(
                            prfNameField.getText().toString(), //Name
                            prfLocation.getText().toString(), //Location
                            prfNotesField.getText().toString(), //Notes
                            prfLDateField.getText().toString(), //LastDate
                            prfNDateField.getText().toString(), //NextDate
                            prfLNotesField.getText().toString(), //LastNotes
                            prfNNotesField.getText().toString() //NextNotes
                    );
                    db.addContact(contact);
                    Toast.makeText(getBaseContext(), contact.getFirstName() + " saved!", Toast.LENGTH_LONG).show();
                    backButton();
                }
            });
            //Delete button implementation
            mDeleteButton = (Button) findViewById(R.id.vDeleteButton);
            mDeleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);

                    builder.setTitle("Warning")
                            .setMessage("Are you sure you want to delete ?")
                            .setCancelable(false)
                            .setIcon(R.drawable.ic_launcher)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    backButton();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });

                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });
        }

        //Back Button. Just goes back, no saving
        mBackButton = (Button) findViewById(R.id.vBackButton);
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            backButton();
            }
        });
    }

    private void backButton() {
        Intent intent = new Intent(this, ConnectionListActivity.class);
        startActivity(intent);

    }

}
