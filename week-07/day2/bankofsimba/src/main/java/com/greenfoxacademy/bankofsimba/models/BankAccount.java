package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean isOwnerAKing;

    public BankAccount(String name, double balance, String animalType){
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isOwnerAKing() {
        return isOwnerAKing;
    }

    public void setOwnerAKing(boolean ownerAKing) {
        isOwnerAKing = ownerAKing;
    }
}
