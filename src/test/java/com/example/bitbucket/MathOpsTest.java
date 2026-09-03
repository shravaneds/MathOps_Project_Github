package com.example.bitbucket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MathOpsTest {

    private final MathOps mathOps = new MathOps();

    @Test
    public void testMultiply() {
        assertEquals(12, mathOps.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, mathOps.divide(5, 2));
    }

    @Test
    public void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> mathOps.divide(5, 0));
    }

    @Test
    public void testIsPrimeTrue() {
        assertTrue(mathOps.isPrime(7));
    }

    @Test
    public void testIsPrimeFalse() {
        assertFalse(mathOps.isPrime(8));
    }
}
