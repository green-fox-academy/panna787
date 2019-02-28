package com.greenfoxacademy.springstart.models;

public class ShopItem {
    private String name;
    private String description;
    private int price;
    private int inStock;

    public ShopItem(String name, String description, int price, int inStock){
        this.name = name;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }

    public int getInStock(){
        return inStock;
    }

}
