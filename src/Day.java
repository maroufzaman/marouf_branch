
import java.time.DayOfWeek;
import java.util.*;

public class Day implement Comparable{

    // declare variables
    private DayOfWeek dayOfWeek;

    private string month;

    private int year;







    //constructor
    public Day() {

        Calendar c = new GregorianCalendar();
        System.out.print(c.getTime());

    }

    public Day(int x ){
        dayOfWeek = DayOfWeek.of(x);

        Calendar c = new GregorianCalendar();
        System.out.print(c.getTime());

    }









    // set the  day for the assigned task
    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    //set the month for assigned task
    public void setMonth(String month) {

     if(month.toLowerCase()=="january" ||month.toLowerCase() == "february"  || month.toLowerCase() == "march" ||month.toLowerCase() == "april" ||month.toLowerCase() == "may" || month.toLowerCase() == "june" || month.toLowerCase() == "july" ||month.toLowerCase() == "august"||month.toLowerCase() == "september"||month.toLowerCase() == "october"||month.toLowerCase() == "november"||month.toLowerCase() == "december")
          this.month = month;
     else
         month = "null";

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
    public String getMonth(){
        return month;
    }



    //get the day of week for the assigned task
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


}
