package com.example.hello.controller;


import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // REST API 처리하는 Controller
@RequestMapping("/api")
public class RequestApiController {


    // TEXT 타입
    @GetMapping("/text")
    public String text(@RequestParam String account) {

        retrun account;
    }

    // JSON
    // req -> object mapper -> object -> method -> object mapper -> json -> response
    @PostMapping("/json")
    public User join(@RequestBody User user) {
        return user;
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }
}
