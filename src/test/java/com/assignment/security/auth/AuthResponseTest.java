package com.assignment.security.auth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthResponseTest {

    private final AuthResponse authResponse = new AuthResponse("token_test");
    private final AuthResponse authResponseWithNoArg = new AuthResponse();

    @Test
    void getToken() {
        assertEquals("token_test", authResponse.getToken());
    }
}