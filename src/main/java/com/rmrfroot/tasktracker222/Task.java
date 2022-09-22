package com.rmrfroot.tasktracker222;
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

    private int priority;
    private String timeline_info_professional;
    private String timeline_info_personal;
    private String additional_detail;
    private String feedback;
    private Date deadline_conus_assignment;
    private Date deadline_oconus_assignment;
    private Date deadline_base_preference_assignment;
    private Date suspense_ancillary_training;
    private Date suspense_upgrade_training;
    private Date suspense_continuation_training;
    private Date start_conus_assignement_;
    private Date start_oconus_assingment;
    private Date start_base_preference_assignment;
    private Date start_ancillary_training;
    private Date start_upgrade_training;
    private Date start_continuation_training;
    private Date evaluation_project_closure_date;
    private String evaluations_additional_duties_held;
    private int evaluations_info_id;
    private String evaluations_previous_ratings_promotion_statements;
    private String milestone;
    private String evaluation_current_assignment;
    private String evaluation_past_assignment;
    private String evaluation_past_past_assignment;
    private String fitness_previous_score;
    private String fitness_next_assessment;
    private String fitness_goal;
    private String objective;
    private String evaluation_area_for_improvement;
    private String throughout_rating_period;
    private String mentor;
    private String mentee;
    private String goal;
    private String program;
    private String status;
    private String deployment;





