package com.example.pazaruvalnikbackend;

import com.example.pazaruvalnikbackend.auth.AuthenticationService;
import com.example.pazaruvalnikbackend.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.pazaruvalnikbackend.model.enums.Role.ADMIN;
import static com.example.pazaruvalnikbackend.model.enums.Role.MANAGER;

@SpringBootApplication
public class PazaruvalnikBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(PazaruvalnikBackEndApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstName("Admin")
                    .lastName("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()
                    .firstName("Admin")
                    .lastName("Admin")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getAccessToken());

        };
    }
}
