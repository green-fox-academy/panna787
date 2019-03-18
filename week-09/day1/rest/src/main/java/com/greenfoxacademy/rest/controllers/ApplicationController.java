package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Appended;
import com.greenfoxacademy.rest.models.ArrayHandler;
import com.greenfoxacademy.rest.models.Until;
import com.greenfoxacademy.rest.models.UntilResult;
import com.greenfoxacademy.rest.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/dountil/sum")
    public Object showSumResult(@RequestBody Until until){
        if(until.getUntil() == null){
            return service.showErrorMessage("Please provide a number!");
        } else{
            return service.sumResult(until);
        }
    }

    @PostMapping("/dountil/factor")
    public Object showFactorResult(@RequestBody Until until){
        if(until.getUntil() == null){
            return service.showErrorMessage("Please provide a number!");
        } else{
            return service.factorResult(until);
        }
    }

    @PostMapping("/arrays")
    public Object showArrayCalculationResult(@RequestBody ArrayHandler arrayHandler){
        if(arrayHandler.getWhat() != null && arrayHandler.getNumbers() != null){
            return service.calculateResult(arrayHandler);
        } else {
            return service.showErrorMessage("Please provide what to do with the numbers!");
        }
    }

}