//constructor
    public Task(){
      //initializes completion to false
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








    //set timeline info professional for the assignment
    public void setTimeline_info_professional(String timeline_info_professional) {
        this.timeline_info_professional = timeline_info_professional;
    }









    //get the timeline info professional for the assignment
    public String getTimeline_info_professional() {
        return timeline_info_professional;
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








    //set timeline info personal
    public void setTimeline_info_personal(String timeline_info_personal) {
        this.timeline_info_personal = timeline_info_personal;
    }







    //get timeline info personal
    public String getTimeline_info_personal() {
        return timeline_info_personal;
    }






    //set milestone
    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }





    //get milestone
    public String getMilestone() {
        return milestone;
    }






//set the deadline for base preference assignment
    public void setDeadline_base_preference_assignment(Date deadline_base_preference_assignment) {
        this.deadline_base_preference_assignment = deadline_base_preference_assignment;
    }








    //get the deadline for base preference assignment
    public Date getDeadline_base_preference_assignment() {
        return deadline_base_preference_assignment;
    }








    //set the deadline for conus assignement
    public void setDeadline_conus_assignment(Date deadline_conus_assignment) {
        this.deadline_conus_assignment = deadline_conus_assignment;
    }









    //get the deadline for conus assignment
    public Date getDeadline_conus_assignment() {
        return deadline_conus_assignment;
    }









    //set the deadilne for oconus assignment
    public void setDeadline_oconus_assignment(Date deadline_oconus_assignment) {
        this.deadline_oconus_assignment = deadline_oconus_assignment;
    }








    //get the deadline for oconus assignment
    public Date getDeadline_oconus_assignment() {
        return deadline_oconus_assignment;
    }








    //set the start date for base preference assignment
    public void setStart_base_preference_assignment(Date start_base_preference_assignment) {
        this.start_base_preference_assignment = start_base_preference_assignment;
    }




//get the start date for base preference assignment
    public Date getStart_base_preference_assignment() {
        return start_base_preference_assignment;
    }







    //set the start date for conus assignment
    public void setStart_conus_assignement_(Date start_conus_assignement_) {
        this.start_conus_assignement_ = start_conus_assignement_;
    }






    //get start date for conus assignment
    public Date getStart_conus_assignement_() {
        return start_conus_assignement_;
    }








    //set the start date for oconus assignment
    public void setStart_oconus_assingment(Date start_oconus_assingment) {
        this.start_oconus_assingment = start_oconus_assingment;
    }






    //get the start date for oconus assignent
    public Date getStart_oconus_assingment() {
        return start_oconus_assingment;
    }






    //set the start date for ancillary training
    public void setStart_ancillary_training(Date start_ancillary_training) {
        this.start_ancillary_training = start_ancillary_training;
    }







    //get the start Date for ancillary training
    public Date getStart_ancillary_training() {
        return start_ancillary_training;
    }








    //set the start date for upgrade training
    public void setStart_upgrade_training(Date start_upgrade_training) {
        this.start_upgrade_training = start_upgrade_training;
    }







    //get the start date for upgrade training
    public Date getStart_upgrade_training() {
        return start_upgrade_training;
    }








    // set the start date for continuation training
    public void setStart_continuation_training(Date start_continuation_training) {
        this.start_continuation_training = start_continuation_training;
    }





    //get the start date for continuation training
    public Date getStart_continuation_training() {
        return start_continuation_training;
    }







    // set the suspense date for ancillary training
    public void setSuspense_ancillary_training(Date suspense_ancillary_training) {
        this.suspense_ancillary_training = suspense_ancillary_training;
    }








    //get the suspense date for ancillary training
    public Date getSuspense_ancillary_training() {
        return suspense_ancillary_training;
    }










    //set the suspense date for upgrade training
    public void setSuspense_upgrade_training(Date suspense_upgrade_training) {
        this.suspense_upgrade_training = suspense_upgrade_training;
    }







    //get the suspense date for upgrade training
    public Date getSuspense_upgrade_training() {
        return suspense_upgrade_training;
    }









    //set the suspense date for continuation training
    public void setSuspense_continuation_training(Date suspense_continuation_training) {
        this.suspense_continuation_training = suspense_continuation_training;
    }






    //get the suspense date for continuation training
    public Date getSuspense_continuation_training() {
        return suspense_continuation_training;
    }









//set evaluation for current assignment
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









//set priority for assignment
    public void setPriority(int priority) {
        this.priority = priority;
    }








//set fitness goal
    public void setFitness_goal(String fitness_goal) {
        this.fitness_goal = fitness_goal;
    }








//get fitness goal
    public String getFitness_goal() {
        return fitness_goal;
    }








    //set fitness previous score
    public void setFitness_previous_score(String fitness_previous_score) {
        this.fitness_previous_score = fitness_previous_score;
    }







    //get fitness previous score
    public String getFitness_previous_score() {
        return fitness_previous_score;
    }





    //set fitness next assessment
    public void setFitness_next_assessment(String fitness_next_assessment) {
        this.fitness_next_assessment = fitness_next_assessment;
    }






    //get fitness next assessment
    public String getFitness_next_assessment() {
        return fitness_next_assessment;
    }







    //set objective
    public void setObjective(String objective) {
        this.objective = objective;
    }






    //get objective
    public String getObjective() {
        return objective;
    }





//set evaluation area for improvement
    public void setEvaluation_area_for_improvement(String evaluation_area_for_improvement) {
        this.evaluation_area_for_improvement = evaluation_area_for_improvement;
    }





    //get evaluation area for improvement
    public String getEvaluation_area_for_improvement() {
        return evaluation_area_for_improvement;
    }







// set throughout rating period
    public void setThroughout_rating_period(String throughout_rating_period) {
        this.throughout_rating_period = throughout_rating_period;
    }







//get throughout rating period
    public String getThroughout_rating_period() {
        return throughout_rating_period;
    }









    //set the officer's mentor
    public void setMentor(String mentor) {
        this.mentor = mentor;
    }








    //get the officer's mentor
    public String getMentor() {
        return mentor;
    }







//set the officer mentee
    public void setMentee(String mentee) {
        this.mentee = mentee;
    }








    //get the officer mentee
    public String getMentee() {
        return mentee;
    }






    //set personal financial goal for the officer
    public void setGoal(String goal) {
        this.goal = goal;
    }






    //get personal financial goal for the officer
    public String getGoal() {
        return goal;
    }







    //set evaluation project closure date
    public void setEvaluation_project_closure_date(Date evaluation_project_closure_date) {
        this.evaluation_project_closure_date = evaluation_project_closure_date;
    }








//get evaluation project closure date
    public Date getEvaluation_project_closure_date() {
        return evaluation_project_closure_date;
    }








    // set profession goal program
    public void setProgram(String program) {
        this.program = program;
    }









//get profession goal program
    public String getProgram() {
        return program;
    }








    // set professional goal status
    public void setStatus(String status) {
        this.status = status;
    }







//get professional goal status
    public String getStatus() {
        return status;
    }







    //set deployment
    public void setDeployment(String deployment) {
        this.deployment = deployment;
    }






//get deployment
    public String getDeployment() {
        return deployment;
    }





    //set the evaluations additional duties held
    public void setEvaluations_additional_duties_held(String evaluations_additional_duties_held) {
        this.evaluations_additional_duties_held = evaluations_additional_duties_held;
    }





    //get evaluations additional duties held
    public String getEvaluations_additional_duties_held() {
        return evaluations_additional_duties_held;
    }






    //set evaluation info id
    public void setEvaluations_info_id(int evaluations_info_id) {
        this.evaluations_info_id = evaluations_info_id;
    }








    //get evaluation info id
    public int getEvaluations_info_id() {
        return evaluations_info_id;
    }







    //set the evaluations previous ratings promotion statements
    public void setEvaluations_previous_ratings_promotion_statements(String evaluations_previous_ratings_promotion_statements) {
        this.evaluations_previous_ratings_promotion_statements = evaluations_previous_ratings_promotion_statements;
    }








    //get the evaluation previous rating promotion statements
    public String getEvaluations_previous_ratings_promotion_statements() {
        return evaluations_previous_ratings_promotion_statements;
    }





}
