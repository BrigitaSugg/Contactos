package com.thinkbiggs.contactos.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.thinkbiggs.contactos.database.DatabaseHandler;
import com.thinkbiggs.contactos.model.Contact;

import java.util.List;


public class ConnectionListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DatabaseHandler db = new DatabaseHandler(this);
        Contact bert = new Contact("Bert Balloon", "Bert\'s cool", "01/01/1900", "01/02/2010", "Bert was a balloon", "Is bert still a balloon?");
        db.addContact(bert);

        //List shows first names, but needs to show more than just first name.
        //On-click in line, should move to profile page for that contact

        ListView ConnectionListMainView = getListView();
        List<Contact> contacts = db.getAllContacts();

        ArrayAdapter<Contact> adapter = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1, contacts);

        ConnectionListMainView.setAdapter(adapter);

        ConnectionListMainView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView < ? > parent, View view, int position, long id){

                String item = ((TextView) view).getText().toString();
                Toast.makeText(getBaseContext(), item, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                //At present just passing the text string.
                // Need to pull out the first number in the string (before the '.') and pass that number
                intent.putExtra("contact_id", item);
                startActivity(intent);
            }
        });
    }


    public void goToNewActivity(View v){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


}