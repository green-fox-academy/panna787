package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private FoxService service;

    public MainController(){

    }

    @RequestMapping("/")
    public String main(Model model,@RequestParam(name="name") String name){
        if(service.findFoxByName(name) != null){
            model.addAttribute("fox", service.findFoxByName(name));
            return "index";
        } else {
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
    public String showNutritionStore(@RequestParam String name){
        return "nutritionStore";
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.POST)
    public String changeFoxFoodAndDrink(@ModelAttribute(name="fox") Fox fox, String food, String drink){

        fox.setFood(food);
        fox.setDrink(drink);
        return "redirect:/?name=" + fox.getName();
    }
}
