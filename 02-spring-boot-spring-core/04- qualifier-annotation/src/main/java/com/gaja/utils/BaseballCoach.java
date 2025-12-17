package com.gaja.utils;

import org.springframework.stereotype.Component;

// use @componenent to mark it as bean and make it available for DI
@Component
public class BaseballCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "practse baseball for 30 min";
    }
}
