package com.rmrfroot.tasktracker222.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskTrackerController {

    @GetMapping("/task-tracker-user")
    public String taskTrackerUser(Model model){
        return "TaskTracker";
    }
}
