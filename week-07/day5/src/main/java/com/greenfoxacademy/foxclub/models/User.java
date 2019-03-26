package com.greenfoxacademy.foxclub.models;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class User {

    private String userName;
    private String password;
    private String confirmPassword;
    private Fox fox;

    public User() {
        this.fox = new Fox();
    }

    public User(String userName, String password, String confirmPassword) {
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.fox = new Fox();
    }

    public String showRegistrationError(){
        return "The user name is already exists!";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Fox getFox() {
        return fox;
    }

    public void setFox(Fox fox) {
        this.fox = fox;
    }
}
