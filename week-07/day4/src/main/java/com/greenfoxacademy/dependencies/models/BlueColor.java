package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    private Printer p;

    @Autowired
    BlueColor(Printer p){
        p.log("It is blue in color...");
    }

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}
