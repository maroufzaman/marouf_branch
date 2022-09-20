package com.rmrfroot.tasktracker222.controllers;

import com.rmrfroot.tasktracker222.entities.Drill;
import com.rmrfroot.tasktracker222.services.DrillDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class DrillSchedulerController {

    //get day collection singleton

    // ONLY GetMapping works for now
    // because front end has no way of importing data into the database
    @Autowired
    private DrillDaoService drillDaoService;

    public DrillSchedulerController(DrillDaoService drillDaoService){
        super();
        this.drillDaoService = drillDaoService;
    }

    @GetMapping("/drill-schedule-recipient")
    public String main(Model model) {
        return "drillScheduler";
    }

    @GetMapping("/drill-schedule-recipient/drills")                       // made a drills.html to check if scheduler
    public String getDrillCollection(Model model) {                          // is able to retrieve database
        model.addAttribute("drills", drillDaoService.findAll());
        return "drills";
    }
    @GetMapping("/drill-schedule-recipient/drills/{id}")
    public String findById(@PathVariable("id") int id, Model model  ) {
        model.addAttribute("drills", drillDaoService.findById(id));
        return "drills";
    }
/*
    @PostMapping("/drill-schedule-recipient")
    public String save(@ModelAttribute("drills") Drill drill) {
        drillDaoService.save(drill);
        return "redirect:/drill-schedule-recipient";
    }
*/
    @PutMapping()
    public ResponseEntity<Drill> update(@PathVariable("id") int id, Drill drill) {

        return new ResponseEntity<>(drillDaoService.update(id, drill), HttpStatus.OK);
    }

    @DeleteMapping()
    public void deleteById(@PathVariable("id") int id) {
        drillDaoService.deleteById(id);
    }

}
