package com.example.hello.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {

        System.out.println(userId);
        System.out.println(account);

        // delete의 경우, 리소스 삭제 200 Ok (값이 있어 삭제 되는 경우 & 값이 없는 경우에도 200)

    }
}
