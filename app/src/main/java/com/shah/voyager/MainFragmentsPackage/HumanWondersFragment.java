package com.shah.voyager.MainFragmentsPackage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shah.voyager.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HumanWondersFragment extends Fragment {


    public HumanWondersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_human_wonders, container, false);
    }

}
