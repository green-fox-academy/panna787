package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private User currentUser;
    private boolean isUserSaved;
    private List<User> users;

    public UserService(){
        this.users = new ArrayList<>();
    }

    public boolean checkIfUserExist(User user){
        boolean userExist = false;
            for (User u: users) {
                if(u.getUserName().equals(user.getUserName())){
                    userExist = true;
                }
            }
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
            this.users.add(user);
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
