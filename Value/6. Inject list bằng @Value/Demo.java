package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueDemoController {
    @Value("${app.roles}")
    private List<String> roles;

    @GetMapping("/value-demo")
    public String getValueDemo() {
        System.out.println("Roles: " + roles);
        
        return String.format(
            "Roles: %s",
            roles
        );
    }
}
