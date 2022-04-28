package com.rmrfroot.tasktracker222.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DrillSchedulerController {

    //get day collection singleton

    @GetMapping("/drill-schedule-recipient")
    public String drillScheduleRecipient(Model model){
        return "DrillScheduler";
    }

}
