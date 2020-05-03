package com.example.adnan_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UIHierarchiesActivity extends AppCompatActivity {

    //Main method of the app, that will run at first when the app start running
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main.xml file call here
        setContentView(R.layout.ui_hierarchies_layout);

        //definition of an array called "COUNTRIES" with the list of countries
        //that start with the letter 'A' represented as strings
        final String[] COUNTRIES = new String[]{

                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };

        //calling the ListView component from activity_main.xml file with its id
        //that we gave and save it into "myListView" variable
        ListView myListView = (ListView) findViewById(R.id.country_list_view);

        //The ArrayAdapter converts the ArrayList of objects into a View so it can be rendered in the ListView
        //we are creating an ArrayAdapter with the name "array_adapter", with the type of the
        //item that will be converted into a View being a string
        final ArrayAdapter<String> array_adapter;
        //instantiate the ArrayAdapter and attach it to our ListView,
        //referring to  array named "COUNTRIES" to be used as the ArrayList
        //The "simple_item_1" will print out each string in the array as a TextView
        array_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, COUNTRIES);

        //connection of ListView (which we named "myListView") to the ArrayAdapter
        myListView.setAdapter(array_adapter);

    }
}
