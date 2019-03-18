package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.DoubledNumber;
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

    public InputError noInputError(){
        return new InputError();
    }


}
