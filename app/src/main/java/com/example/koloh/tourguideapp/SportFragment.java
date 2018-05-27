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
public class SportFragment extends Fragment {


    public SportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.tour_list, container, false );
        // Create a list of words
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( getResources ().getString ( R.string.sport_name_hike ), getResources ().getString ( R.string.sport_address_hoheward ), R.drawable.howard_sport, getResources ().getString ( R.string.sport_website_hike ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.sport_name_dog ), getResources ().getString ( R.string.sport_address_herten ), R.drawable.walkdog_sport, getResources ().getString ( R.string.sport_website_dog ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.sport_name_wellness ), getResources ().getString ( R.string.sport_address_kuhstrasse ), R.drawable.wellness_sport, getResources ().getString ( R.string.sport_website_wellness ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.sport_name_copa ), getResources ().getString ( R.string.sport_address_teichstrasse ), R.drawable.copa_sport, getResources ().getString ( R.string.sport_website_copa ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.sport_name_cycle ), getResources ().getString ( R.string.sport_address_ruhr ), R.drawable.cycle_sport, getResources ().getString ( R.string.sport_website_cycle ) ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( getActivity (), tours, R.color.category_sport );

        // Finding the {@link ListView} object in the view hierarchy of the {@link Activity}.
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
