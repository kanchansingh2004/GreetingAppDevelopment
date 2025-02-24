package com.springintro.messagingapp.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    //UC-02 Simple greeting
    public String getGreeting(){
        return "Hello World.";
    }

    //UC-03 Greeting with name in different scenario
    public String greetingWithName(String firstName, String lastName){
        if(firstName != null && lastName != null){
            return "Hello " + firstName +" "+lastName;
        }
        else if(firstName == null && lastName == null) {
            return "Hello World!";
        }

        else if(lastName == null){
            return "Hello " + firstName;
        }
        else{
            return "Hello " + lastName;
        }
    }
}
