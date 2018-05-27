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
public class DiscoverFragment extends Fragment {


    public DiscoverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.tour_list, container, false );
        // Create a list of tour places
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( getResources ().getString ( R.string.discover_name_iron ), getResources ().getString ( R.string.discover_address_iron ), R.drawable.mallet_discover, getResources ().getString ( R.string.discover_website_iron ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.discover_name_halde ), getResources ().getString ( R.string.discover_address_halde ), R.drawable.hohewald_discover, getResources ().getString ( R.string.discover_website_halde ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.discover_name_schloss ), getResources ().getString ( R.string.discover_address_schloss ), R.drawable.schloss_discover, getResources ().getString ( R.string.discover_website_schloss ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.discover_name_horizon ), getResources ().getString ( R.string.discover_address_horizon ), R.drawable.horizon_discover, getResources ().getString ( R.string.discover_website_horizon ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.discover_name_hoppen ), getResources ().getString ( R.string.discover_address_hoppen ), R.drawable.halde_discover, getResources ().getString ( R.string.discover_website_hoppen ) ) );


        // Created an {@link ArrayAdapter}, whose data source is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( getActivity (), tours, R.color.category_discover );

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
