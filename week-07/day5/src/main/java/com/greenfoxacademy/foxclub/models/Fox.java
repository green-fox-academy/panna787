package com.greenfoxacademy.foxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> listOfTricks = new ArrayList<>();
    private String food = "pizza";
    private String drink = "lemonade";

    public Fox(){

    }

    public Fox(String name){
        this.name = name;

    }

    public Fox(String name, String food, String drink){
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<String> listOfTricks) {
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
