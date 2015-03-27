package com.thinkbiggs.contactos.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.thinkbiggs.contactos.R;
import com.thinkbiggs.contactos.database.DatabaseHandler;
import com.thinkbiggs.contactos.model.Contact;

import java.util.List;


public class ConnectionListActivity extends ListActivity {

    private Button mAddContactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_list);
        mAddContactButton = (Button) findViewById(R.id.vAddContactButton);

        DatabaseHandler db = new DatabaseHandler(this);
        /*
        Code for adding a contact on every open
        Contact bert = new Contact("Bert Balloon", "Bert\'s cool", "01/01/1900", "01/02/2010", "Bert was a balloon", "Is bert still a balloon?");
        db.addContact(bert);
        */


        /*
        ** ListView Implementation
        ** List shows first names, but needs to show more than just first name.
        ** On-click in line, should move to profile page for that contact
        */

        ListView ConnectionListMainView = getListView(); //Find the list we'll be working on
        List<Contact> contacts = db.getAllContacts(); //Build a list of all contacts in database

        //Create an adapter that takes the list view and conforms it to the type of list it'll be added to
        ArrayAdapter<Contact> adapter = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1, contacts);

        ConnectionListMainView.setAdapter(adapter); //Display the list

        //Listener for when user clicks on a contact
        ConnectionListMainView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView < ? > parent, View view, int position, long id){
                String item = ((TextView) view).getText().toString();
                //Toast.makeText(getBaseContext(), item, Toast.LENGTH_SHORT).show();
               UpdateContact(item);
            }
        });

        //New Contact Button. Goes to profile page while passing no info.
        mAddContactButton = (Button) findViewById(R.id.vAddContactButton);
        mAddContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddContactButton();
            }
        });

    }

    private void UpdateContact(String item) {
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        //At present just passing the text string.
        // Need to pull out the first number in the string (before the '.') and pass that number
        intent.putExtra("contact_id", item);
        intent.putExtra("Update?","Y");
        startActivity(intent);
}

    private void AddContactButton() {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("Update?","N");
        startActivity(intent);

    }

}