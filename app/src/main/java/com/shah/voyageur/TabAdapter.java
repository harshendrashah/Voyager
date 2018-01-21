package com.shah.voyageur;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.shah.voyageur.MainFragmentsPackage.HumanWondersFragment;
import com.shah.voyageur.MainFragmentsPackage.HomePageFragment;
import com.shah.voyageur.MainFragmentsPackage.SeasonalFragment;
import com.shah.voyageur.MainFragmentsPackage.TripsFragment;

/**
 * Created by lenovo on 20-12-2017.
 */

public class TabAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TabAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HomePageFragment();
        }
        else if (position == 1){
            return new SeasonalFragment();
        }
        else if (position == 2){
            return new HumanWondersFragment();
        }
        else{
            return new TripsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.explore);
        else if (position == 1)
            return mContext.getString(R.string.seasonal);
        else if (position == 2)
            return mContext.getString(R.string.human_wonders);
        else
            return mContext.getString(R.string.your_trips);
    }
}
