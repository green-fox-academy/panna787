package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;

public class PinkColor implements MyColor {

    private Printer p;

    @Autowired
    PinkColor(Printer p){
        this.p = p;
    }

    @Override
    public void printColor() {
        System.out.println("It is pink in color...");
    }
}
