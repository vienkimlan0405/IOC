package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValueDemoController {
    @Value("${app.description:Default Description}")
    private String appDescription;

    @GetMapping("/value-demo")
    public String getValueDemo() {
        System.out.println("App Description: " + appDescription);
        
        return String.format(
            "Description: %s",
            appDescription
        );
    }
}
