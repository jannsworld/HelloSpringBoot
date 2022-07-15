package com.example.hello.controller;


import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController // REST API 처리하는 Controller
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "hello SpringBoot!";
    }

    @GetMapping("/home")
    public String home() {
        return "This is home!";
    }

}

