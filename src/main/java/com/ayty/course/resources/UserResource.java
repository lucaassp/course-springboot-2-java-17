package com.ayty.course.resources;

import java.util.List;

import com.ayty.course.entities.User;
import com.ayty.course.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Web resource that is implemented by a Rest controller
@RequestMapping(value = "/users") // Resource name
public class UserResource {
    
    @Autowired
    private UserService service;

    // Method to access users
    @GetMapping // Responds to a Get resource from http 
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
