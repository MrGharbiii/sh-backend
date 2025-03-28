package com.example.backend.model;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}