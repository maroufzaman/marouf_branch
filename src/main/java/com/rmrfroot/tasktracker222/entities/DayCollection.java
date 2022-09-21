package com.rmrfroot.tasktracker222.entities;

import java.util.ArrayList;
import java.util.List;

public class DayCollection {
    private List<Day> dayCollection;

    public DayCollection() {
        dayCollection = new ArrayList<>();
    }

    public void add(Day day) {
        dayCollection.add(day);
    }

    public int isEmpty() {
        if(dayCollection.size() == 0)
            return 0;
        return 1;
    }

    public int getSize() {
        return dayCollection.size();
    }
    
    
    //remove Day from DayCollection
    public void remove(Day day) {
       if (dayCollection.contains(day)){
           int i = dayCollection.indexOf(day);

           dayCollection.remove(i);
       }
    }
    
    
//     public Day getDay(){
//       return dayCollection.get(index);
//    }
    
    
}
