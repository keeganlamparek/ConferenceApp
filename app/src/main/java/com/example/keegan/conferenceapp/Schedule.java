package com.example.keegan.conferenceapp;

import java.util.ArrayList;
import java.util.List;
import android.content.SharedPreferences;
/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {

    public static final String PREFS_NAME = "SchedulePrefs";
    private List<String> listOfDays = new ArrayList<>();
    private List<String> listOfStartTimes  = new ArrayList<>();
    private List<String> listOfEndTimes  = new ArrayList<>();


    public Schedule(String day, String timeBlockStart, String timeBlockEnd){
        this.listOfDays.add(day);
        this.listOfStartTimes.add(timeBlockStart);
        this.listOfEndTimes.add(timeBlockEnd);
    }

    public void addDay(String dayToAdd){
        listOfDays.add(dayToAdd);
    }

    public void addStartTime(String timeToAdd){
        listOfStartTimes.add(timeToAdd);
    }

    public void addEndTime(String timeToAdd){
        listOfEndTimes.add(timeToAdd);
    }

    public void commitChanges(){
        // figure this out tomorrow

    }

    public List<String> getDays(){
        return this.listOfDays;
    }

    @Override
    public String toString() {
        return "This time block is scheduled for: " ;
    }
}
