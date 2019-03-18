package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
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
           return service.noInputError();
       }
    }
}
