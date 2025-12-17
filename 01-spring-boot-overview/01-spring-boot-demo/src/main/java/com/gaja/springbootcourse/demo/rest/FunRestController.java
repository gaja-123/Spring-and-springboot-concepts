package com.gaja.springbootcourse.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" endpoint
    @GetMapping("/")
    public String sayHello() { return "Hello World!"; }
}
