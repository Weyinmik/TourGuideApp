package com.example.koloh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        // declare variables for each music category
        TextView discover = (TextView) findViewById ( R.id.discover_herten );
        TextView sport = (TextView) findViewById ( R.id.sport );
        TextView company = (TextView) findViewById ( R.id.companies );
        TextView hotels = (TextView) findViewById ( R.id.hotels );
        TextView restaurants = (TextView) findViewById ( R.id.restaurants );


// Set onClickListener on each TextView
        discover.setOnClickListener ( this );
        sport.setOnClickListener ( this );
        company.setOnClickListener ( this );
        hotels.setOnClickListener ( this );
        restaurants.setOnClickListener ( this );


    }

    @Override
    public void onClick(View v) {
        switch (v.getId ()) {
            case R.id.companies:
                Intent companyIntent = new Intent ( MainActivity.this, CompanyActivity.class );
                startActivity ( companyIntent );
                Toast.makeText ( getApplicationContext (), "You can use the back arrow to go back to Main Screen", Toast.LENGTH_SHORT ).show ();
                break;

            case R.id.discover_herten:
                Intent discoverIntent = new Intent ( MainActivity.this, DiscoverActivity.class );
                startActivity ( discoverIntent );
                Toast.makeText ( getApplicationContext (), "You can use the back arrow to go back to Main Screen", Toast.LENGTH_SHORT ).show ();
                break;

            case R.id.sport:
                Intent countryIntent = new Intent ( MainActivity.this, SportActivity.class );
                startActivity ( countryIntent );
                Toast.makeText ( getApplicationContext (), "You can use the back arrow to go back to Main Screen", Toast.LENGTH_SHORT ).show ();
                break;

            case R.id.hotels:
                Intent hotelIntent = new Intent ( MainActivity.this, HotelsActivity.class );
                startActivity ( hotelIntent );
                Toast.makeText ( getApplicationContext (), "You can use the back arrow to go back to Main Screen", Toast.LENGTH_SHORT ).show ();
                break;

            case R.id.restaurants:
                Intent restaurantIntent = new Intent ( MainActivity.this, RestaurantsActivity.class );
                startActivity ( restaurantIntent );
                Toast.makeText ( getApplicationContext (), "You can use the back arrow to go back to Main Screen", Toast.LENGTH_SHORT ).show ();
                break;


        }
    }
}
