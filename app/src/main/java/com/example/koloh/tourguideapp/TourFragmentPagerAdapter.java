package com.example.koloh.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provided the appropriate {@link Fragment} for a view pager.
 */

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourFragmentPagerAdapter(FragmentManager fragmentManager) {
        super ( fragmentManager );
    }

    // Fragments of various activities to be displayed in the appropriate positions
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DiscoverFragment ();
        } else if (position == 1) {
            return new CompanyFragment ();
        } else if (position == 2) {
            return new HotelsFragment ();
        } else if (position == 3) {
            return new SportFragment ();
        } else {
            return new RestaurantsFragment ();
        }
    }

    // Get the number of slides to display
    @Override
    public int getCount() {
        return 5;
    }
}
