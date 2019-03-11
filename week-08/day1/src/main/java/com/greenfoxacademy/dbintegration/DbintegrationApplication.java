package com.greenfoxacademy.dbintegration;

import com.greenfoxacademy.dbintegration.models.Todo;
import com.greenfoxacademy.dbintegration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbintegrationApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;


    public static void main(String[] args) {
        SpringApplication.run(DbintegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("something else"));
        todoRepository.save(new Todo("one more"));
    }
}
