
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

//set the conus assignment
    public void setConus_assignment(String conus_assignment) {
        this.conus_assignment = conus_assignment;
    }

    //get the conus assignment
    public String getConus_assignment() {
        return conus_assignment;
    }

    //set the ocunus assignment
    public void setOconus_assignment(String oconus_assignment) {
        this.oconus_assignment = oconus_assignment;
    }

    //get the ocunus assignment
    public String getOconus_assignment() {
        return oconus_assignment;
    }

    //set base preference assignment
    public void setBase_preference_assignment(String base_preference_assignment) {
        this.base_preference_assignment = base_preference_assignment;
    }

    //get base preference assignment
    public String getBase_preference_assignment() {
        return base_preference_assignment;
    }

    //set completion for the assignment
    public void setCompletion(boolean completion) {
        this.completion = completion;
    }

    //check whether the task is completed
    public boolean isCompletion() {
        return completion;
    }

    //set the evaluation for the current assignment
    public void setEvaluation_current_assignment(String evaluation_current_assignment) {
        this.evaluation_current_assignment = evaluation_current_assignment;
    }

    //get the evaluation for the current assignment
    public String getEvaluation_current_assignment() {
        return evaluation_current_assignment;
    }

    //set the evaluation for past assignment
    public void setEvaluation_past_assignment(String evaluation_past_assignment) {
        this.evaluation_past_assignment = evaluation_past_assignment;
    }

//get the evaluation for past assignment
    public String getEvaluation_past_assignment() {
        return evaluation_past_assignment;
    }

//set the evaluation for assignment before the assignment
    public void setEvaluation_past_past_assignment(String evaluation_past_past_assignment) {
        this.evaluation_past_past_assignment = evaluation_past_past_assignment;
    }

    //get the evaluation for assignment before the past assignment


    public String getEvaluation_past_past_assignment() {
        return evaluation_past_past_assignment;
    }

    //set the current rating
    public void setRatings_current(int ratings_current) {
        this.ratings_current = ratings_current;
    }

    //get rating for current assignment
    public int getRatings_current() {
        return ratings_current;
    }

//set rating for past assignment
    public void setRatings_past(int ratings_past) {
        this.ratings_past = ratings_past;
    }

//get rating for past assignment
    public int getRatings_past() {
        return ratings_past;
    }

    //set timeline info for the assignment
    public void setTimeline_info(int timeline_info) {
        this.timeline_info = timeline_info;
    }

    //get the timeline info for the assignment
    public int getTimeline_info() {
        return timeline_info;
    }
}
