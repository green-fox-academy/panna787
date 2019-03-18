package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.*;
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

    public Appended appendAToString(String word){
        Appended appended = new Appended();
        appended.setAppended(word + "a");
        return appended;
    }

    public UntilResult sumResult(Until until){
        UntilResult sumResult = new UntilResult();
        int sum = 0;
        for (int i = until.getUntil(); i > 0; i--) {
            sum += i;
        }
        sumResult.setResult(sum);
        return sumResult;
    }

    public UntilResult factorResult(Until until){
        UntilResult factorResult = new UntilResult();
        int factor = 1;
        for (int i = until.getUntil(); i > 0; i--) {
            factor *= i;
        }
        factorResult.setResult(factor);
        return factorResult;
    }
}
