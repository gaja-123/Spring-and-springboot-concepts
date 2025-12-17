package com.gajademo.springcoredemo.rest;

import com.gaja.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach c1;

    // autowriing means it inject the dendencies
    // constructor injection
    @Autowired
    public DemoController(Coach coach){
        this.c1=coach;
    }



    @GetMapping("/dailywork")
    public String getDailyWorkout(){
        return c1.getDailyWorkout();
    }
}
