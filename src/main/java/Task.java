import java.util.*;
public class Task {

    //declare variables
    private String  conus_assignment;
    private String  oconus_assignment;
    private String base_preference_assignment;
    private String ancillary_training;
    private String upgrade_training;
    private String continuation_training;
    private boolean completion;
    private String evaluation_current_assignment;
    private String evaluation_past_assignment;
    private String evaluation_past_past_assignment;
    private int priority;
    private String timeline_info;
    private String additional_detail;
    private String feedback;
    private Date deadline;


//constructor
    public Task(){

        completion = false;
    }

    //set the ancillary training
    public void setAncillary_training(String ancillary_training) {
        this.ancillary_training = ancillary_training;
    }

    //set the continuation training
    public void setContinuation_training(String continuation_training) {
        this.continuation_training = continuation_training;
    }

    //set the upgrade training
    public void setUpgrade_training(String upgrade_training) {
        this.upgrade_training = upgrade_training;
    }

    //get the ancillary training
    public String getAncillary_training() {
        return ancillary_training;
    }

    //get the continuation training
    public String getContinuation_training() {
        return continuation_training;
    }

    //get the upgrade training
    public String getUpgrade_training() {
        return upgrade_training;
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

    //set timeline info for the assignment
    public void setTimeline_info(String timeline_info) {
        this.timeline_info = timeline_info;
    }

    //get the timeline info for the assignment
    public String getTimeline_info() {
        return timeline_info;
    }

    //set the priority of the task object
    public void setPriority() {

        Scanner input = new Scanner(System.in);
        System.out.println("Number 1 will represent higher priority and Number 2 will represent lower priority");
        System.out.println("Enter 1 or 2 to determine the priority of the task");
        priority = input.nextInt();
    }

    //get Priority
    public int getPriority() {
        return priority;
    }

    //set additional detail for the assignment
    public void setAdditional_detail(String additional_detail) {
        this.additional_detail = additional_detail;
    }

    //get additional detail for the assignment
    public String getAdditional_detail() {
        return additional_detail;
    }

    //set feedback for the assignment
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    //get feedback for the assignment
    public String getFeedback() {
        return feedback;
    }

    //set the deadline for the assignment
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    //get the deadline for the assignment
    public Date getDeadline() {
        return deadline;
    }


}
