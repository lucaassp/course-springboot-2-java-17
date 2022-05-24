package com.ayty.course.resources;

import java.util.List;

import com.ayty.course.entities.Order;
import com.ayty.course.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Web resource that is implemented by a Rest controller
@RequestMapping(value = "/orders") // Resource name
public class OrderResource {
    
    @Autowired
    private OrderService service;

    // Method to access users
    @GetMapping // Responds to a Get resource from http 
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
