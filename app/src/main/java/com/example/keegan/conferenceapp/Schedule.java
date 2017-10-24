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
    private int amountOfTimeBlocks = 0;

    public Schedule(GregorianCalendar day){
        this.day = day;
        this.amountOfTimeBlocks++;
    }

    public String[] contains(){
        String[] containsTimeBlocks = new String[amountOfTimeBlocks];

        return containsTimeBlocks;
    }


    @Override
    public String toString() {
        return day.get(GregorianCalendar.MONTH) + "/" + day.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
