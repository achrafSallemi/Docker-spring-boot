package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Hello Worllllld\n";
    }

    @GetMapping("/ddddd")
    public String hello() {
        return "Hello Worlddddddddddddddddd\n";
    }
}
