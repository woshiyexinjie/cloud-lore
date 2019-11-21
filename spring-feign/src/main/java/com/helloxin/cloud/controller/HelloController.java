package com.helloxin.cloud.controller;

import com.helloxin.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/consumer")
    public String hello() {
        return helloService.consumer();
    }
}
