package com.rmrfroot.tasktracker222.controllers;


import com.rmrfroot.tasktracker222.entities.Drill;
import com.rmrfroot.tasktracker222.services.DrillDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DrillCollectionController {

    @Autowired
    private DrillDaoService drillDaoService;




    @GetMapping("/main/drillCollection")
    public String main(Model model) {
        List<Drill> drillList = drillDaoService.findAll();

        model.addAttribute("drills", drillList);
        return "drillCollection";
    }
}
