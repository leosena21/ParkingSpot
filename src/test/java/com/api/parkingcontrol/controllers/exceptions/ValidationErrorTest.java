package com.api.parkingcontrol.controllers.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class ValidationErrorTest {
    @Test
    void testConstructor() {
        ValidationError actualValidationError = new ValidationError(10L, 1, "An error occurred",
                "Not all who wander are lost", "Path");

        assertEquals("An error occurred", actualValidationError.getError());
        assertEquals(10L, actualValidationError.getTimestamp().longValue());
        assertEquals(1, actualValidationError.getStatus().intValue());
        assertEquals("Path", actualValidationError.getPath());
        assertEquals("Not all who wander are lost", actualValidationError.getMessage());
        assertTrue(actualValidationError.getErros().isEmpty());
    }

    @Test
    void testAddError() {
        ValidationError validationError = new ValidationError(10L, 1, "An error occurred", "Not all who wander are lost",
                "Path");
        validationError.addError("Field Name", "Messagem");
        List<FieldMessage> erros = validationError.getErros();
        assertEquals(1, erros.size());
        FieldMessage getResult = erros.get(0);
        assertEquals("Field Name", getResult.getFieldName());
        assertEquals("Messagem", getResult.getMessage());
    }
}

