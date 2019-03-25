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
    private Fox currentFox;

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.GET)
    public String showNutritionStore(@RequestParam String name, Model model){
        model.addAttribute("currentFox", this.currentFox);
        return "nutritionStore";
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.POST)
    public String changeFoxFoodAndDrink(@RequestParam String name, @ModelAttribute(name="fox") Fox fox, String food, String drink){
        service.findFoxByName(name).setFood(food);
        service.findFoxByName(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }
        

    public Fox getCurrentFox() {
        return currentFox;
    }

    public void setCurrentFox(Fox currentFox) {
        this.currentFox = currentFox;
    }
}
