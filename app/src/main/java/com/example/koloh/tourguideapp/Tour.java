package com.example.koloh.tourguideapp;

/**
 * {@link Tour} represents more images that users want to know and visit.
 * It contains a default name of the places  and images for the Tour places.
 */

public class Tour {
    /**
     * Default translation for the word
     */
    private String mDefaultName;

    /**
     * Miwok translation for the word
     */
    private String mPlaceAddress;

    /**
     * Create a new Tour object.
     *
     * @param defaultName  the name of the Tour Place
     * @param placeAddress the address of the place
     */
    public Tour(String defaultName, String placeAddress) {
        mDefaultName = defaultName;
        mPlaceAddress = placeAddress;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultName() {
        return mDefaultName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getPlaceAddress() {
        return mPlaceAddress;
    }
}

