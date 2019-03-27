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
    public MainController(FoxService foxService, UserService userService){
        this.foxService = foxService;
        this.userService = userService;
    }

    @RequestMapping("/")
    public String main(Model model, @RequestParam(name="id") long id){
        if(foxService.findFoxById(id) != null){
            model.addAttribute("fox", foxService.findFoxById(id));
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
    public String login(@ModelAttribute(name="fox") Fox fox, @RequestParam long id){

        return "redirect:/?id=" + id;
    }

    @GetMapping("/register")
    public String showRegisterPage(@RequestParam(name="success", required = false) boolean success,  Model model){
        model.addAttribute("user", new User());
        if(userService.getCurrentUser() != null) {
            model.addAttribute("userExists", !success);
            model.addAttribute("regError", userService.getCurrentUser().showRegistrationError());
        }
        return "register";
    }

    @PostMapping("/register")
    public String addNewUser(@ModelAttribute("user") User user){
        if(userService.isRegistrationSuccessful(user)){
            userService.addNewUser(user);
            foxService.setCurrentFox(user.getFox());
            return "redirect:/?id=" + user.getFox().getId();
        } else {
            return "redirect:/register?success=" + !userService.checkIfUserExist(user);
        }
    }

}
