package com.rmrfroot.tasktracker222.Controller;

import com.rmrfroot.tasktracker222.Entity.Day;
import com.rmrfroot.tasktracker222.Service.DaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DayCollectionConroller {


    @Autowired
    private DaoService daoService;


    @GetMapping("/main/dayCollection")
    public String main(Model model){
        List<Day> dayList =daoService.findAll();

        model.addAttribute("days", dayList);
        return "dayCollection";
    }
}
