package com.example.keegan.conferenceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;
import android.widget.ListView;

public class MapSelectorActivity extends AppCompatActivity {

    Toolbar mapSelectorToolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_floor_selector);

        listView = (ListView) findViewById(R.id.mapsListView);
       // int[] mapImageArray = {R.drawable.kent_first_floor, R.drawable.kent_second_floor, R.drawable.simpson_college_campus_map, R.drawable.simpson_parking_map};
        //CustomAdapter mapsAdapter = new CustomAdapter(MapSelectorActivity.this, getResources().getStringArray(R.array.mapNames), mapImageArray);
        //listView.setAdapter(mapsAdapter);

        //Creates adapter that populates the listView with string array of all maps.
        ArrayAdapter<String> mapsAdapter = new ArrayAdapter<String>(MapSelectorActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mapNames));
        listView.setAdapter(mapsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //Passes the position of the drawable resource that matches the item selected
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent toMapImgActivity = new Intent(MapSelectorActivity.this, MapImgActivity.class);
                toMapImgActivity.putExtra("mapNames", listView.getItemAtPosition(i).toString());
                toMapImgActivity.putExtra("mapImage", i);
                startActivity(toMapImgActivity);

            }
        });

    }
}
