package com.example.keegan.conferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Schedule example = new Schedule("09/29/17", "1:00 PM", "1:50 PM", "event1");

        example.addDay("10/03/17");
        example.addDay("08/01/17");

        List<String> daysList = example.getDays();
        
        Spinner datesGroup = (Spinner) findViewById(R.id.dateSpinner);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, daysList);
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        datesGroup.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
        // Showing selected spinner item
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


}
