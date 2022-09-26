package com.assignment.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsTest {
    News newsWithNoArg = new News();
    News newsWithAllArg = new News("Test Title", "Test Description");

    @Test
    void getTitle() {
        assertEquals("Test Title", newsWithAllArg.getTitle());
    }

    @Test
    void getDescription() {
        assertEquals("Test Description", newsWithAllArg.getDescription());
    }
}