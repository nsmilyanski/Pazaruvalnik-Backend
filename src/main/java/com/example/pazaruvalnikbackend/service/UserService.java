package com.example.pazaruvalnikbackend.service;

import com.example.pazaruvalnikbackend.model.dto.UserDto;
import com.example.pazaruvalnikbackend.model.entities.User;

public interface UserService {
    User registerNewUserAccount(UserDto userDto);
}
