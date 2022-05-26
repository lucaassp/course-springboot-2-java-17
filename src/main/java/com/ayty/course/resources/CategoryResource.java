package com.ayty.course.resources;

import java.util.List;
import com.ayty.course.entities.Category;
import com.ayty.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Web resource that is implemented by a Rest controller
@RequestMapping(value = "/categories") // Resource name
public class CategoryResource {
    
    @Autowired
    private CategoryService service;

    // Method to access users
    @GetMapping // Responds to a Get resource from http 
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
