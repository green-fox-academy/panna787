package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.DoubledNumber;
import com.greenfoxacademy.rest.models.Greeting;
import com.greenfoxacademy.rest.models.InputError;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    public ApplicationService(){}

    public DoubledNumber doubleNumber(int input){
        DoubledNumber number = new DoubledNumber();
        number.setReceived(input);
        number.setResult(input*2);
        return number;
    }

    public InputError showErrorMessage(String message){
        InputError error = new InputError();
        error.setError(message);
        return error;
    }

    public Greeting showGreeting(String name, String title){
        Greeting greeting = new Greeting();
        greeting.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
        return greeting;
    }


}
