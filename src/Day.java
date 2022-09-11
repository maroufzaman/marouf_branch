import java.time.DayOfWeek;
import java.util.*;

public class Day implement Comparable{

    // declare variables
    private DayOfWeek dayOfWeek;

    private String name;

    private int age

    private int month;

    private int year;





    private boolean done = false;

    //constructor
    public Day() {

        Calendar c = new GregorianCalendar();
        System.out.print(c.getTime());

    }

    public Day(int x , String y ){
        dayOfWeek = DayOfWeek.of(x);
        task = y;

        Calendar c = new GregorianCalendar();
        System.out.print(c.getTime());

    }









    // set the  day for the assigned task
    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    //set the month for assigned task
    public void setMonth(int month) {
        this.month = month;
    }

    //set the year for assigned task
    public void setYear(int year) {
        this.year = year;
    }

    //set the assigned task for the day
    public void setTask(String task) {
        this.task = task;
    }



    //set the done to true or false  for assigned task
    public void setDone(boolean x){
        done = x;
    }

    //set the name of the officer who is assigned to do the task
    public void setName(String name) {
        this.name = name;
    }

    //set the officer age
    public void setAge(int age) {
        this.age = age;
    }

    //get the year
    public int getYear(){
        return year;
    }

    //get the month
    public int getMonth(){
        return month;
    }


    //cheek whether the assigned task is done
    public boolean isDone(){
        return done;
    }

    //get the day of week for the assigned task
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    //get the officer name assigned for the task
    public String getName() {
        return name;
    }

    //get the officer age
    public int getAge() {
        return age;
    }
}
