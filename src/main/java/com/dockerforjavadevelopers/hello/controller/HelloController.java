package com.dockerforjavadevelopers.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Hello Worlllllddddd\n";
    }

    @GetMapping("/ddddd")
    public String hello() {
        return "Hello Worlddddddddddddddddd\n";
    }
}
