package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            var email = new Email("acccc");
        });
    }

    @Test
    public void testValidEmail() {
        var email = new Email("hello@gmail.com");
        assertEquals("hello@gmail.com", email.getAddress());
        }

    @Test
    public void testEqEmail() {
        var email = new Email("hello@gmail.com");
        var email2 = new Email("hello@gmail.com");
        assertEquals(email, email2);
    }
}