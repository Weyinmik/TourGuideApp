package com.example.koloh.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CompanyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_companies );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

// Create a list of words
        ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "PROSOZ Herten GmbH", "Ewaldstraße 261, 45699 Herten", R.drawable.prosoz ) );
        tours.add ( new Tour ( "Johrendt-Bautenschutz GmbH", "Grimmstraße 6, 45701 Herten", R.drawable.johnredt ) );
        tours.add ( new Tour ( "Spedition Wilhelm Mazurek GmbH", "Industriestraße 12B, 45699 Herten", R.drawable.william ) );
        tours.add ( new Tour ( "Autohaus Blendorf GmbH Mazda", "Schlägel-und-Eisen-Straße 36, 45701 Herten", R.drawable.auto ) );
        tours.add ( new Tour ( "Imperial Industrial Logistics GmbH", "Carl-Bosch-Straße 2-6, 45699 Herten", R.drawable.imperial ) );
        tours.add ( new Tour ( "Klaeser Internationale Fachspedition und Fahrzeugbau GmbH", "Hohewardstraße 333, 45699 Herten", R.drawable.klaser ) );
        tours.add ( new Tour ( "Hertener Stadtwerke GmbH", "Herner Str. 21, 45699 Herten", R.drawable.stadtwerk ) );
        tours.add ( new Tour ( "Herta GmbH", "Westerholter Str. 750, 45701 Herten", R.drawable.herta ) );
        tours.add ( new Tour ( "Coca-Cola European Partners Germany GmbH", "Paschenbergstraße 30, 45699 Herten", R.drawable.cocacola ) );
        tours.add ( new Tour ( "ISRA Surface Vision GmbH", "Albert-Einstein-Allee 36-40, 45699 Herten", R.drawable.isra ) );

        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( this, tours );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );
    }
}
