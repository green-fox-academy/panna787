package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ShopItem;
import com.greenfoxacademy.springstart.models.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebshopController {

    @RequestMapping(value="/webshop")
    public String webshop(Model model){
        ShopItems itemList = new ShopItems();
        List<ShopItem> items = itemList.getShopItemList();
        model.addAttribute("items", items);
        return "index";
    }
    @RequestMapping(value="/only-available")
    public String onlyAvailable(Model model){
        ShopItems itemList = new ShopItems();
        List<ShopItem> availableItems = itemList.getShopItemList().stream().filter(item -> item.getInStock() > 0).collect(Collectors.toList());
        model.addAttribute("items", availableItems);
        return "index";
    }

    @RequestMapping(value="/cheapest-first")
    public String cheapestFirst(Model model){
        ShopItems itemList = new ShopItems();
        List<ShopItem> sortedItems = itemList.getShopItemList().stream().collect(Collectors.toList());
        model.addAttribute("items", sortedItems);
        return "index";
    }

}
