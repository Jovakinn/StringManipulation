package com.mainacad.service;

import com.mainacad.model.ConnectionInfo;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionInfoServiceTest {

    @Test
    void generateConectionInfoQueue() {
        Queue<ConnectionInfo> testQueue = ConnectionInfoService.generateConectionInfoQueue(5);
        assertNotNull(testQueue);
        assertEquals(5, testQueue.size());
    }

    @Test
    void getConnectionsAsText() {
        Queue<ConnectionInfo> testAsText = new PriorityQueue<>();
        assertNotNull(testAsText);
        assertTrue(testAsText != ConnectionInfoService.generateConectionInfoQueue(5));
    }

    @Test
    void getConnectionsFromText() {
        Queue<ConnectionInfo> testFromText = new PriorityQueue<>();
        assertNotNull(testFromText);
    }

    @Test
    void filterConnectionsByTime() {
        Queue<ConnectionInfo> testTime = new PriorityQueue<>();
        assertNotNull(testTime);
    }
}