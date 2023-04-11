package com.example.pazaruvalnikbackend.model.dto;


import com.example.pazaruvalnikbackend.annotations.PasswordMatches;
import com.example.pazaruvalnikbackend.annotations.ValidEmail;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@PasswordMatches
public class UserDto {

    @ValidEmail
    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    private String password;
    private String matchingPassword;

}
