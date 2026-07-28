package com.example.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
// Chỉ khởi tạo Bean này khi app.properties có: feature=true
@ConditionalOnProperty(name = "feature", havingValue = "true")
public class FeatureService {
    public String execute() {
        return "Feature Service is enabled!";
    }
}
