package com.example.keegan.conferenceapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {

    public List<String> listOfDays = new ArrayList<>();
    private String timeBlock;
    private String eventName;
    private List<String> listOfTimeBlocks  = new ArrayList<>();

    public Schedule(String day, String timeBlockStart, String timeBlockEnd, String eventName){
        this.listOfDays.add(day);
        this.listOfTimeBlocks.add(timeBlockStart);
        this.listOfTimeBlocks.add(timeBlockEnd);
        this.eventName = eventName;
    }



    public void addTimeBlock(String timeBlock){

    }

    @Override
    public String toString() {
        return "This time block is scheduled for: " + this.timeBlock;
    }
}
