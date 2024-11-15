package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping("/greet")
    String hello(@RequestParam(required = false, defaultValue = "Fatma") String name){
        return "Hello, " + name + "!";
    }

    @PostMapping("/farewell")
    String farewell(@RequestBody Person person){
        return "Goodbye, " + person.getFirstName() + person.getLastName() +"!";
    }

}
