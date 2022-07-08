package com.example.hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("===");
    }

    // Text JSON -> Object
    // Object -> Text JSON

    // controller rea json(text) -> object
    // response object -> json(text)

    var objectMapper = new ObjectMapper();

    //object -> text
    var user = new User("jann", 30);

    var text : String = objectMapper.writeValueAsString(user);

    // text -> object
    var objectUser : User = objectMapper.readValue(text, User.class);




}
