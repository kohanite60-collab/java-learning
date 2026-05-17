package org.example.gpt.controller;

import org.example.gpt.common.Result;
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
    public Result<List<user>> list() {
        return Result.success(userservice.list());
    }
    @GetMapping("/user")
    public Result<user> get(String name) {

        return Result.success(userservice.get(name));
    }
    @PostMapping("/user")
    public Result add(@RequestBody user user) {

        userservice.add( user);
        return Result.success("添加成功") ;
    }
}
