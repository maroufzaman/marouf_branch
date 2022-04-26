
import java.util.*;
public class Task {

    //declare variable
    private String  conus_assignment;
    private String  oconus_assignment;
    private String base_preference_assignment;
    private String training;
    private boolean completion;
    private String evaluation_current_assignment;
    private String evaluation_past_assignment;
    private String evaluation_past_past_assignment;
    private int ratings_current;
    private int  ratings_past;
    private int timeline_info;


//constructor
    public Task(){

        completion = false;
    }


    public void setTraining(String training) {
        this.training = training;
    }

    public String getTraining() {
        return training;
    }



}
