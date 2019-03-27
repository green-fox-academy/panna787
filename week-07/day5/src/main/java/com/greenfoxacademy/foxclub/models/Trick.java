package com.greenfoxacademy.foxclub.models;

import javax.persistence.*;

@Entity
public class Trick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @ManyToOne
    private Fox fox;

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

    public Fox getFox() {
        return fox;
    }

    public void setFox(Fox fox) {
        this.fox = fox;
    }

    @Override
    public String toString() {
        return description;
    }
}
