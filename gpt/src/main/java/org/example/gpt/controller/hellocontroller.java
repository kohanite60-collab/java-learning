package org.example.gpt.controller;

import org.example.gpt.entity.user;
import org.example.gpt.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hellocontroller {

    @Autowired
    private userservice userservice;

    @GetMapping("/users")
    public List<user> list() {
        return userservice.list();
    }
    @GetMapping("/user")
    public user get(String name) {
        return userservice.get(name);
    }
    @PostMapping("/user")
    public int add(@RequestBody user user) {
        return userservice.add(user) ;
    }
}
