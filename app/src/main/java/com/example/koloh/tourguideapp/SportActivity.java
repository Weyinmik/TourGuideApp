package com.example.koloh.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_companies );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Hike in Hoheward – Gipfel Hoheward Loop from Herten-Süd-West", "Intermediate Hiking Tour. Good fitness required. Easily-accessible paths. Suitable for all skill levels." ) );
        tours.add ( new Tour ( "You and your Dog around Herten", "Have a great time around Herten in a secure and free environment." ) );
        tours.add ( new Tour ( "Wellness and Fitness", "Fitness oasis in the Westerholter Gertrudis Hospital offers sports, relaxation and health" ) );
        tours.add ( new Tour ( "Various indoor and outdoor activities at copa ca backum ", "Teichstrasse 20, 45699 Herten" ) );
        tours.add ( new Tour ( "Cycle in Herten", "Ruhr Tourismus GmbH, Centroallee 261,46047 Oberhausen" ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );
    }
}
