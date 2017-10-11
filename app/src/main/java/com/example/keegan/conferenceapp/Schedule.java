package com.example.keegan.conferenceapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keegan on 9/21/2017.
 */

public class Schedule {

    private List<TimeBlock> timeBlockList = new ArrayList<TimeBlock>();

    public void addTimeBlock(TimeBlock newTimeBlock){
        timeBlockList.add(newTimeBlock);
    }

    public String getBlocks(){


        String timeBlock = "";

        for(int i = 0; i < timeBlockList.size(); i++){
            timeBlock = timeBlockList.get(i).toString() + ",";
        }

        return timeBlock;
    }

    @Override
    public String toString() {
        return "This Schedule is from: " ;
    }
}
