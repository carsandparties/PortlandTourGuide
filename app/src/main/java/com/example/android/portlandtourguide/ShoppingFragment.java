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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of parks
        ArrayList<Location> shopping = new ArrayList<Location>();
        shopping.add(new Location(getString(R.string.funkparlor), getString(R.string.address37), R.drawable.funkparlor));
        shopping.add(new Location(getString(R.string.redfox), getString(R.string.address38), R.drawable.redfox));
        shopping.add(new Location(getString(R.string.saturdaymkt), getString(R.string.address39), R.drawable.saturdaymkt));
        shopping.add(new Location(getString(R.string.pioneer), getString(R.string.address40), R.drawable.pioneer));
        shopping.add(new Location(getString(R.string.flutter), getString(R.string.address41), R.drawable.flutter));
        shopping.add(new Location(getString(R.string.portlandgear), getString(R.string.address42), R.drawable.pdxgear));
        shopping.add(new Location(getString(R.string.cascade), getString(R.string.address43), R.drawable.cascade));
        shopping.add(new Location(getString(R.string.washingtonsquare), getString(R.string.address44), R.drawable.washingtonsquare));
        shopping.add(new Location(getString(R.string.jantzen), getString(R.string.address45), R.drawable.jantzen));
        shopping.add(new Location(getString(R.string.fubonn), getString(R.string.address46), R.drawable.fubonn));
        shopping.add(new Location(getString(R.string.presents), getString(R.string.address47), R.drawable.presents));
        shopping.add(new Location(getString(R.string.lloyd), getString(R.string.address48), R.drawable.lloydcenter));

        LocationAdapter adapter = new LocationAdapter(getActivity(), shopping, R.color.shoppingbackground);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}
