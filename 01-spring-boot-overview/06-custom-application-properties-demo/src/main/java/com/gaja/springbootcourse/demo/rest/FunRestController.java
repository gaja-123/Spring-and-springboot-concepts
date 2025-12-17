package com.gaja.springbootcourse.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${team.name}")
    private String teamName;

    @Value("${player.name}")
    private String playerName;


    // Expose "/" endpoint
    @GetMapping("/")
    public String sayHello() { return "Hello World!"; }

    // Expose "/workout" endpoint
    @GetMapping("/workout")
    public String getDailyWorkout() { return "run 5km"; }

    // Expose "/fortune" endpoint
    @GetMapping("/fortune")
    public String getDailyFortune() { return "today is lucky"; }

    // Expose "/teaminfo" endpoint
    @GetMapping("/teaminfo")
    public String getTeamInfo() { return "team name:"+teamName+"player name"+playerName; }


}

