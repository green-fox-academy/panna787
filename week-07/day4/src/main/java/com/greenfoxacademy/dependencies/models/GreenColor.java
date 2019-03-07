package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class GreenColor implements MyColor {

    private Printer p;

    @Autowired
    GreenColor(Printer p){
        this.p = p;
    }

    @Override
    public void printColor() {
        System.out.println("It is green in color...");
    }
}
