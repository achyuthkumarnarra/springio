package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomecontroller {
    @GetMapping("/welcome")
    public String welcome(){
        return"welcome to springboot";
    }
}
