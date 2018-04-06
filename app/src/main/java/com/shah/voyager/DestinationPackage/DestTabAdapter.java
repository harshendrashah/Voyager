package com.shah.voyager.DestinationPackage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.shah.voyager.MainFragmentsPackage.HomePageFragment;
import com.shah.voyager.MainFragmentsPackage.HumanWondersFragment;
import com.shah.voyager.MainFragmentsPackage.SeasonalFragment;
import com.shah.voyager.MainFragmentsPackage.TripsFragment;
import com.shah.voyager.R;

/**
 * Created by harshendra on 2/2/18.
 */

public class DestTabAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public DestTabAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AboutFragment();
        }
        else if (position == 1){
            return new AttractionsFragment();
        }
        else{
            return new PhotoGalleryFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.about);
        else if (position == 1)
            return mContext.getString(R.string.attractions);
        else
            return mContext.getString(R.string.photo_gallery);
    }
}

