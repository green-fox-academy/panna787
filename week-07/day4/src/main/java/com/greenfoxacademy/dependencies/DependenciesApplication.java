package com.greenfoxacademy.dependencies;

import com.greenfoxacademy.dependencies.models.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

    private Printer p;

    @Autowired
    DependenciesApplication(Printer p){
        this.p = p;
    }

    public static void main(String[] args) {

        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        p.log("... ehh ...");
    }
}
