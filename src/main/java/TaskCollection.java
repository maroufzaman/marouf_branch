
import java.util.*;
public class TaskCollection {

    //declare variables
    private List<Task> task  =  new ArrayList<Task>();
    private int priority;
    private int index;

    //constructor
    public TaskCollection(){

    }

    //add a Task object to the collection
public void addTask(Task t){
        task.add(t);

}

//remove the Task object
public void removeTask(Task t){
      index =  task.indexOf(t);
        task.remove(index);
}

//set the priority of the task object
public void setPriority(){

        Scanner input = new Scanner(System.in);
        System.out.println("Number 1 will represent higher priority and Number 2 will represent lower priority");
        System.out.println("Enter 1 or 2 to determine the priority of the task");
        priority =  input.nextInt();
}

//get Priority
    public int getPriority() {
        return priority;
    }

    //get the number of Task object
    public int size(){
     return  task.size();
}

//clear all Task object
public void clearAll(){
        task.clear();
}

//check whether their is a  task object
public boolean containsTask(Task t){
       return task.contains(t);
}

//get the Task object
public Task getTask(){
     return  task.get(index);
}

//Check whether the TaskCollection is empty
public boolean isEmpty(){
        return  task.isEmpty();
}


}
