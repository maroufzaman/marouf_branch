/*  This is the Controller file; definitely a work in progress

    skeleton code is built from Dan Vega's video from 6:52
        and screenshot sent by Amrin (thanks Amrin)
*/

package com.rmrfroot.tasktracker222.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController   //@RestController automatically combines the @GetMapping and @ResponseBody annotations.
                    //@ResponseBody returns text rather than a template.
@Controller
@CrossOrigin
public class TestController {
    // missing: .getInstance();

    @GetMapping("/testpage")
    public String testPage(Model model) {
        //model.addAttribute("data", DATA OBJECT HERE);

        return "testpage";
    }
}