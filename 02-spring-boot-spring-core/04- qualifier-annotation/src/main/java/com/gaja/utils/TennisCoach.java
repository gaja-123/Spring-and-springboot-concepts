package com.gaja.utils;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practise tennis for 45 mins";
    }


}
