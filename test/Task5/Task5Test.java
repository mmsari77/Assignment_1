package Task5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task5Test {
    @Test
    public void testFindFibonacciWithZero() {
        assertEquals(0, Task5.findFibonacci(0), "F(0) should be 0");
    }

    @Test
    public void testFindFibonacciWithOne() {
        assertEquals(1, Task5.findFibonacci(1), "F(1) should be 1");
    }

    @Test
    public void testFindFibonacciWithSmallNumber() {
        assertEquals(1, Task5.findFibonacci(2), "F(2) should be 1");
        assertEquals(3, Task5.findFibonacci(4), "F(4) should be 3");
        assertEquals(13, Task5.findFibonacci(7), "F(7) should be 13");
    }

    @Test
    public void testFindFibonacciWithLargerNumber() {
        assertEquals(1597, Task5.findFibonacci(17), "F(17) should be 1597");
    }

    @Test
    public void testFindFibonacciWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Task5.findFibonacci(-1), "Should throw exception for negative number");
    }
}