package com.avs.didemo.controllers;

import com.avs.didemo.services.GreetingService;
import com.avs.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
