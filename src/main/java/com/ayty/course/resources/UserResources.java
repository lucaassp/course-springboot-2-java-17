package com.ayty.course.resources;

import com.ayty.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Web resource that is implemented by a Rest controller
@RequestMapping(value = "/users") // Resource name
public class UserResources {
    
    // Method to access users
    @GetMapping // Responds to a Get resource from http 
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Marie", "marie@gmail.com", "987536321", "587964123");
        return ResponseEntity.ok().body(u);
    }
}
