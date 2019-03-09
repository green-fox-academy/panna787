package com.greenfoxacademy.practice.models;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Inhabitant {

    private static int nextId = 0;

    private int id;
    private String name;
    private int age;
    private Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Inhabitant(){
        this.id = nextId++;
    }

    public Inhabitant(String name, int age, Gender gender) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
