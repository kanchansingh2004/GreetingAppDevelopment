package com.springintro.messagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
//Provide Base Path
@RequestMapping("/request")
public class GreetingController {
    //UC-01 Using GreetingController return JSON for different HTTP Methods.
    // Use GET request method for greeting
    @GetMapping("/greet")
    public String callGreet(){
        return "{ \" Message \" : \"Hello Buddy, greeting method!\" }";
    }

    //Use PUT request method
    @PutMapping("/put")
    public String callPut(){
        return "{ \" Message \" : \"Hello Buddy, greeting using put request method!\" }";
    }

    //Use POST request method
    @PostMapping("/post")
    public String callPost(){
        return "{ \" Message \" : \"Hello Buddy, greeting using post request method!\" }";
    }

    //Use DELETE request method
    @DeleteMapping("/delete")
    public String callDelete(){
        return "{ \" Message \" : \"Hello Buddy, greeting using delete request method!\" }";
    }
}
