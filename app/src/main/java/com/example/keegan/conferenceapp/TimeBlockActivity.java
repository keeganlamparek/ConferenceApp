package com.example.keegan.conferenceapp;

import java.util.GregorianCalendar;

/**
 * Created by matt.sebek on 12/5/2017.
 */

public class TimeBlockActivity {

    MainActivity mainActivity = new MainActivity();
    GregorianCalendar[][] eventsOnDay = mainActivity.getEventsOnDay1();


    TimeBlock timeBlock1 = new TimeBlock(eventsOnDay[0][0], eventsOnDay[1][0], 5);
}
