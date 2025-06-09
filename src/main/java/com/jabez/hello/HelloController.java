package com.jabez.hello;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String sayHello() {
        return "Hello from Spring Boot on Render!";
    }
    
    @GetMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "Hello + " + name;

    }

    @GetMapping("/greet/{name}")
    public String greetByPath(@PathVariable String name) {
        return "Welcome "+ name + "!";
    }

    @GetMapping("/json")
    public Greeting getJson(){
        return new Greeting("Hello from Spring Boot", "Backend");
    }

    @PostMapping("/greeting")
    public Greeting recieveGreeting(@Valid @RequestBody Greeting input){
        return new Greeting("Recieved your message: " + input.getMessage(), input.getSender());
    }

    ///HI
}
