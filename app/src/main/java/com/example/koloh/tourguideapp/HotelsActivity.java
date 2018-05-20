package com.example.koloh.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_companies );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Hotel Schloss Westerholt", "Schloßstraße 1, 45701 Herten", R.drawable.schloss_hotel ) );
        tours.add ( new Tour ( "ibis Styles Hotel Herten", "Resser Weg 36, 45699 Herten", R.drawable.ibis_hotel ) );
        tours.add ( new Tour ( "Hotel Alt Westerholt", "Schloßstraße 16, 45701 Herten", R.drawable.westerholt_hotel ) );
        tours.add ( new Tour ( "Gasthof Altes Dorf Inh. Christian Lippemeier", "Schloßstraße 15, 45701 Herten", R.drawable.gastholf_hotel ) );
        tours.add ( new Tour ( "Hotel Fousek", "Geschwisterstraße 47, 45701 Herten", R.drawable.fousek_hotel ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );
    }
}