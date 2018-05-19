package com.example.koloh.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    private static final String LOG_TAG = TourAdapter.class.getSimpleName ();

    public TourAdapter(Activity context, ArrayList<Tour> tours) {

        super ( context, 0, tours );
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );
        }

        // Get the {@link Tour} object located at this position in the list
        Tour currentTourPlace = getItem ( position );


        // Find the TextView in the list_item.xml layout with the ID name
        TextView nameTextView = (TextView) listItemView.findViewById ( R.id.name );
        // Get the version name from the current TourPlace object and
        // set this text on the name TextView
        nameTextView.setText ( currentTourPlace.getDefaultName () );

        // Find the TextView in the list_item.xml layout with the ID address
        TextView addressTextView = (TextView) listItemView.findViewById ( R.id.address );
        // Get the version number from the current TourPlace object and
        // set this text on the address TextView
        addressTextView.setText ( currentTourPlace.getPlaceAddress () );

        //IMAGE VIEW FOr the LOgo

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        //ImageView iconView = (ImageView) listItemView.findViewById ( R.id.list_item_icon );
        // Get the image resource ID from the current TourPlace object and
        // set the image to iconView
        // iconView.setImageResource ( currentTourPlace.getImageResourceId () );

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

