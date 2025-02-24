package com.springintro.messagingapp.controller;

import com.springintro.messagingapp.service.*;
import com.springintro.messagingapp.userdetails.UserDetails;
import com.springintro.messagingapp.userentity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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

    //UC-02 use Services Layer to get Simple Greeting message
    //automatically injects the UserService bean into this Controller
    @Autowired
    private UserService userService;

    // Constructor-based Dependency Injection
    public GreetingController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getGreeting")
    //calls the getGreeting method from UserService to get the greeting message
    public String getMessage(){
        return userService.getGreeting();
    }

    //UC-03 Display Greeting message with given input
    @PostMapping("/postGreet")
    public String getGreetingWithName(@RequestBody UserDetails request){
        return userService.greetingWithName(request.getFirstName(),request.getLastName());
    }

    //UC-04 Ability for the Greeting App to save the Greeting Message in the Repository
    //saves a new greeting message in the database
    @PostMapping
    public UserEntity saveGreeting(@RequestBody String message) {
        return userService.saveMessage(message);
    }
    //retrieves all stored greeting messages
    @GetMapping
    public List<UserEntity> getAllGreetings() {
        return userService.getAllMessages();
    }
}
