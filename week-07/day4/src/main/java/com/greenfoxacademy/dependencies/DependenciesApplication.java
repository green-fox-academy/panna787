package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.models.MyColor;
import com.greenfoxacademy.dependencies.models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

    //private Printer p;
    private MyColor m;

    @Autowired
    DependenciesApplication(MyColor m){

        this.m = m;
    }

    public static void main(String[] args) {

        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        m.printColor();
    }
}
