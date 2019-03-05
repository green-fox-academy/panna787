package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    BankAccountList accounts = new BankAccountList();

    @RequestMapping("/show")
    public String showAccount(Model model){
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));

        return "show";
    }

    @RequestMapping("/example")
    public String example(Model model){
        model.addAttribute("formattext", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

        return "example";
    }

    @RequestMapping("/accountlist")
    public String showAccountList(Model model){

        model.addAttribute("accountlist", accounts.getAccounts());

        return "list";
    }
}
