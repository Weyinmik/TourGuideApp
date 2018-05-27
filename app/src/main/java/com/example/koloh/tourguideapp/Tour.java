package com.example.koloh.tourguideapp;

/**
 * {@link Tour} represents more images that users want to know and visit.
 * It contains a default name of the places  and images for the Tour places.
 */

public class Tour {
    /**
     * Name of Places to Tour
     */
    private String tourDefaultName;

    /**
     * Address of places to tour
     */
    private String tourPlaceAddress;

    /**
     * Image resource ID for the tour places
     */
    private int tourImageResourceId;

    /**
     * Image resource ID for the tours
     */
    private String tourWebResourceId;

    /**
     * Create a new Tour object.
     *
     * @param defaultName  the name of the Tour Place
     * @param placeAddress the address of the place
     *@param imageResourceId is the drawable Resource ID for the image assets
     */
    public Tour(String defaultName, String placeAddress, int imageResourceId, String webResourceId) {
        tourDefaultName = defaultName;
        tourPlaceAddress = placeAddress;
        tourImageResourceId = imageResourceId;
        tourWebResourceId = webResourceId;
    }

    /**
     * Get the default Name of the tour place.
     */
    public String getDefaultName() {
        return tourDefaultName;
    }

    /**
     * Get the Place Address of the tour address.
     */
    public String getPlaceAddress() {
        return tourPlaceAddress;
    }

    /**
     * Get and returns the Image Resource ID of the place to tour.
     */
    public int getImageResourceId() {
        return tourImageResourceId;
    }

    /**
     * Get and returns the Web Resource ID of the place to tour.
     */
    public String getWebResourceId() {
        return tourWebResourceId;
    }
}

