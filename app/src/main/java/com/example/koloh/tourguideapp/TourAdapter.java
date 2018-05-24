package com.example.koloh.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    /* Resources ID for the background color of tour list*/
    private int mColorResourceId;

    private static final String LOG_TAG = TourAdapter.class.getSimpleName ();

    public TourAdapter(Activity context, ArrayList<Tour> tours, int colorResourceId) {

        super ( context, 0, tours );
        mColorResourceId = colorResourceId;
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

        //IMAGE VIEW FOr the images

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById ( R.id.image );
        // Get the image resource ID from the current TourPlace object and
        // set the image to imageView
        imageView.setImageResource ( currentTourPlace.getImageResourceId () );

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById ( R.id.description_container );
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor ( getContext (), mColorResourceId );
        // Set the background color of the text container View
        textContainer.setBackgroundColor ( color );


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

