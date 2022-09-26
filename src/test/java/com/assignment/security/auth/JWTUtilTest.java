package com.assignment.security.auth;

import com.assignment.entity.User;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.context.annotation.Primary;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class JWTUtilTest {

    private JWTUtil jwtUtil;

    private User user;

    @BeforeEach
    public void setup() {
        jwtUtil = new JWTUtil();
        jwtUtil.secret = "this_is_a_secret_key_for_unit_testing";
        jwtUtil.expirationTime = "12345";
        jwtUtil.init();
        //user = new User("id_test", "Test Name", "test@gmail.com", "Pswd1@", "ROLE_TEST");
        user = mock(User.class);
    }
    @Test
    void init() {
    }

    @Test
    void getUsernameFromToken() {
        String token = jwtUtil.generateToken(user);
        String username = jwtUtil.getUsernameFromToken(token);
        assertEquals(user.fullname, username);
    }

    @Test
    void generateToken() {
        String token = jwtUtil.generateToken(user);
        assertTrue(!token.isEmpty());
    }

    @Test
    void validateToken() {
        String token = jwtUtil.generateToken(user);
        boolean isValidateToken = jwtUtil.validateToken(token);
        assertTrue(isValidateToken);
    }

}