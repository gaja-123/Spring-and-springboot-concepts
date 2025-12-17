package com.gaja.springbootcourse.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" endpoint
    @GetMapping("/")
    public String sayHello() { return "Hello World!"; }

    // Expose "/workout" endpoint
    @GetMapping("/workout")
    public String getDailyWorkout() { return "run 5km"; }

    // Expose "/fortune" endpoint
    @GetMapping("/fortune")
    public String getDailyFortune() { return "today is lucky"; }


}

