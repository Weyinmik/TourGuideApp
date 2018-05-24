package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Colliery mallets & Iron", "Hiberniastraße 12, 45699 Herten", R.drawable.mallet_discover, "https://goo.gl/maps/mw2v9kKgUqm" ) );
        tours.add ( new Tour ( "Halde Hoheward", "Halde Hoheward, 45699 Herten", R.drawable.hohewald_discover, "https://goo.gl/maps/1MmpYqZBUYt" ) );
        tours.add ( new Tour ( "Schloss Herten", "15, Im Schloßpark, 45699 Herten", R.drawable.schloss_discover, "https://goo.gl/maps/Cyg135qUvqy" ) );
        tours.add ( new Tour ( "NEW HORIZONS - In the footsteps of time", "Werner-Heisenberg-Straße 14, 45699 Herten", R.drawable.horizon_discover, "https://goo.gl/maps/sfRDqPg7MHE2" ) );
        tours.add ( new Tour ( "Halde Hoppenbruch", "45699 Herten", R.drawable.halde_discover, "https://goo.gl/maps/cuYHgt6NnhS2" ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours, R.color.category_discover );

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
