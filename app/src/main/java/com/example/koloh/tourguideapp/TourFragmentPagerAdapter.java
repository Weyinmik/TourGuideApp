package com.example.koloh.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link TourFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Tour} objects.
 */
public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link TourFragmentPagerAdapter} object.
     *
     * @param context         is the context of the app
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *                        across swipes.
     */
    public TourFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {
        super ( fragmentManager );
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString ( R.string.title_discover );
        } else if (position == 1) {
            return mContext.getString ( R.string.title_companies );
        } else if (position == 2) {
            return mContext.getString ( R.string.title_hotels );
        } else if (position == 3) {
            return mContext.getString ( R.string.title_sport );
        } else {
            return mContext.getString ( R.string.title_restaurants );
        }
    }
}