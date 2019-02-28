package com.greenfoxacademy.springstart.models;

import java.util.ArrayList;
import java.util.List;

public class ShopItems {
    private List<ShopItem> shopItemList = new ArrayList<>();

    public ShopItems(){
        shopItemList.add(new ShopItem("Shoes", "running shoes", 5000, 12));
        shopItemList.add(new ShopItem("Shirt", "black shirt", 3000, 4));
        shopItemList.add(new ShopItem("Scythe", "big scythe", 1000, 0));
        shopItemList.add(new ShopItem("Car", "sports car", 47000, 7));
        shopItemList.add(new ShopItem("Wine", "red wine", 500, 26));
    }

    public List<ShopItem> getShopItemList(){
        return shopItemList;
    }
}
