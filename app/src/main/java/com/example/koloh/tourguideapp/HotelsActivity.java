package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_hotels );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "Hotel Schloss Westerholt", "Schloßstraße 1, 45701 Herten", R.drawable.schloss_hotel, "https://goo.gl/maps/SFEeqJp3Mby" ) );
        tours.add ( new Tour ( "ibis Styles Hotel Herten", "Resser Weg 36, 45699 Herten", R.drawable.ibis_hotel, "https://goo.gl/maps/VLS5Wd16s4t" ) );
        tours.add ( new Tour ( "Hotel Alt Westerholt", "Schloßstraße 16, 45701 Herten", R.drawable.westerholt_hotel, "https://goo.gl/maps/4P3qimokBkF2" ) );
        tours.add ( new Tour ( "Gasthof Altes Dorf Inh. Christian Lippemeier", "Schloßstraße 15, 45701 Herten", R.drawable.gastholf_hotel, "https://goo.gl/maps/6Ygm1AjC7SM2" ) );
        tours.add ( new Tour ( "Hotel Fousek", "Geschwisterstraße 47, 45701 Herten", R.drawable.fousek_hotel, "https://goo.gl/maps/uKiFPZqZbw92" ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours, R.color.category_hotels );

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