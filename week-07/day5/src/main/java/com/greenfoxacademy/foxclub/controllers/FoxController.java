package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

    @Autowired
    private FoxService service;

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.GET)
    public String showNutritionStore(@RequestParam String name, Model model){
        model.addAttribute("currentFox", service.getCurrentFox());
        return "nutritionStore";
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.POST)
    public String changeFoxFoodAndDrink(@RequestParam String name, String food, String drink){
        service.findFoxByName(name).setFood(food);
        service.findFoxByName(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickCenter")
    public String showTrickCenter(@RequestParam String name, Model model){
        model.addAttribute("currentFox", service.getCurrentFox());
        return "trickcenter";
    }

    @PostMapping("/trickCenter")
    public String learnTricks(@RequestParam String name, String trick){
        service.addNewTrick(name, trick);
        return "redirect:/?name=" + name;
    }
}
