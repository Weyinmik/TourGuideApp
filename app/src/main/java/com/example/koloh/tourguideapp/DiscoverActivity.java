package com.example.koloh.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_companies );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Colliery mallets & Iron", "Hiberniastraße 12, 45699 Herten" ) );
        tours.add ( new Tour ( "Halde Hoheward", "Halde Hoheward, 45699 Herten" ) );
        tours.add ( new Tour ( "Schloss Herten", "15, Im Schloßpark, 45699 Herten" ) );
        tours.add ( new Tour ( "NEW HORIZONS - In the footsteps of time", "Werner-Heisenberg-Straße 14, 45699 Herten" ) );
        tours.add ( new Tour ( "Halde Hoppenbruch", "45699 Herten" ) );
        

        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );
    }
}
