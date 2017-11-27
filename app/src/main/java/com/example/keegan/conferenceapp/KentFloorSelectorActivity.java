package com.example.keegan.conferenceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toolbar;
import android.widget.ListView;

public class KentFloorSelectorActivity extends AppCompatActivity {

    Toolbar toolbar;

    public Button firstFloorButton;
        public void changeMapActivity(){
            firstFloorButton = (Button)findViewById(R.id.firstFloorButton);

           // ArrayAdapter<String> mapsAdapter = new ArrayAdapter<~>(KentFloorSelectorActivity.this,R.layout.list_item_layout, getResources().getString());

            firstFloorButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    Intent toFirstFloorMap = new Intent(KentFloorSelectorActivity.this, MapImgActivity.class);
                   // toFirstFloorMap.putExtra("First Floor Maps", firstFloorButton.getItemAtPosition().toString());
                   // intent.putExtra("Map", i);
                    startActivity(toFirstFloorMap);
                }
                                                }
            );

            Button secondFloorButton = (Button)findViewById(R.id.secondFloorButton);
            secondFloorButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    Intent toSecondFloorMap = new Intent(KentFloorSelectorActivity.this, KentSecondFloorActivity.class);
                    startActivity(toSecondFloorMap);
                }
            }
            );
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kent_floor_selector);

        changeMapActivity();

    }
}
