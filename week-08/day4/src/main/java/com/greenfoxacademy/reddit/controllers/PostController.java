package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping("/")
    public  String main(Model model){

        return "index";
    }
}
