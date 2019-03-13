package com.greenfox.error.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import com.greenfox.error.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/")
public class AppController {

    UserService service;

    @Autowired
    public AppController(UserService service){
        this.service = service;
    }

    @GetMapping("/app")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("yolo", service.getAll());
        return "index";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute(name="user") User user) {
        service.save(user);
        return "redirect:/app";
    }
}