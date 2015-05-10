package com.iykeowoh.tournaija;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by iykeowoh on 4/29/15.
 */
public class CitiesFragment extends Fragment {
    private ListView mylistview;

    String city[] = {"Lagos", "Abuja", "Calabar", "Jos", "Enugu", "Port Harcourt", "Ibadan"};
    private ArrayAdapter<String> listAdapter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cities, container, false);
        listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, city );
        mylistview = (ListView) rootView.findViewById(R.id.lv);

        mylistview.setAdapter(listAdapter);

        return rootView;

    }




}
