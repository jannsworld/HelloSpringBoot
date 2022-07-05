package com.example.hello.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/put")
    public void put(@RequestBody PostController requestDto){
        System.out.println(requestDto);
    }

}
