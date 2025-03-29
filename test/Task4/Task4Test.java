package Task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task4Test {
    @Test
    public void testFactorialWithZero() {
        assertEquals(1, Task4.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialWithOne() {
        assertEquals(1, Task4.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    public void testFactorialWithSmallNumber() {
        assertEquals(120, Task4.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorialWithLargerNumber() {
        assertEquals(3628800, Task4.factorial(10), "Factorial of 10 should be 3628800");
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Task4.factorial(-1), "Should throw exception for negative number");
    }
}