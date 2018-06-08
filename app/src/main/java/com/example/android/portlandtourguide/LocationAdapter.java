package com.example.android.portlandtourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elizabethsotomayor on 6/5/18.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /** Resource ID for background color for each category */
    private int mColorResourceId;

    /**
     * This method is a custom constructor. The context is used to inflate the layout file,
     * and the list is the data to populate into the lists. Creates a new {@link LocationAdapter}
     * object.
     *
     * @param context is the current context, used to inflate the layout file
     * @param locations is a list of Location objects to display in a list
     * @param colorResourceId is the resource ID for the background color for the list of locations
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc)
     *
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate
     * @param parent The parent ViewGroup that is used for inflation
     * @return The View for the posiiton in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml with the ID location
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the location name from the current Location object and
        // set this text on the locationTextView
        locationTextView.setText(currentLocation.getLocation());

        // Find the TextView in the list_item.xml layout file with the ID address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        //Get the address from the current Location object and
        // set this text on the addressTextView
        addressTextView.setText(currentLocation.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView currentImage = (ImageView) listItemView.findViewById(R.id.image);
        currentImage.setImageResource(currentLocation.getImageResourceId());

        // Set the theme color for a given list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the textContainer view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}