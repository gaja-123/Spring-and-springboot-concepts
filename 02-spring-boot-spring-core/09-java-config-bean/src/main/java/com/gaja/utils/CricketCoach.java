package com.gaja.utils;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// component for mark it as bean and available for DI
@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("COnstructor"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "fast blow for 10 min daily !!!!##";
    }

    // code for init method of the bean
    @PostConstruct
    public void doStartupStuff(){
        System.out.println("done with startupstuff"+getClass().getSimpleName());
    }

    // code for destroy method of the bean
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println("done with cleanupstuff"+getClass().getSimpleName());
    }
}
