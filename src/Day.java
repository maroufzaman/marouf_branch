import java.time.DayOfWeek;
import java.util.*;

public class Day implements Comparable{

    // declare variables
    private DayOfWeek dayOfWeek;

<<<<<<< HEAD
=======
    private String name;

    private int age;

>>>>>>> 2d349929eb0f86fe587ab034acab47b5639dbcf8
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








<<<<<<< HEAD
=======
        task = input.nextLine();

    }

    //set the training to do for the day
    public void setTraining(){
        System.out.println("Enter the training to do: ");

        Scanner input = new Scanner(System.in);

        training = input.nextLine();
    }

    // set the  day for the assigned task
    public void setDayOfWeek() {

        System.out.println("Enter the number from 1 to 7 to represent a day:");

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (x >= 1 && x <= 7) {
            dayOfWeek = DayOfWeek.of(x);
            System.out.println(dayOfWeek.name());
        } else {
            System.out.print("Invalid input");
        }

    }

    //set the month for assigned task
    public void setMonth() {

        System.out.println("Enter the number from 1 to 12 to represent a month:");

        Scanner input = new Scanner(System.in);

        int month = input.nextInt();

        switch (month) {

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid input");
        }

    }

    //set the name of the officer who is assigned to do the task
    public void setName(){
        System.out.println("Enter the officer name: ");
        Scanner input = new Scanner(System.in);

        name = input.nextLine();
    }

    //set the officer age
    public void setAge(){

        System.out.println("Enter the officer age: ");
        Scanner input = new Scanner(System.in);

        age = input.nextInt();
    }

    //compare a Day object with another Day object
    public int compareTo(Day other){

        if (year < other.getYear())
            return -1;
        else if (year == other.getYear()){

            if (month < other.getMonth())
                return -1;
             else if (month  == other.getMonth()){

                if (dayOfWeek < other.getDayOfWeek()){
                    return -1;}
                else if (dayOfWeek  == other.getDayOfWeek()){
                    return 0;}
                else if ( dayOfWeek > other.getDayOfWeek()){
                    return 1;}

            }

            else if ( month > other.getMonth())
                return 1;
        }
        else if ( year > other.getYear())
            return 1;

    }

    //set the year for assigned task
    public void setYear() {

        System.out.println("Enter year");

        Scanner input = new Scanner(System.in);

        year = input.nextInt();
        System.out.println(year);

    }
>>>>>>> 2d349929eb0f86fe587ab034acab47b5639dbcf8

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
