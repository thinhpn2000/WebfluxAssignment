package com.assignment.security.auth;

public class AuthResponse {
    private String token;

    public AuthResponse(){};

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
