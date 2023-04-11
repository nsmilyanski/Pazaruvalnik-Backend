package com.example.pazaruvalnikbackend.service;

import com.example.pazaruvalnikbackend.exceptions.UserAlreadyExistException;
import com.example.pazaruvalnikbackend.model.dto.UserDto;
import com.example.pazaruvalnikbackend.model.entities.User;
import com.example.pazaruvalnikbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerNewUserAccount(UserDto userDto) {
        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: "
                    + userDto.getEmail());
        }
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setEmail(userDto.getPassword());
        return userRepository.save(user);
    }
    private boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
