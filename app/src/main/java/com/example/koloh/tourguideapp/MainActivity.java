package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // Sets the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        // Finds the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById ( R.id.viewpager );

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter ( getSupportFragmentManager () );

        // Sets the adapter onto the view pager
        viewPager.setAdapter ( adapter );

        // Finds the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById ( R.id.tour_tabs );

        /** Connect the tab layout with the view pager to update the tab layout when the view pager is swiped
         and update the view pager when a tab is selected.
         Also, set the tab layout's tab names with the view pager's adapter's titles by calling onPageTitle()
         **/
        tabLayout.setupWithViewPager ( viewPager );
    }
}
