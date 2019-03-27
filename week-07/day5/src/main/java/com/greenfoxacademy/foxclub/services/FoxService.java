package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.repositories.FoxRepository;
import com.greenfoxacademy.foxclub.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private FoxRepository repository;
    private TrickRepository trickRepository;
    private Fox currentFox;

    @Autowired
    public FoxService(FoxRepository repository, TrickRepository trickRepository){
        this.repository = repository;
        this.trickRepository = trickRepository;
        trickRepository.save(new Trick("hunt"));
        trickRepository.save(new Trick("learn HTML"));
        trickRepository.save(new Trick("save the world"));
        trickRepository.save(new Trick("bake cookies"));
    }

    public Fox findFoxById(long id){
        return repository.findById(id).get();

    }

    public void addNewTrick(long id, String trick){
        findFoxById(id).getListOfTricks().add(trickRepository.findByDescription(trick));
        repository.save(findFoxById(id));
    }

    public Fox getCurrentFox() {
        return currentFox;
    }

    public void setCurrentFox(Fox currentFox) {
        this.currentFox = currentFox;
    }

    public void addNewFox(Fox fox){
        repository.save(fox);
    }

}
