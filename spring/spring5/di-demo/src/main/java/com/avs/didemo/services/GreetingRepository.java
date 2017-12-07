package com.avs.didemo.services;

import org.springframework.stereotype.Repository;


public interface GreetingRepository {
    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}

