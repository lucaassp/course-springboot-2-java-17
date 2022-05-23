package com.ayty.course.config;

import java.util.Arrays;

import com.ayty.course.entities.User;
import com.ayty.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration // Sets the class as the configuration class
@Profile("test") // Defines as "test" the profile linked to the application-properties file
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");   

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
