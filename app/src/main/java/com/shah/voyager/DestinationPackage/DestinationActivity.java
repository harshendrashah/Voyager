package com.shah.voyager.DestinationPackage;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import com.shah.voyager.R;

import java.util.ArrayList;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.list_layout);

        super.onCreate(savedInstanceState);

        Integer id = getIntent().getIntExtra("CardView_Id",R.id.top_destinations);

        ArrayList<Destination> destinations = new ArrayList<Destination>();

        DestinationAdapter adapter;
        ListView listView = findViewById(R.id.list);

        if(id == R.id.top_destinations) {

            setTitle(R.string.top_destinations);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.top_destinations)));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(getResources().getColor(R.color.stat_top_destinations));
            }

            destinations.add(new Destination(R.drawable.prague, R.string.prague, R.string.Null));
            destinations.add(new Destination(R.drawable.rome, R.string.rome, R.string.Null));
            destinations.add(new Destination(R.drawable.paris, R.string.paris, R.string.Null));
            destinations.add(new Destination(R.drawable.switzerland, R.string.switzerland, R.string.Null));
            destinations.add(new Destination(R.drawable.florence, R.string.florence, R.string.Null));

            adapter = new DestinationAdapter(this,destinations,R.color.trans_top_destinations);

            listView.setAdapter(adapter);


        }

        else if(id == R.id.beaches) {

            setTitle(R.string.beaches);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.beaches)));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(getResources().getColor(R.color.stat_beaches));
            }

            destinations.add(new Destination(R.drawable.beach_navagio,R.string.navagio,R.string.Null));
            destinations.add(new Destination(R.drawable.beach_ansesource_d_argent,R.string.anse_source_d_argent,R.string.Null));
            destinations.add(new Destination(R.drawable.beach_la_concha,R.string.la_concha,R.string.Null));
            destinations.add(new Destination(R.drawable.beach_champagne,R.string.champagne,R.string.Null));
            destinations.add(new Destination(R.drawable.beach_bondi,R.string.bondi,R.string.Null));
            destinations.add(new Destination(R.drawable.beach_nissi,R.string.nissi,R.string.Null));

            adapter = new DestinationAdapter(this,destinations,R.color.trans_beaches);

            listView.setAdapter(adapter);

        }

        else if(id == R.id.hill_stations){

            setTitle(R.string.hill_stations);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.hill_stations)));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(getResources().getColor(R.color.stat_hill_stations));
            }
        }

        else if(id == R.id.deserts){

            setTitle(R.string.deserts);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.deserts)));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(getResources().getColor(R.color.stat_deserts));
            }
        }
        else if(id == R.id.spiritual_places){

            setTitle(R.string.spiritual_places);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.spiritual_palces)));

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(getResources().getColor(R.color.stat_spiritual_palces));
            }
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DestinationActivity.this,IndividualDestinationActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });

    }
}
