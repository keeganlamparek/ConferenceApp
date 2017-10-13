package com.example.keegan.conferenceapp;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {

    private List<TimeBlock> timeBlockList;
    private List<Event> allEvents;
    private GregorianCalendar day;
    private int amountOfTimeBlocks = 0;


    public Schedule(ArrayList<TimeBlock> timeBlocks, GregorianCalendar day){
        this.timeBlockList = timeBlocks;
        this.day = day;
        this.amountOfTimeBlocks++;
    }

    public void addTimeBlock(TimeBlock newTimeBlock){
        timeBlockList.add(newTimeBlock);
        amountOfTimeBlocks++;

    }

    public String[] contains(){
        String[] containsTimeBlocks = new String[amountOfTimeBlocks];
        for(int i = 0; i < amountOfTimeBlocks; i++){
            containsTimeBlocks[i] = timeBlockList.get(i).toString();
        }

        return containsTimeBlocks;
    }

    public String hasEvents(){
        String hasTheseEvents = "";
        return hasTheseEvents;

    }

    @Override
    public String toString() {
        return day.get(GregorianCalendar.DAY_OF_MONTH) + "";
    }
}
