package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.User;
import com.greenfoxacademy.foxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    private User currentUser;
    private boolean isUserSaved;

    public UserService(){

    }

    public boolean checkIfUserExist(User user){
        boolean userExist = repository.findUserByUserName(user.getUserName()) != null;
        return userExist;
    }

    public boolean checkIfPasswordsMatch(User user){
        if(user.getPassword().equals(user.getConfirmPassword())){
            return true;
        } else {
            return false;
        }
    }

    public boolean isRegistrationSuccessful(User user){
        return checkIfPasswordsMatch(user) && !checkIfUserExist(user);
    }

    public void addNewUser(User user){
            repository.save(user);
            this.currentUser = user;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public boolean isUserSaved() {
        return isUserSaved;
    }

    public void setUserSaved(boolean userSaved) {
        isUserSaved = userSaved;
    }
}
