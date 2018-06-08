package com.example.android.portlandtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of restaurants
        final ArrayList<Location> restaurants = new ArrayList<Location>();
        restaurants.add(new Location(getString(R.string.otg), getString(R.string.address13), R.drawable.otg));
        restaurants.add(new Location(getString(R.string.brunchbox), getString(R.string.address14), R.drawable.brunchbox));
        restaurants.add(new Location(getString(R.string.pokpok), getString(R.string.address15), R.drawable.pokpok));
        restaurants.add(new Location(getString(R.string.schmizza), getString(R.string.address16), R.drawable.schmizza));
        restaurants.add(new Location(getString(R.string.lotus), getString(R.string.address17), R.drawable.lotus));
        restaurants.add(new Location(getString(R.string.bunk), getString(R.string.address18), R.drawable.bunk));
        restaurants.add(new Location(getString(R.string.hubers), getString(R.string.address19), R.drawable.hubers));
        restaurants.add(new Location(getString(R.string.paradox), getString(R.string.address20), R.drawable.paradox));
        restaurants.add(new Location(getString(R.string.pinestate), getString(R.string.address21), R.drawable.pinestate));
        restaurants.add(new Location(getString(R.string.burgerville), getString(R.string.address22), R.drawable.burgerville));
        restaurants.add(new Location(getString(R.string.saltstraw), getString(R.string.address23), R.drawable.saltstraw));
        restaurants.add(new Location(getString(R.string.potatochamp), getString(R.string.address24), R.drawable.potatochamp));

        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurants, R.color.restaurantsbackground);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}
