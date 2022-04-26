/*  This is the Controller file; definitely a work in progress

    skeleton code is built from Dan Vega's video from 6:52
        and screenshot sent by Amrin (thanks Amrin)
*/

package com.rmrfroot.tasktracker222.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin
public class MainController {
    // missing: .getInstance();

    @GetMapping("/")
    public String MainController() { //missing: parameter for MainController()
        // missing: .addAttribute(); multiple times to argument
        return "This is a test string";
    }
}