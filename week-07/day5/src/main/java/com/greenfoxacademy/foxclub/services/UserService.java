package com.greenfoxacademy.foxclub.services;

import com.greenfoxacademy.foxclub.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private User user;
    private List<User> users;

    public UserService(){
        this.users = new ArrayList<>();
    }

    public boolean checkIfUserExist(User user){
        if(users.size() == 0){
            return false;
        } else {
            boolean userExist = false;
            for (User u: users) {
                if(u.getUserName().equals(user.getUserName())){
                    userExist = true;
                }
            }
            return userExist;
        }
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
        users.add(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
