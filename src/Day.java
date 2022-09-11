import java.time.DayOfWeek;
import java.util.*;

public class Day implement Comparable{

    // declare variables
    private DayOfWeek dayOfWeek;

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



    //get the year
    public int getYear(){
        return year;
    }

    //get the month
    public int getMonth(){
        return month;
    }



    //get the day of week for the assigned task
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

}
