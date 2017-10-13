package com.example.keegan.conferenceapp;



import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Keegan on 10/5/2017.
 */

public class TimeBlock {


    private GregorianCalendar startTime;
    private GregorianCalendar endTime;
    private int maxEvents;

    public TimeBlock(GregorianCalendar startTime, GregorianCalendar endTime, int maxEvents) {
        this.maxEvents = maxEvents;
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public int getMaxEvents(){
        return maxEvents;
    }


    public String toString(){
        return "This time block is on goes from: " + this.startTime.toString() + " to " + this.endTime.toString() + ".";
    }

}
