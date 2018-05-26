package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.tour_category );
        getSupportFragmentManager ().beginTransaction ()
                .replace ( R.id.tour_container, new SportFragment () )
                .commit ();

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ( R.string.title_sport );
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );


    }
}
