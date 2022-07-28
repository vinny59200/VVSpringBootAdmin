package com.vv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//https://www.javadevjournal.com/spring-boot/spring-boot-admin/

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greet() {
        return "Hi!! there...";
    }
}
