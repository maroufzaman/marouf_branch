
import java.util.*;
public class TaskCollection {

    //declare variables
    private final List<Task> taskCollection = new ArrayList<Task>();

    private int index;

    //constructor
    public TaskCollection() {
            index = 0;
    }

    //add a Task object to the collection
    public void addTask(Task task) {
        taskCollection.add(task);
          index++;
    }

    //remove the Task object
    public void removeTask(Task task) {
      int  i = taskCollection.indexOf(task);
        taskCollection.remove(i);
    }

    //get the number of Task object
    public int size() {
        return taskCollection.size();
    }

    //clear all Task object
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
