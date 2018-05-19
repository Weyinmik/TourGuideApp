package com.example.koloh.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CompanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_company );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_companies );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        ArrayList<String> words = new ArrayList<String> ();
        words.add ( "PROSOZ Herten GmbH" );
        words.add ( "Johrendt-Bautenschutz GmbH" );
        words.add ( "Spedition Wilhelm Mazurek GmbH" );
        words.add ( "Autohaus Blendorf GmbH Mazda" );
        words.add ( "Imperial Industrial Logistics GmbH" );
        words.add ( "Klaeser Internationale Fachspedition und Fahrzeugbau GmbH" );
        words.add ( "Dataserv GmbH" );
        words.add ( "Johrendt-Bautenschutz GmbH" );
        words.add ( "Herta GmbH" );
        words.add ( "Coca-Cola European Partners Germany GmbH" );
        words.add ( "ISRA Surface Vision GmbH" );

        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String> ( this, android.R.layout.simple_list_item_1, words );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( itemsAdapter );
    }
}
