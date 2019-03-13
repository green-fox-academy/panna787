package com.greenfox.error.service;

import com.greenfox.error.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aze on 25/10/17.
 */
@Service
public class UserService {

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    
}
