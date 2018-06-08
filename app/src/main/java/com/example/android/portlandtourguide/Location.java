package com.example.android.portlandtourguide;

/**
 * Created by elizabethsotomayor on 6/5/18.
 */

/**
 * {@link Location} represents a location that will be displayed to the user.
 * It contains the name of the location, and its address.
 */

public class Location {

    /** Name of the location */
    private String mLocationName;

    /** Address of the location */
    private String mAddress;

    /** Image resource ID for the location*/
    private int mImageResourceId;

    /**
     * Create a new Location object.
     *
     * @param locationName is the name of the location
     * @param address is the address where the location can be found
     */
    public Location(String locationName, String address, int imageResourceId) {
        mLocationName = locationName;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the location name
     */
    public String getLocation() {
        return mLocationName;
    }

    /**
     * Get the address of the location
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the image resource ID of the image associated with the location
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}