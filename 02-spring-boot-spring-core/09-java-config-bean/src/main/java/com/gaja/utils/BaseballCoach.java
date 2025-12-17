package com.gaja.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// use @componenent to mark it as bean and make it available for DI
@Component
public class BaseballCoach implements Coach{


    public BaseballCoach(){
        System.out.println("COnstructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practse baseball for 30 min";
    }
}
