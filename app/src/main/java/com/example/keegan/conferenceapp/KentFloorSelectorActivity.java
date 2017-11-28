package com.example.keegan.conferenceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toolbar;
import android.widget.ListView;

import java.util.List;

public class KentFloorSelectorActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kent_floor_selector);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.mapsListView);

        ArrayAdapter<String> mapsAdapter = new ArrayAdapter<String>(KentFloorSelectorActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.mapNames));
        listView.setAdapter(mapsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent toMapImgActivity = new Intent(KentFloorSelectorActivity.this, MapImgActivity.class);
                toMapImgActivity.putExtra("mapNames", listView.getItemAtPosition(i).toString());
                toMapImgActivity.putExtra("mapImage", i);
                startActivity(toMapImgActivity);

            }
        });


    }
}
