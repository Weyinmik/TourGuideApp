package com.example.koloh.tourguideapp;

/**
 * {@link Tour} represents more images that users want to know and visit.
 * It contains a default name of the places  and images for the Tour places.
 */

public class Tour {
    /**
     * Name of Places to Tour
     */
    private String mDefaultName;

    /**
     * Address of places to tour
     */
    private String mPlaceAddress;

    /**
     * Image resource ID for the tours
     */
    private int mImageResourceId;

    /**
     * Image resource ID for the tours
     */
    private String mWebResourceId;

    /**
     * Create a new Tour object.
     *
     * @param defaultName  the name of the Tour Place
     * @param placeAddress the address of the place
     *@param imageResourceId is the drawable Resource ID for the image assets
     */
    public Tour(String defaultName, String placeAddress, int imageResourceId, String webResourceId) {
        mDefaultName = defaultName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
        mWebResourceId = webResourceId;
    }

    /**
     * Get the default Name of the tour place.
     */
    public String getDefaultName() {
        return mDefaultName;
    }

    /**
     * Get the Place Address of the tour address.
     */
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    /**
     * Get and returns the Image Resource ID of the place to tour.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get and returns the Web Resource ID of the place to tour.
     */
    public String getWebResourceId() {
        return mWebResourceId;
    }
}

