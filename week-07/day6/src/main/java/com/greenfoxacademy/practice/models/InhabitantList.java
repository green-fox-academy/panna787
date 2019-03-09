package com.greenfoxacademy.practice.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InhabitantList {

    private List<Inhabitant> inhabitants = new ArrayList<>();

    public InhabitantList(){
        initializeList();
    }

    public void initializeList(){
        inhabitants.add(new Inhabitant("Micimacko", 4, Gender.MALE));
        inhabitants.add(new Inhabitant("Malacka", 3, Gender.MALE));
    }

    public List<Inhabitant> getInhabitants() {
        return inhabitants;
    }

    public Inhabitant getInhabitantById(int id){
        Inhabitant inhabitant = null;
        for (Inhabitant i: inhabitants) {
            if(i.getId() == id){
                inhabitant = i;
            }
        }
        return inhabitant;
    }

    public void addInhabitant(Inhabitant inhabitant){
        inhabitants.add(inhabitant);
    }
}
