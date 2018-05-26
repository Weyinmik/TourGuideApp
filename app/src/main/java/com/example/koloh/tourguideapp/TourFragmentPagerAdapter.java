package com.example.koloh.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourFragmentPagerAdapter(FragmentManager fragmentManager) {
        super ( fragmentManager );
    }

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

    @Override
    public int getCount() {
        return 5;
    }
}
