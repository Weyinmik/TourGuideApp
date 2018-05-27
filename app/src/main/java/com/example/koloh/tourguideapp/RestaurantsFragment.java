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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.tour_list, container, false );
        // Create a list of tour places in this category
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( getResources ().getString ( R.string.restaurant_name_opatija ), getResources ().getString ( R.string.restaurant_address_opatija ), R.drawable.opatiji_restaurant, getResources ().getString ( R.string.restaurant_website_opatija ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.restaurant_name_la ), getResources ().getString ( R.string.restaurant_address_la ), R.drawable.la_restaurant, getResources ().getString ( R.string.restaurant_website_la ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.restaurant_name_vangelis ), getResources ().getString ( R.string.restaurant_address_vangelis ), R.drawable.vangeli_restaurant, getResources ().getString ( R.string.restaurant_website_vangelis ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.restaurant_name_schnitzelhaus ), getResources ().getString ( R.string.restaurant_address_schnitzelhaus ), R.drawable.christ_restaurant, getResources ().getString ( R.string.restaurant_website_schnitzelhaus ) ) );


        // This creates a {@link ArrayAdapter}, for the data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( getActivity (), tours, R.color.category_restaurant );

        // Finds the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById ( R.id.list );

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
        return rootView;
    }

}
