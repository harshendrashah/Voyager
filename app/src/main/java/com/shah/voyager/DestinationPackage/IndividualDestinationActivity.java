package com.shah.voyager.DestinationPackage;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shah.voyager.R;
import com.shah.voyager.TabAdapter;

public class IndividualDestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_destination);

        ViewPager viewPager = (ViewPager)findViewById(R.id.dest_viewpager);

        DestTabAdapter adapter = new DestTabAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.dest_tabs);

        tabLayout.setupWithViewPager(viewPager);

        Bundle bundle = new Bundle();
        bundle.putString("edttext", "data From Activity");
        // set Fragmentclass Arguments
        AboutFragment fragobj = new AboutFragment();
        fragobj.setArguments(bundle);

    }
}
