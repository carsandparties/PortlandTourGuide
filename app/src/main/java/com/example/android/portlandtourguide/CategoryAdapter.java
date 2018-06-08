package com.example.android.portlandtourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by elizabethsotomayor on 6/7/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     * @param context is the context of the app
     * @param fm is the fragment manager that keeps each fragment's state in the adapter.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for each page number
     * @param position is the current position of the ViewPager
     * @return the current Fragment
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new NightlifeFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    /**
     * This method contains the number of pages
     * @return the total number of pages in the ViewPager
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.parks);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.nightlife);
        } else {
            return mContext.getString(R.string.shopping);
        }
    }
}