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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of parks
        ArrayList<Location> nightlife = new ArrayList<Location>();
        nightlife.add(new Location(getString(R.string.yamhill), getString(R.string.address25), R.drawable.yamhill));
        nightlife.add(new Location(getString(R.string.golddust), getString(R.string.address26), R.drawable.golddust));
        nightlife.add(new Location(getString(R.string.lovecraft), getString(R.string.address27), R.drawable.lovecraft));
        nightlife.add(new Location(getString(R.string.tube), getString(R.string.address28), R.drawable.tube));
        nightlife.add(new Location(getString(R.string.laurelthirst), getString(R.string.address29), R.drawable.laurelthirst));
        nightlife.add(new Location(getString(R.string.myfathersplace), getString(R.string.address30), R.drawable.myfathersplace));
        nightlife.add(new Location(getString(R.string.thenest), getString(R.string.address31), R.drawable.thenest));
        nightlife.add(new Location(getString(R.string.tanker), getString(R.string.address32), R.drawable.tanker));
        nightlife.add(new Location(getString(R.string.spaceroom), getString(R.string.address33), R.drawable.spaceroom));
        nightlife.add(new Location(getString(R.string.groundkontrol), getString(R.string.address34), R.drawable.groundkontrol));
        nightlife.add(new Location(getString(R.string.slingshot), getString(R.string.address35), R.drawable.slingshot));
        nightlife.add(new Location(getString(R.string.hungrytiger), getString(R.string.address36), R.drawable.hungrytiger));

        LocationAdapter adapter = new LocationAdapter(getActivity(), nightlife, R.color.nightlifebackground);

        GridView gridView = (GridView) rootView.findViewById(R.id.list);

        gridView.setAdapter(adapter);

        return rootView;
    }

}
