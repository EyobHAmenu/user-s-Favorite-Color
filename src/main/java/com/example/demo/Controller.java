package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;


@org.springframework.stereotype.Controller
public class Controller{

    @GetMapping("/form")
    public String form(Model model){
        int random;
        Random run = new Random();
        random = run.nextInt();
        model.addAttribute("random", random);
        model.addAttribute("answer", new Favorite());
        return "form";
    }
    @PostMapping("/form")
    public String display(@ModelAttribute Favorite favorite, Model model){
        model.addAttribute("answer", favorite);
        return "displayForm";
    }
}
