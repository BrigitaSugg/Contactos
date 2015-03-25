package com.thinkbiggs.contactos.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import com.thinkbiggs.contactos.R;

import java.util.Set;


public class ConnectionListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_list);

        String[] ContactsList = {"Nicolai", "Nate", "Joshua"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                ContactsList);
        setListAdapter(adapter);
    }
    public void goToNewActivity(View v){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }


}