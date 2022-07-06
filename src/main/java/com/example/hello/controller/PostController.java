package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData) {

        requestData.forEach((key, value) -> {
            System.out.println("key :" + key);
            System.out.println("value :" + key);
        });


    }
}
