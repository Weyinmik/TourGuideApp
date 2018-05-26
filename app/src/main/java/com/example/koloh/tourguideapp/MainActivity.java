package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // Set the content of the activity to use the tour_category.xml layout file
        setContentView ( R.layout.tour_category );

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById ( R.id.viewpager );

        // Create an adapter that knows which fragment should be shown on each page
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter ( getSupportFragmentManager () );

        // Set the adapter onto the view pager
        viewPager.setAdapter ( adapter );
    }
}

