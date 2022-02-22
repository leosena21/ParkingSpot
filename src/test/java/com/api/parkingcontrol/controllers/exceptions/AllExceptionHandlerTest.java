package com.api.parkingcontrol.controllers.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.api.parkingcontrol.services.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

class AllExceptionHandlerTest {
    @Test
    void testObjectNotFound() {
        AllExceptionHandler allExceptionHandler = new AllExceptionHandler();
        ObjectNotFoundException e = new ObjectNotFoundException("Msg");
        ResponseEntity<StandardError> actualObjectNotFoundResult = allExceptionHandler.objectNotFound(e,
                new MockHttpServletRequest());
        assertTrue(actualObjectNotFoundResult.getHeaders().isEmpty());
        assertTrue(actualObjectNotFoundResult.hasBody());
        assertEquals(HttpStatus.NOT_FOUND, actualObjectNotFoundResult.getStatusCode());
        StandardError body = actualObjectNotFoundResult.getBody();
        assertEquals("Não encontrado", body.getError());
        assertEquals(404, body.getStatus().intValue());
        assertEquals("Objeto não encontrado Msg", body.getMessage());
        assertEquals("", body.getPath());
    }
}

