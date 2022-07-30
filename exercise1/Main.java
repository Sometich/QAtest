package com.example.testpostman;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/name/{id}")
    public String getName(@PathVariable("id") String id) {
        if (id.equals("2")) {
            return "Correct";
        }
        return "error";
    }
}
