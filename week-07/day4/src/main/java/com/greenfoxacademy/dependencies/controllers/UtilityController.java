package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.models.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    private UtilityService u;

    @Autowired
    public UtilityController(UtilityService u){
        this.u = u;
    }

    @RequestMapping("/useful")
    public String main(){
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String colorBackground(Model model){
        model.addAttribute("color", u.randomColor());
        return "empty";
    }

    @RequestMapping("/useful/email")
    public String emailValidation(Model model, @RequestParam String s){
        model.addAttribute("isvalid", u.isValidEmail(s));
        model.addAttribute("email", s);
        return "email";
    }
}
