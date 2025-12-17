package com.gaja.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// component for mark it as bean and available for DI
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "fast blow for 10 min daily !!!!##";
    }
}
