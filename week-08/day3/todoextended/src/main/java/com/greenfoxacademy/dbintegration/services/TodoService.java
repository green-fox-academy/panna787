package com.greenfoxacademy.dbintegration.services;

import com.greenfoxacademy.dbintegration.models.Todo;
import com.greenfoxacademy.dbintegration.repository.AssigneeRepository;
import com.greenfoxacademy.dbintegration.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository, AssigneeRepository assigneeRepository){
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public List<Todo> getAllTodos(){
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    public void addNewTodo(Todo todo){
        todoRepository.save(todo);
    }

    public void deleteTodo(long id){
        todoRepository.deleteById(id);
    }

    public void updateTodoToDone(long id){
        todoRepository.findById(id).get().setDone(true);
    }
}
