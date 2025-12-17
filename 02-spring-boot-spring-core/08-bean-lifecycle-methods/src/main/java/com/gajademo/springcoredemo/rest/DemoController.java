package com.gajademo.springcoredemo.rest;

import com.gaja.utils.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach c1;

// constructor injection
    //use the @Autowried to make spring find the matching bean and inject here
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){

        System.out.println("Constructor:"+getClass().getSimpleName());
        this.c1=theCoach;
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
    @GetMapping("/dailywork")
    public String getDailyWorkout(){
        return c1.getDailyWorkout();
    }


}
