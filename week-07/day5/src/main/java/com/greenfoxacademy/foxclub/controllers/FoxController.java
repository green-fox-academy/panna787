package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

    private UserService userService;
    private FoxService foxService;

    @Autowired
    public FoxController(UserService userService, FoxService foxService){
        this.userService = userService;
        this.foxService = foxService;
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.GET)
    public String showNutritionStore(@RequestParam(name="id") long id, Model model){
        model.addAttribute("currentFox", foxService.getCurrentFox());
        return "nutritionStore";
    }

    @RequestMapping(value = "/nutritionStore", method= RequestMethod.POST)
    public String changeFoxFoodAndDrink(@RequestParam(name="id") long id, String food, String drink){
        foxService.getCurrentFox().setFood(food);
        foxService.getCurrentFox().setDrink(drink);
        return "redirect:/?id=" + id;
    }

    @GetMapping("/trickCenter")
    public String showTrickCenter(@RequestParam long id, Model model){
        model.addAttribute("currentFox", foxService.findFoxById(id));
        return "trickcenter";
    }

    @PostMapping("/trickCenter")
    public String learnTricks(@RequestParam long id, @ModelAttribute("trick") String trick){
        foxService.addNewTrick(id, trick);
        return "redirect:/?id=" + foxService.getCurrentFox().getId();
    }
}
