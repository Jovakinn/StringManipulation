package com.mainacad.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizerTest {

    @Test
    void getRandomNumber() {
        Integer testNuber = Randomizer.getRandomNumber(50 ,100);
        assertNotNull(testNuber);
        assertTrue(testNuber >= 50 && testNuber <= 100);
    }

    @Test
    void getRandomString() {
        String testString = Randomizer.getRandomString(20);
        assertNotNull(testString);
        assertEquals(20, testString.length());
    }
}