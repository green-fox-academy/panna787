package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxes = new ArrayList<>();
    private Fox currentFox;

    public FoxService(){
        foxes.add(new Fox("fox1", "food1", "drink1"));
        foxes.add(new Fox("fox2", "food2", "drink2"));
        foxes.add(new Fox("fox3", "food3", "drink3"));
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

    public void addNewTrick(String name, String trick){
        findFoxByName(name).getListOfTricks().add(trick);
    }

    public Fox getCurrentFox() {
        return currentFox;
    }

    public void setCurrentFox(Fox currentFox) {
        this.currentFox = currentFox;
    }
}