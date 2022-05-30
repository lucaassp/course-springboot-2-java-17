package com.ayty.course.resources;

import java.util.List;
import com.ayty.course.entities.Product;
import com.ayty.course.services.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Web resource that is implemented by a Rest controller
@RequestMapping(value = "/products") // Resource name
public class ProductResource {
    
    @Autowired
    private ProductService service;

    // Method to access users
    @GetMapping // Responds to a Get resource from http 
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
