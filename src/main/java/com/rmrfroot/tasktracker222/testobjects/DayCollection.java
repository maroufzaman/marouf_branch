package com.rmrfroot.tasktracker222.testobjects;
import java.util.*;

//Generic implementation of a Collection

public class DayCollection {

    //array? lists? queues? or hash?
    private List<Day> dayCollection;


    public DayCollection() {    //ArrayList
        dayCollection = new ArrayList<>();
    }

    public void add(Day day) {
        dayCollection.add(day);
    }

    //public void remove(Day day) {
        //needs Day getters to implement
    //}

    public int isEmpty() {
        if(dayCollection.size() == 0)
            return 0;
        return 1;
    }

    public int getSize() {
        return dayCollection.size();
    }

}
