package com.avs.controllers;

import com.avs.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private UserRepository userRepository;

    public MainController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "users";
    }

/*    @RequestMapping("/users")
    public String getUser(@RequestParam(value = "user", required = false, defaultValue = "World") String user, Model model) {
        model.addAttribute("user", user);
        return "users";
    }*/



}
