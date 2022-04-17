package com.rmrfroot.tasktracker222.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dynamicdrillscheduler")
public class drillController {

    @GetMapping
    public String getSchedule() {
        return "Drill Schedule will be listed here";
    }

}
