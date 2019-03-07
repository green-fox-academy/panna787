package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class GreenColor implements MyColor {

    private Printer p;

    @Autowired
    GreenColor(Printer p){
        p.log("It is green in color...");
    }

    @Override
    public void printColor() {
        System.out.println("It is green in color...");
    }
}
