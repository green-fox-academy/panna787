package com.greenfoxacademy.dbintegration.services;

import com.greenfoxacademy.dbintegration.repository.AssigneeRepository;
import com.greenfoxacademy.dbintegration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository){
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }
}
