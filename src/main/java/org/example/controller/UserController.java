package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.services.impl.UserService;
import org.springframework.web.bind.annotation.*;
//--------
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {


    final UserService userService;


    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "User registered successfully!";
    }


    @PostMapping("/login")
    public String login(@RequestParam(name = "name") String name, @RequestParam(name = "password") String password) {
        if (userService.validateLogin(name, password)) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }


    @GetMapping("/details")
    public User getUserDetails(@RequestParam String name) {
        return userService.getUserDetails(name);
    }
}