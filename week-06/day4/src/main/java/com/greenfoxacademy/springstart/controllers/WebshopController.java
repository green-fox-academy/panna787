package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ShopItem;
import com.greenfoxacademy.springstart.models.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
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
        List<ShopItem> availableItems = itemList.getShopItemList().stream()
                .filter(item -> item.getInStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("items", availableItems);
        return "index";
    }

    @RequestMapping(value="/cheapest-first")
    public String cheapestFirst(Model model){
        ShopItems itemList = new ShopItems();
        List<ShopItem> sortedItems = itemList.getShopItemList().stream()
                .sorted()
                .collect(Collectors.toList());
        model.addAttribute("items", sortedItems);
        return "index";
    }

    @RequestMapping(value="/contains-scythe")
    public String containsScythe(Model model){
        ShopItems itemList = new ShopItems();
        List<ShopItem> itemsWithScythe = itemList.getShopItemList().stream()
                .filter(s -> s.getName().toLowerCase().contains("scythe") || s.getDescription().toLowerCase().contains("scythe"))
                .collect(Collectors.toList());
        model.addAttribute("items", itemsWithScythe);
        return "index";
    }

    @RequestMapping(value = "/most-expensive-available")
    public String mostExpensiveAvailable(Model model){
        ShopItems itemList = new ShopItems();
        List<ShopItem> mostExpensiveAvailableItem = itemList.getShopItemList().stream()
                .filter(a -> a.getInStock() > 0)
                .sorted((a, b) -> a.getPrice() >= b.getPrice() ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList());
        model.addAttribute("items", mostExpensiveAvailableItem);
        return "index";
    }

    @RequestMapping(value = "/average-stock")
    public String averageStock(Model model){
        ShopItems itemList = new ShopItems();
        OptionalDouble average = itemList.getShopItemList().stream().mapToDouble(a -> a.getInStock()).average();
        model.addAttribute("average", average.getAsDouble());
        return "averagestock";
    }

}
