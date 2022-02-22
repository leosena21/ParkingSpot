package com.api.parkingcontrol.controllers.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StandardErrorTest {
    @Test
    void testConstructor() {
        StandardError actualStandardError = new StandardError();
        actualStandardError.setError("An error occurred");
        actualStandardError.setMessage("Not all who wander are lost");
        actualStandardError.setPath("Path");
        actualStandardError.setStatus(1);
        actualStandardError.setTimestamp(10L);
        assertEquals("An error occurred", actualStandardError.getError());
        assertEquals("Not all who wander are lost", actualStandardError.getMessage());
        assertEquals("Path", actualStandardError.getPath());
        assertEquals(1, actualStandardError.getStatus().intValue());
        assertEquals(10L, actualStandardError.getTimestamp().longValue());
    }

    @Test
    void testConstructor2() {
        StandardError actualStandardError = new StandardError(10L, 1, "An error occurred", "Not all who wander are lost",
                "Path");
        actualStandardError.setError("An error occurred");
        actualStandardError.setMessage("Not all who wander are lost");
        actualStandardError.setPath("Path");
        actualStandardError.setStatus(1);
        actualStandardError.setTimestamp(10L);
        assertEquals("An error occurred", actualStandardError.getError());
        assertEquals("Not all who wander are lost", actualStandardError.getMessage());
        assertEquals("Path", actualStandardError.getPath());
        assertEquals(1, actualStandardError.getStatus().intValue());
        assertEquals(10L, actualStandardError.getTimestamp().longValue());
    }
}

