package com.example.pazaruvalnikbackend.controller;

import com.example.pazaruvalnikbackend.exceptions.UserAlreadyExistException;
import com.example.pazaruvalnikbackend.model.dto.UserDto;
import com.example.pazaruvalnikbackend.model.entities.User;
import com.example.pazaruvalnikbackend.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;



@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService, HttpServletRequest request) {
        this.userService = userService;
    }

    public UserDto registerUserAccount(@Validated UserDto userDto) {
        try {
            User registered = userService.registerNewUserAccount(userDto);
        }catch (UserAlreadyExistException uaeEx) {

        }
        return null;
    }




}
