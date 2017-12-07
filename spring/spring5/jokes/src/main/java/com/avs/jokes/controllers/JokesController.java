package com.avs.jokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("chucknorris ", "this is a joke");
        return "chucknorris";
    }
}
