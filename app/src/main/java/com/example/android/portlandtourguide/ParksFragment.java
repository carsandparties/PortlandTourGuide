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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of parks
        final ArrayList<Location> parks = new ArrayList<Location>();
        parks.add(new Location(getString(R.string.laurelhurst), getString(R.string.address1), R.drawable.laurelhurst));
        parks.add(new Location(getString(R.string.washington), getString(R.string.address2), R.drawable.washingtonpark));
        parks.add(new Location(getString(R.string.millends), getString(R.string.address3), R.drawable.millends));
        parks.add(new Location(getString(R.string.marquam), getString(R.string.address4), R.drawable.marquam));
        parks.add(new Location(getString(R.string.peninsula), getString(R.string.address5), R.drawable.peninsula));
        parks.add(new Location(getString(R.string.overlook), getString(R.string.address6), R.drawable.overlook));
        parks.add(new Location(getString(R.string.tanner), getString(R.string.address7), R.drawable.tanner));
        parks.add(new Location(getString(R.string.scott), getString(R.string.address8), R.drawable.scott));
        parks.add(new Location(getString(R.string.sellwood), getString(R.string.address9), R.drawable.sellwood));
        parks.add(new Location(getString(R.string.alberta), getString(R.string.address10), R.drawable.alberta));
        parks.add(new Location(getString(R.string.woodstock), getString(R.string.address11), R.drawable.woodstock));
        parks.add(new Location(getString(R.string.wallace), getString(R.string.address12), R.drawable.wallace));

        LocationAdapter adapter = new LocationAdapter(getActivity(), parks, R.color.parksbackground);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }
}
