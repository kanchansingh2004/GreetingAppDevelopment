package com.springintro.messagingapp.service;

import com.springintro.messagingapp.repository.UserRepo;
import com.springintro.messagingapp.userentity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //UC-04 save the greeting message in the repository
    //injects UserRepository into this service
    @Autowired
    private UserRepo repository;
    //saves a new greeting message to the database
    public UserEntity saveMessage(String message) {
        return repository.save(new UserEntity(message));
    }
    //uC-06 list all the greeting messages
    //retrieves all greeting messages from the database
    public List<UserEntity> getAllMessages() {
        return repository.findAll();
    }

    //UC-05 find a Greeting Message by Id in the Repository
    public Optional<UserEntity> getMessageById(Long id) {
        return repository.findById(id);
    }
}
