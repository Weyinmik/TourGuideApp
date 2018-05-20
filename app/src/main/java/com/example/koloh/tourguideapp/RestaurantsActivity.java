package com.example.koloh.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_companies );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Restaurant Opatija", "Josefstraße 27, 45699 Herten", R.drawable.opatiji_restaurant ) );
        tours.add ( new Tour ( "La Vita Nuova", "Ewaldstraße 81, 45699 Herten", R.drawable.la_restaurant ) );
        tours.add ( new Tour ( "Restaurant Vangelis", "Reitkamp 61, 45699 Herten", R.drawable.vangeli_restaurant ) );
        tours.add ( new Tour ( "Schnitzelhaus - Christ", "Herner Str. 66, 45699 Herten", R.drawable.christ_restaurant ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );
    }
}
