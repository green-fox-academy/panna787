package com.greenfoxacademy.foxclub.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Trick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "listOfTricks")
    private List<Fox> foxes;

    public Trick() {
    }

    public Trick(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
