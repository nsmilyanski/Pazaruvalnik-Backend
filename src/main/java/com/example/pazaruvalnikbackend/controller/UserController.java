package com.example.pazaruvalnikbackend.controller;

import com.example.pazaruvalnikbackend.exceptions.UserAlreadyExistException;
import com.example.pazaruvalnikbackend.model.dto.UserDto;
import com.example.pazaruvalnikbackend.model.entities.User;
import com.example.pazaruvalnikbackend.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/users")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService, HttpServletRequest request) {
        this.userService = userService;
    }


    @GetMapping
    public String test() {
        return "Success";
    }

    @GetMapping
    public String secureEndPoint() {
        return "Just a test";
    }


}
