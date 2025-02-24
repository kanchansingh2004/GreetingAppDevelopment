package com.springintro.messagingapp.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    //UC-02 Simple greeting
    public static String getGreeting(){
        return "Hello World.";
    }
}
