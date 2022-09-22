package com.rmrfroot.tasktracker222;
import java.util.*;
public class TaskCollection {

    //declare variables

    private final List<Task> taskCollection ;

    private int index;

    //constructor
    public TaskCollection() {
        taskCollection= new ArrayList<Task>();

        //initializes the index to 0
        index = 0;
    }


    //add a Task object to the Collection
    public void addTask(Task task) {
        taskCollection.add(task);
          index++;
    }



    //remove the Task object
    public void removeTask(Task task) {
      if (containsTask(task)){
          int  i = taskCollection.indexOf(task);

          taskCollection.remove(i);
      }
    }

    //get the number of Task object
    public int getSize() {
        return taskCollection.size();
    }

    //remove all Task object
    public void removeAll() {
        taskCollection.clear();
    }

    //check whether the given task object is in the taskCollection
    public boolean containsTask(Task task) {
        return taskCollection.contains(task);
    }

    //get the Task object
    public Task getTask() {
        return taskCollection.get(index);
    }

    //Check whether the TaskCollection is empty
    public boolean isEmpty() {
        return taskCollection.isEmpty();
    }

}
