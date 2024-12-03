package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testAddMethod() {
        assertEquals(0, StringCalculator.add(""));
        assertEquals(1, StringCalculator.add("1"));
        assertEquals(3, StringCalculator.add("1,2"));
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }
}
