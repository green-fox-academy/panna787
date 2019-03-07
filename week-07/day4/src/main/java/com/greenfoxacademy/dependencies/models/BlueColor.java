package com.greenfoxacademy.dependencies.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    private Printer p;

    @Autowired
    BlueColor(Printer p){
        this.p = p;
    }

    @Override
    public void printColor() {
        p.log("It is blue in color...");
    }
}
