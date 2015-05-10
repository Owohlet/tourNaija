package com.iykeowoh.tournaija;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by iykeowoh on 4/29/15.
 */
public class CategoryFragment extends Fragment implements AdapterView.OnItemClickListener{
    private ListView mylistview;

    String category[] = {"Beaches", "Resorts", "Restaurant", "Parks", "Night Life", "Hotels", "Mountain Areas"};
    private ArrayAdapter<String> listAdapter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.category, container, false);
        listAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, category );
        mylistview = (ListView) rootView.findViewById(R.id.lvCategory);

        mylistview.setAdapter(listAdapter);
        mylistview.setOnItemClickListener(this);

        return rootView;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){

            case 0:
                Intent beachIntent = new Intent(getActivity(), Beaches.class);
                startActivity(beachIntent);

                break;

            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;

        }

    }
}
