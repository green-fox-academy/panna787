package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping("/")
    public String main(Model model){
        model.addAttribute("posts", postService.getTop10Posts());
        return "index";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    public String addNewPostForm(Model model){
        model.addAttribute("post", new Post());
        return "newpost";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String addNewPost(@ModelAttribute(name="post") Post post){
        postService.addPost(post);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.GET)
    public String upvotePost(@PathVariable("id") Long id){
        postService.upvotePost(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.GET)
    public String downvotePost(@PathVariable("id") Long id){
        postService.downvotePost(id);
        return "redirect:/";
    }
}
