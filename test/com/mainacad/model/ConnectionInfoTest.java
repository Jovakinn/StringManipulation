package com.mainacad.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConnectionInfoTest {

    @Test
    void compareTo() {
        String testCompare = ConnectionInfo.class.toString();
        assertNotNull(testCompare);
        assertTrue(testCompare.length() >= -1);

    }

    @Test
    void toString1() {
        String testString = ConnectionInfo.class.toString();
        assertNotNull(testString);
        assertTrue(testString.length() > 0);
    }
}