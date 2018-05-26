package com.example.koloh.tourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompanyFragment extends Fragment {


    public CompanyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.tour_list, container, false );
        // Create a list of tour places in this category
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( "PROSOZ Herten GmbH", "Ewaldstraße 261, 45699 Herten", R.drawable.prosoz, "https://goo.gl/maps/oGUc7FS1PeK2" ) );
        tours.add ( new Tour ( "Johrendt-Bautenschutz GmbH", "Grimmstraße 6, 45701 Herten", R.drawable.johnredt, "https://goo.gl/maps/qH9Dmu6vWEJ2" ) );
        tours.add ( new Tour ( "Spedition Wilhelm Mazurek GmbH", "Industriestraße 12B, 45699 Herten", R.drawable.william, "https://goo.gl/maps/irE87KjPJMz" ) );
        tours.add ( new Tour ( "Autohaus Blendorf GmbH Mazda", "Schlägel-und-Eisen-Straße 36, 45701 Herten", R.drawable.auto, "https://goo.gl/maps/ucoM4UqY3w52" ) );
        tours.add ( new Tour ( "Imperial Industrial Logistics GmbH", "Carl-Bosch-Straße 2-6, 45699 Herten", R.drawable.imperial, "https://goo.gl/maps/2j6PRFughMG2" ) );
        tours.add ( new Tour ( "Klaeser Int’l. Fachspedition & Fahrzeugbau GmbH", "Hohewardstraße 333, 45699 Herten", R.drawable.klaser, "https://goo.gl/maps/s79jqJid7PM2" ) );
        tours.add ( new Tour ( "Hertener Stadtwerke GmbH", "Herner Str. 21, 45699 Herten", R.drawable.stadtwerk, "https://goo.gl/maps/y184S3aqsK12" ) );
        tours.add ( new Tour ( "Herta GmbH", "Westerholter Str. 750, 45701 Herten", R.drawable.herta, "https://goo.gl/maps/RMKMe8jUWw42" ) );
        tours.add ( new Tour ( "Coca-Cola European Partners Germany GmbH", "Paschenbergstraße 30, 45699 Herten", R.drawable.cocacola, "https://goo.gl/maps/QWnKpjSQYB12" ) );
        tours.add ( new Tour ( "ISRA Surface Vision GmbH", "Albert-Einstein-Allee 36-40, 45699 Herten", R.drawable.isra, "https://goo.gl/maps/syZWcpGnRcw" ) );

        // Creates a {@link ArrayAdapter}, for the data which is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( getActivity (), tours, R.color.category_companies );

        // Finds view by Id on the rootView.
        ListView listView = (ListView) rootView.findViewById ( R.id.list );

        // Making the {@link ListView} use the {@link ArrayAdapter} to enable {@link ListView} display list items.
        listView.setAdapter ( adapter );

        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tour tour = tours.get ( position ); // to get the correct web page for each list item
                Intent websiteIntent = new Intent ( Intent.ACTION_VIEW, Uri.parse ( tour.getWebResourceId () ) );
                startActivity ( websiteIntent );
            }
        } );

        return rootView;
    }
}


