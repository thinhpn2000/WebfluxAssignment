package com.assignment.security.auth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthRequestTest {

    private final AuthRequest authRequest = new AuthRequest("username_test","password_test");
    private final AuthRequest authRequestWithNoArg = new AuthRequest();

    @Test
    void getUsername() {
        assertEquals("username_test", authRequest.getUsername());
    }

    @Test
    void getPassword() {
        assertEquals("password_test", authRequest.getPassword());
    }
}