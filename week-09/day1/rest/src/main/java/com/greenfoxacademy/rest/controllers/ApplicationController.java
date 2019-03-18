package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Appended;
import com.greenfoxacademy.rest.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    ApplicationService service;

    @Autowired
    public ApplicationController(ApplicationService service){
        this.service = service;
    }

    @RequestMapping("/doubling")
    public Object getDoubledNumber(@RequestParam(required = false) Integer input){
       if(input != null) {
           return service.doubleNumber(input);
       } else {
           return service.showErrorMessage("Please provide an input!");
       }
    }

    @RequestMapping("/greeter")
    public Object showGreeting(@RequestParam(required = false, value = "name") String name, @RequestParam(required = false, value = "title") String title){
        if(name != null && title != null){
            return service.showGreeting(name, title);
        } else if(name == null && title != null){
            return service.showErrorMessage("Please provide a name!");
        } else if(title == null && name != null){
            return service.showErrorMessage("Please provide a title!");
        } else {
            return service.showErrorMessage("Please provide a name and a title!");
        }
    }

    @RequestMapping("/appenda/{appendable}")
    public Appended showAppendedWord(@PathVariable("appendable") String appendable){
        return service.appendAToString(appendable);
    }

    
}
