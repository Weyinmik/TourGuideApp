package com.example.koloh.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CompanyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        getSupportFragmentManager ().beginTransaction ()
                .replace ( R.id.tour_tabs, new CompanyFragment () )
                .commit ();

    }
}
