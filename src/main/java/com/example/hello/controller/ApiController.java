package com.example.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
