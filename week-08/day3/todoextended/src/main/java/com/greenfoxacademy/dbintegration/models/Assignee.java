package com.greenfoxacademy.dbintegration.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignee")
    private List<Todo> todos;

    public Assignee(){
        this.todos = new ArrayList<>();
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
        this.todos = todos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void addTodo(Todo todo){
        todos.add(todo);
    }
}
