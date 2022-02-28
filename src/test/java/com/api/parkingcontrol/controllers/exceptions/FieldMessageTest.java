package com.api.parkingcontrol.controllers.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FieldMessageTest {
    @Test
    void testConstructor() {
        FieldMessage actualFieldMessage = new FieldMessage();
        actualFieldMessage.setFieldName("Field Name");
        actualFieldMessage.setMessage("Not all who wander are lost");
        assertEquals("Field Name", actualFieldMessage.getFieldName());
        assertEquals("Not all who wander are lost", actualFieldMessage.getMessage());
    }

    @Test
    void testConstructor2() {
        FieldMessage actualFieldMessage = new FieldMessage("Field Name", "Not all who wander are lost");
        actualFieldMessage.setFieldName("Field Name");
        actualFieldMessage.setMessage("Not all who wander are lost");
        assertEquals("Field Name", actualFieldMessage.getFieldName());
        assertEquals("Not all who wander are lost", actualFieldMessage.getMessage());
    }
}

