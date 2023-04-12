package com.example.pazaruvalnikbackend.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class JwtService {
    private static final String SECRET_KEY = "66546A576E5A7234753778214125442A472D4B6150645367566B587032733576";
    public String extractUsername(String token) {
        return null;
    }

    private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignInKey() {
        return null;
    }


}
