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

    private FoxService service;
    private FoxController controller;

    @Autowired
    public MainController(FoxService service, FoxController controller){
        this.service = service;
        this.controller = controller;
    }

    @RequestMapping("/")
    public String main(Model model,@RequestParam(name="name") String name){
        if(service.findFoxByName(name) != null){
            model.addAttribute("fox", service.findFoxByName(name));
            controller.setCurrentFox(service.findFoxByName(name));
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

}
