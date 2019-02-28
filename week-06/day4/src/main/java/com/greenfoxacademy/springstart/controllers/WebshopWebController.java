package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebshopWebController {

    @GetMapping(value="/webshop")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }

}
