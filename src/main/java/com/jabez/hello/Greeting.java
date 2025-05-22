package com.jabez.hello;
import jakarta.validation.constraints.NotBlank;


public class Greeting {
    @NotBlank (message = "message cannot be blank")
    private String message;
    private String sender;


    public Greeting(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }


    public String getSender() {
        return sender;
    }

    

    
    
}
