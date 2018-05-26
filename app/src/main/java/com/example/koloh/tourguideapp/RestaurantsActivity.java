package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_restaurants );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Restaurant Opatija", "Josefstraße 27, 45699 Herten", R.drawable.opatiji_restaurant, "https://goo.gl/maps/TU4waE6eVRs" ) );
        tours.add ( new Tour ( "La Vita Nuova", "Ewaldstraße 81, 45699 Herten", R.drawable.la_restaurant, "https://goo.gl/maps/xjZ7Hv8Lx8r" ) );
        tours.add ( new Tour ( "Restaurant Vangelis", "Reitkamp 61, 45699 Herten", R.drawable.vangeli_restaurant, "https://goo.gl/maps/51kzhBsSRgK2" ) );
        tours.add ( new Tour ( "Schnitzelhaus - Christ", "Herner Str. 66, 45699 Herten", R.drawable.christ_restaurant, "https://goo.gl/maps/GvVdz37ePEF2" ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours, R.color.category_restaurant );

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
