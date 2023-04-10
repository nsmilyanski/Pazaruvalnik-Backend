package com.example.pazaruvalnikbackend.controller;

import com.example.pazaruvalnikbackend.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }




}
