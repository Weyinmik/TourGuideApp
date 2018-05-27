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
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_prosoz ), getResources ().getString ( R.string.company_address_prosoz ), R.drawable.prosoz, getResources ().getString ( R.string.company_website_prosoz ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_joh ), getResources ().getString ( R.string.company_address_joh ), R.drawable.johnredt, getResources ().getString ( R.string.company_address_joh ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_spedition ), getResources ().getString ( R.string.company_address_spedition ), R.drawable.william, getResources ().getString ( R.string.company_address_spedition ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_autohaus ), getResources ().getString ( R.string.company_address_autohaus ), R.drawable.auto, getResources ().getString ( R.string.company_address_autohaus ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_imperial ), getResources ().getString ( R.string.company_address_imperial ), R.drawable.imperial, getResources ().getString ( R.string.company_address_imperial ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_klaeser ), getResources ().getString ( R.string.company_address_klaeser ), R.drawable.klaser, getResources ().getString ( R.string.company_address_klaeser ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_hertener ), getResources ().getString ( R.string.company_address_hertener ), R.drawable.stadtwerk, getResources ().getString ( R.string.company_address_hertener ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_herta ), getResources ().getString ( R.string.company_address_herta ), R.drawable.herta, getResources ().getString ( R.string.company_address_herta ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_cocacola ), getResources ().getString ( R.string.company_address_cocacola ), R.drawable.cocacola, getResources ().getString ( R.string.company_address_cocacola ) ) );
        tours.add ( new Tour ( getResources ().getString ( R.string.company_name_isra ), getResources ().getString ( R.string.company_address_isra ), R.drawable.isra, getResources ().getString ( R.string.company_address_isra ) ) );

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


