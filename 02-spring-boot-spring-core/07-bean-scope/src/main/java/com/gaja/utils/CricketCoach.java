package com.gaja.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// component for mark it as bean and available for DI
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("COnstructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "fast blow for 10 min daily !!!!##";
    }
}
