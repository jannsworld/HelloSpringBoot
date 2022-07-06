package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id){
        System.out.println(id);
        return requestDto;
    }

}
