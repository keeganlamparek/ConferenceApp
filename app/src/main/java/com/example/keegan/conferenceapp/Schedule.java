package com.example.keegan.conferenceapp;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {

    private List<TimeBlock> timeBlockList;
    private GregorianCalendar day;

    public Schedule(ArrayList<TimeBlock> timeBlocks, GregorianCalendar day){
        this.timeBlockList = timeBlocks;
        this.day = day;
    }

    public void addTimeBlock(TimeBlock newTimeBlock){
        timeBlockList.add(newTimeBlock);
    }

    public String getBlocks(){

        return "";
    }

    @Override
    public String toString() {
        return "This Schedule is from: " ;
    }
}
