package com.rmrfroot.tasktracker222;
import java.util.*;

//Generic implementation of a Collection

public class DayCollection {

    //array? lists? queues? or hash?

    private List<Day> dayCollection;
    private int index;






//Constructor
    public DayCollection() {    //ArrayList
        dayCollection = new ArrayList<Day>();
        index = 0 ;
    }

    //add a Day to the DayCollection
    public void add(Day day) {
        dayCollection.add(day);
        index++;
    }

    //get a Day
    public Day getDay(){
       return dayCollection.get(index);
    }


//remove Day from DayCollection
    public void remove(Day day) {
       if (dayCollection.contains(day)){
           int i = dayCollection.indexOf(day);

           dayCollection.remove(i);
       }
    }

//check whether the DayCollection is empty
    public int isEmpty() {
        if(dayCollection.size() == 0)
              return 0;
        return 1;
    }


    //get the number of Day object
    public int getSize() {
        return dayCollection.size();
    }

}
