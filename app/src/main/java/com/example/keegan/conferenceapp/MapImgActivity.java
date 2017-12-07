package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MapImgActivity extends AppCompatActivity {
    ImageView map;
    int position;
    int[] mapImageArray = {R.drawable.kent_first_floor, R.drawable.kent_second_floor, R.drawable.simpson_college_campus_map, R.drawable.simpson_parking_map};


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_img);

        map = (ImageView) findViewById(R.id.mapReciever);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            position = bundle.getInt("mapImage");
            map.setImageResource(mapImageArray[position]);

        }
    }
}
