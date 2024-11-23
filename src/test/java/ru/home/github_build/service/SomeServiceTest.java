package ru.home.github_build.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private final SomeService someService = new SomeService();

    @Test
    public void shouldCorrectCalculateSum() {
        assertEquals(2, someService.sum(1, 1));
    }
}