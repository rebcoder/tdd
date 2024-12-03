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
        assertEquals(6, StringCalculator.add("1\n2,3"));
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumbersInAddMethod() {
        try {
            StringCalculator.add("1,-2,3");
            fail("Exception expected");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negative numbers not allowed: [-2]", e.getMessage());
        }

        try {
            StringCalculator.add("1,-2,-3");
            fail("Exception expected");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negative numbers not allowed: [-2, -3]", e.getMessage());
        }
    }
}
