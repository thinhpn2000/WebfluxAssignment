package com.assignment.entity;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User userWithNoArgConstructor = new User();

    User user = new User("id_test", "Test Name", "test@gmail.com", "Pswd1@", "ROLE_TEST");

    @Test
    void getId() {
        assertEquals("id_test", user.getId());
    }

    @Test
    void getPswd() {
        assertEquals("Pswd1@", user.getPswd());
    }

    @Test
    void getEmail() {
        assertEquals("test@gmail.com", user.getEmail());
    }

    @Test
    void getRoles() {
        assertEquals("ROLE_TEST", user.getRoles());
    }
}