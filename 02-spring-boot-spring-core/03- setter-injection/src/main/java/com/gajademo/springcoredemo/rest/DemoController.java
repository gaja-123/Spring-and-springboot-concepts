package com.gajademo.springcoredemo.rest;

import com.gaja.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    private Coach c1;

//    // autowriing means it inject the dendencies
//    @Autowired
//    public DemoController(Coach coach){
//        this.c1=coach;
//    }

    // setter injection ( name as setter method usual)
    @Autowired
    public void setCoach(Coach theCoach){
        this.c1=theCoach;
    }
    // setter injection ( name as setter method of any name)

//    @Autowired
//    public void doSomeStuff(Coach theCoach){
//        this.c1=theCoach;
//    }

    @GetMapping("/dailywork")
    public String getDailyWorkout(){
        return c1.getDailyWorkout();
    }
}
