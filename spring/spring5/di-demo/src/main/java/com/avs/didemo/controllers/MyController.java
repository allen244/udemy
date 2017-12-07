package com.avs.didemo.controllers;

import com.avs.didemo.services.GreetingRepository;
import com.avs.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;
    private GreetingRepository greetingRepository;

    public MyController(GreetingService greetingService, GreetingRepository greetingRepository) {
        this.greetingService = greetingService;
        this.greetingRepository = greetingRepository;
    }

    public String hello() {
        System.out.println("Hello");
        return greetingService.sayGreeting();
    }
}
