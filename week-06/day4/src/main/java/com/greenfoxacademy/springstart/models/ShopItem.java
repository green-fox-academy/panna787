package com.greenfoxacademy.springstart.models;

public class ShopItem implements Comparable<ShopItem>{
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

   /* public int compareTo(ShopItem s){
        return s.price - this.price;
    }*/

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


    @Override
    public int compareTo(ShopItem s) {
        if(this.getPrice() > s.getPrice()){
            return 1;
        } else if(this.getPrice() == s.getPrice()){
        return 0;
        } else {
            return -1;
        }

    }
}
