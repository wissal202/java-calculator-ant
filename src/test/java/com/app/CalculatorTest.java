package com.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(6, c.add(4, 2));
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(2, c.subtract(4, 2));
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(8, c.multiply(4, 2));
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2, c.divide(4, 2));
    }
}