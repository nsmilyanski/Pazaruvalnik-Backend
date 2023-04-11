package com.example.pazaruvalnikbackend.repository;

import com.example.pazaruvalnikbackend.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

}
