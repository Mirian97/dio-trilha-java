package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = userRepository.findByUsername("Monte");
        System.out.println(user);
        // for(User u: users){
        //     System.out.println(u);
        // }
    }

    public void inserUser(){
        User user = new User();
        user.setName("Mirian Montevilla");
        user.setUsername("Monte");
        user.setPassword("DIO1234");
        
        userRepository.save(user);

        for (User u : userRepository.findAll()) {
            System.out.println(u);
        }
    }
} 