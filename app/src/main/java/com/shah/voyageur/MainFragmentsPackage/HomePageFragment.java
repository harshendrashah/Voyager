package com.shah.voyageur.MainFragmentsPackage;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.shah.voyageur.DestinationPackage.DestinationActivity;
import com.shah.voyageur.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment {

    public HomePageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_home_page, container, false);

        android.support.v7.widget.CardView topDestinations = rootView.findViewById(R.id.top_destinations);

        topDestinations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DestinationActivity.class);
                intent.putExtra("CardView_Id",R.id.top_destinations);
                startActivity(intent);

            }
        });

        android.support.v7.widget.CardView beaches = rootView.findViewById(R.id.beaches);

        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DestinationActivity.class);
                intent.putExtra("CardView_Id",R.id.beaches);
                startActivity(intent);

            }
        });

        android.support.v7.widget.CardView hillStations = rootView.findViewById(R.id.hill_stations);

        hillStations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DestinationActivity.class);
                intent.putExtra("CardView_Id",R.id.hill_stations);
                startActivity(intent);

            }
        });

        android.support.v7.widget.CardView deserts = rootView.findViewById(R.id.deserts);

        deserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DestinationActivity.class);
                intent.putExtra("CardView_Id",R.id.deserts);
                startActivity(intent);

            }
        });

        android.support.v7.widget.CardView spiritual_places = rootView.findViewById(R.id.spiritual_places);

        spiritual_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DestinationActivity.class);
                intent.putExtra("CardView_Id",R.id.spiritual_places);
                startActivity(intent);

            }
        });

        return rootView;
    }

}
