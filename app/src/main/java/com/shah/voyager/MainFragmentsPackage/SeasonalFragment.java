package com.shah.voyager.MainFragmentsPackage;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shah.voyager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeasonalFragment extends Fragment {


    public SeasonalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_seasonal, container, false);

        return rootView;
    }

}
