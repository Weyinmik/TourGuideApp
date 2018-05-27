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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate ( R.layout.tour_list, container, false );
        // Create a list of tour places in this category
        final ArrayList<Tour> tours = new ArrayList<Tour> ();
        tours.add ( new Tour ( getResources ().getString ( R.string.hotel_name_schloss ), getResources ().getString ( R.string.hotel_address_schloss ), R.drawable.schloss_hotel, getResources ().getString ( R.string.hotel_website_schloss ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.hotel_name_ibis ), getResources ().getString ( R.string.hotel_address_ibis ), R.drawable.ibis_hotel, getResources ().getString ( R.string.hotel_website_ibis ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.hotel_name_alt ), getResources ().getString ( R.string.hotel_address_alt ), R.drawable.westerholt_hotel, getResources ().getString ( R.string.hotel_website_alt ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.hotel_name_gasthof ), getResources ().getString ( R.string.hotel_address_gasthof ), R.drawable.gastholf_hotel, getResources ().getString ( R.string.hotel_website_gasthof ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.hotel_name_fousek ), getResources ().getString ( R.string.hotel_address_fousek ), R.drawable.fousek_hotel, getResources ().getString ( R.string.hotel_website_fousek ) ) );


        // Creates a {@link ArrayAdapter}, for data source which is a list of Strings.
        TourAdapter adapter =
                new TourAdapter ( getActivity (), tours, R.color.category_hotels );

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