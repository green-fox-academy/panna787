package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private static AtomicLong id = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("count", id.getAndIncrement());
        return "greeting";
    }

    @RequestMapping(value="/web/greetingworld")
    public String greetingWorld(Model model){
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


        String hello = hellos[(int)(Math.random()*(hellos.length-1))];
        int fontSize = (int)(Math.random()*40)+14;
        int color1 = (int)(Math.random()*255);
        int color2 = (int)(Math.random()*255);
        int color3 = (int)(Math.random()*255);

        model.addAttribute("hello", hello);
        model.addAttribute("fontsize", fontSize);
        model.addAttribute("color1", color1);
        model.addAttribute("color2", color2);
        model.addAttribute("color3", color3);

        return "greeting2";
    }
}
