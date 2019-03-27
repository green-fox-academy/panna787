package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxes = new ArrayList<>();
    private Fox currentFox;

    public FoxService(){

    }

    public Fox findFoxByName(String name){
        Fox fox = null;
        for (Fox f: foxes) {
            if(name.equals(f.getName())) {
                fox = f;
            }
        }
        return fox;
    }

    public void addNewTrick(String name, Trick trick){
        findFoxByName(name).getListOfTricks().add(trick);
    }

    public Fox getCurrentFox() {
        return currentFox;
    }

    public void setCurrentFox(Fox currentFox) {
        this.currentFox = currentFox;
    }

    public void addNewFox(Fox fox){
        foxes.add(fox);
    }
}
