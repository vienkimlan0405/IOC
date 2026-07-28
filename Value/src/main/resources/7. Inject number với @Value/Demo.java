package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueDemoController {
    @Value("${app.port}")
    private int appPort;

    @GetMapping("/value-demo")
    public String getValueDemo() {
        System.out.println("App Port: " + appPort);
        
        return String.format(
            "Name: %s | Description: %s | Roles: %s | Port: %d",
            appPort
        );
    }
}
