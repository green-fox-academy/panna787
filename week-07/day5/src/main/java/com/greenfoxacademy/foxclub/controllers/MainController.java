package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    private List<Fox> foxes = new ArrayList<>();

    public MainController(){
        foxes.add(new Fox("fox1", "food1", "drink1"));
        foxes.add(new Fox("fox2", "food2", "drink2"));
        foxes.add(new Fox("fox3", "food3", "drink3"));
    }

    @RequestMapping("/")
    public String main(Model model,@RequestParam(name="name") String name){
        Fox fox = null;
        for (Fox f: foxes) {
            if(name.equals(f.getName())){
                fox = f;
            }
        }
        if(fox != null){
            model.addAttribute("fox", fox);
            return "index";

        } else {
            foxes.add(new Fox(name));
            return "login";
        }
    }

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public String loginForm(){

        return "login";
    }

    @RequestMapping(value = "/login", method= RequestMethod.POST)
    public String login(@ModelAttribute(name="fox") Fox fox, @RequestParam String name){

        return "redirect:/?name=" + name;
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.GET)
    public String showNutritionStore(){
        return "nutritionStore";
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.POST)
    public String changeFoxFoodAndDrink(@ModelAttribute(name="fox") Fox fox, String food, String drink){

        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/?name=" + fox.getName();
    }
}
