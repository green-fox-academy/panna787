package com.greenfoxacademy.practice.controllers;

import com.greenfoxacademy.practice.models.Gender;
import com.greenfoxacademy.practice.models.Inhabitant;
import com.greenfoxacademy.practice.models.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InhabitantController {

    private InhabitantList inhabitantList;

    @Autowired
    public InhabitantController(InhabitantList inhabitantList){
        this.inhabitantList = inhabitantList;
    }

    @RequestMapping(path="/", method = RequestMethod.GET)
    public String getMainPage(){
        return "index";
    }

    @RequestMapping(path="/inhabitants", method = RequestMethod.GET)
    public String showInhabitants(Model model){
        if(inhabitant != null){
        model.addAttribute("inhabitants", inhabitantList.getInhabitants());
        return "inhabitant_table";
    }

    @RequestMapping(path="/inhabitants/{id}", method = RequestMethod.GET)
    public String getInhabitantById(@PathVariable int id, Model model){
        Inhabitant inhabitant = inhabitantList.getInhabitantById(id);

            model.addAttribute("inhabitant_by_id", inhabitant);
        } else {
            model.addAttribute("error", "No inhabitant found by this id");
        }

        return "inhabitant_info";
    }

    @GetMapping(path = "/inhabitant/add")
    public String getInhabitantForm(@ModelAttribute(name="inhabitant") Inhabitant inhabitant, Model model){
        model.addAttribute("inhabitant", inhabitant);
        model.addAttribute("genders", Gender.values());
        return "add";
    }


    @PostMapping(path = "inhabitant/add")
    public String addInhabitantToList(Inhabitant inhabitant) {
        inhabitantList.addInhabitant(inhabitant);
        return "redirect:/inhabitants";
    }
}
