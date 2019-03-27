package com.greenfoxacademy.foxclub.models;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Trick> listOfTricks;
    private String food;
    private String drink;
    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    public Fox(){
        this.name = "Default";
        this.food = "pizza";
        this.drink = "lemonade";
        this.listOfTricks = new ArrayList<>();
    }

    public Fox(String name){
        this.name = name;
        this.food = "pizza";
        this.drink = "lemonade";
        this.listOfTricks = new ArrayList<>();
    }

    public Fox(String name, String food, String drink){
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.listOfTricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<Trick> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
