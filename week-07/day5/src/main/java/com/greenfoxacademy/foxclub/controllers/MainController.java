package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.User;
import com.greenfoxacademy.foxclub.services.FoxService;
import com.greenfoxacademy.foxclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    private FoxService foxService;
    private UserService userService;

    @Autowired
    public MainController(FoxService service, UserService userService){
        this.foxService = service;
        this.userService = userService;
    }

    @RequestMapping("/")
    public String main(Model model,@RequestParam(name="name") String name){
        if(foxService.findFoxByName(name) != null){
            model.addAttribute("fox", foxService.findFoxByName(name));
            foxService.setCurrentFox(foxService.findFoxByName(name));
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

    @GetMapping("/register")
    public String showRegisterPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String addNewUser(@ModelAttribute("user") User user){
        userService.addNewUser(user);
        return "redirect:/?name=" + user.getFox().getName();
    }

}
