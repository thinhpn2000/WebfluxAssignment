package com.assignment.security.auth;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CustomUserDetailsTest {

    CustomUserDetails customUserDetails = new CustomUserDetails();

    @Test
    void setUsername() {
        customUserDetails.setUsername("username_test");
        assertEquals("username_test",customUserDetails.getUsername());
    }

    @Test
    void isAccountNonExpired() {
        assertEquals(false, customUserDetails.isAccountNonExpired());
    }

    @Test
    void isAccountNonLocked() {
        assertEquals(false, customUserDetails.isAccountNonLocked());
    }

    @Test
    void isCredentialsNonExpired() {
        assertEquals(false, customUserDetails.isCredentialsNonExpired());
    }

    @Test
    void isEnabled() {
        customUserDetails.setEnabled(false);
        assertEquals(false, customUserDetails.isEnabled());
    }

    @Test
    void setPassword() {
        customUserDetails.setPassword("password_test");
        assertEquals("password_test", customUserDetails.getPassword());
    }

    @Test
    void setEnabled() {
        customUserDetails.setEnabled(false);
        assertEquals(false, customUserDetails.getEnabled());
    }

    @Test
    void setRoles() {
        List<String> rolesTest = mock(List.class);
        customUserDetails.setRoles(rolesTest);
        assertEquals(rolesTest,customUserDetails.getRoles());
    }
}