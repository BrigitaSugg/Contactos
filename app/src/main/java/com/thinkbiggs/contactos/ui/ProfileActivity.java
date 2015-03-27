package com.thinkbiggs.contactos.ui;

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
    private EditText prfNotesField; //Notes
    private EditText prfLDateField; //LastDate
    private EditText prfNDateField; //NextDate
    private EditText prfLNotesField; //LastNotes
    private EditText prfNNotesField; //NextNotes

    private Button mSaveButton;
    private Button mBackButton;

    final DatabaseHandler db = new DatabaseHandler(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        prfNameField = (EditText) findViewById(R.id.vFirstName);
        prfNotesField = (EditText) findViewById(R.id.vNotes);
        prfLDateField = (EditText) findViewById(R.id.vLastDate);
        prfNDateField = (EditText) findViewById(R.id.vNextDate);
        prfLNotesField = (EditText) findViewById(R.id.vLastReport);
        prfNNotesField = (EditText) findViewById(R.id.vNextReport);


        //Code for getting details from intent passed byt ConnectionListActivity
        Intent intent = getIntent();
        String passed_id = intent.getStringExtra("contact_id");
        Toast.makeText(getBaseContext(), passed_id, Toast.LENGTH_LONG).show();
        //Upon receipt, pull up the object out of the database, based on ID, and populate the object here.

        //Code for UPDATING contact that was already pulled over


        //Save Button for adding a new contact, IF contact was not pulled over
        mSaveButton = (Button) findViewById(R.id.vSaveButton);
        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact contact = new Contact(
                        prfNameField.getText().toString(), //Name
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
    /* WARNING ON BACK BUTTON
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

    }*/

}
