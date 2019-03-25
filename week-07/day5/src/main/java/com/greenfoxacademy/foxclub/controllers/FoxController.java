package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private Fox currentFox;

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.GET)
    public String showNutritionStore(@RequestParam String name, Model model){
        model.addAttribute("currentFox", this.currentFox);
        return "nutritionStore";
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.POST)
    public String changeFoxFoodAndDrink(@ModelAttribute(name="fox") Fox fox, String food, String drink){

        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/?name=" + fox.getName();
    }

    public Fox getCurrentFox() {
        return currentFox;
    }

    public void setCurrentFox(Fox currentFox) {
        this.currentFox = currentFox;
    }
}
