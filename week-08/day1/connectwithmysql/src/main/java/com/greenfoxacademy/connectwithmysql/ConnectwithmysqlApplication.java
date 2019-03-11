package com.greenfoxacademy.connectwithmysql;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.models.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectwithmysqlApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*todoRepository.save(new Todo("new todo 1", false, true));
        todoRepository.save(new Todo("new todo 2", true, true));
        todoRepository.save(new Todo("new todo 3", false, false));
        todoRepository.save(new Todo("new todo 4", true, true));*/
    }
}
