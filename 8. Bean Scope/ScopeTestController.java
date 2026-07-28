package com.example.demo.controller;

import com.example.demo.bean.PrototypeBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeTestController {

    // Dùng ObjectFactory để yêu cầu tạo instance mới mỗi lần call
    @Autowired
    private ObjectFactory<PrototypeBean> prototypeBeanFactory;

    @GetMapping("/test-scope")
    public String testScope() {
        PrototypeBean b1 = prototypeBeanFactory.getObject();
        PrototypeBean b2 = prototypeBeanFactory.getObject();

        boolean isDifferent = (b1 != b2);
        return "b1 HashCode: " + b1.hashCode() + 
               " <br> b2 HashCode: " + b2.hashCode() + 
               " <br> Khác instance? " + isDifferent;
    }
}
