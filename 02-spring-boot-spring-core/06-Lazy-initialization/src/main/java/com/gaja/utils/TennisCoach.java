package com.gaja.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    public TennisCoach(){
        System.out.println("COnstructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practise tennis for 45 mins";
    }


}
