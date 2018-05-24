package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
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
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Hike in Hoheward – Gipfel Hoheward Loop from Herten-Süd-West", "Intermediate Hiking Tour. Good fitness required. Easily-accessible paths.", R.drawable.howard_sport, "https://goo.gl/maps/MVdYtqT62pH2" ) );
        tours.add ( new Tour ( "You and your Dog around Herten", "Have a great time around Herten in a secure and free environment.", R.drawable.walkdog_sport, "https://goo.gl/maps/QxTQNWsZYv92" ) );
        tours.add ( new Tour ( "Wellness and Fitness", "Fitness oasis in the Westerholter Gertrudis Hospital offers sports, relaxation and health", R.drawable.wellness_sport, "https://goo.gl/maps/YYkLqowdgP22" ) );
        tours.add ( new Tour ( "Various indoor and outdoor activities at copa ca backum ", "Teichstrasse 20, 45699 Herten", R.drawable.copa_sport, "https://goo.gl/maps/ZHY5NfNk5SK2" ) );
        tours.add ( new Tour ( "Cycle in Herten", "Ruhr Tourismus GmbH, Centroallee 261,46047 Oberhausen", R.drawable.cycle_sport, "https://goo.gl/maps/UsYkcJxDnwx" ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours, R.color.category_sport );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );

        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tour tour = tours.get ( position ); // to get the correct web page for each list item
                Intent websiteIntent = new Intent ( Intent.ACTION_VIEW, Uri.parse ( tour.getWebResourceId () ) );
                startActivity ( websiteIntent );
            }
        } );
    }
}
