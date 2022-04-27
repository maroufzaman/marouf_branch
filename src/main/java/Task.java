
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

     //set the training
    public void setTraining(String training) {
        this.training = training;
    }

    // get the training
    public String getTraining() {
        return training;
    }

    //set the evaluation for the current assignment
    public void setEvaluation_current_assignment(String evaluation_current_assignment) {
        this.evaluation_current_assignment = evaluation_current_assignment;
    }

    //get the evaluation for the current assignment
    public String getEvaluation_current_assignment() {
        return evaluation_current_assignment;
    }






}
