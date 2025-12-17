package com.gajademo.springcoredemo.rest;

import com.gaja.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Lazy
public class DemoController {


    private Coach c1;

// constructor injection
    //use the @Autowried to make spring find the matching bean and inject here
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach){

        System.out.println("Constructor:"+getClass().getSimpleName());
        this.c1=theCoach;
    }

    @GetMapping("/dailywork")
    public String getDailyWorkout(){
        return c1.getDailyWorkout();
    }
}
