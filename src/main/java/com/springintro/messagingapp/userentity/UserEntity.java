package com.springintro.messagingapp.userentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//Create user entity as entity (Marks a class as a table in Database)
@Entity
public class UserEntity {
    //UC-04 the Greeting App to save the Greeting Message in the Repository
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    public UserEntity(){};

    //Constructor
    public UserEntity(String message){
        this.message = message;
    }

    //Getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
