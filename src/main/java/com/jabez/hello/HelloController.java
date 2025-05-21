package com.jabez.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/greet")
    public String greetUser(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello + " + name;

    }
    
}
