package Task6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {
    @Test
    public void testA_nWithZero() {
        assertEquals(1, Task6.a_n(5, 0), "a^0 should be 1 for any a");
    }

    @Test
    public void testA_nWithOne() {
        assertEquals(2, Task6.a_n(2, 1), "a^1 should be a");
    }

    @Test
    public void testA_nWithSmallNumbers() {
        assertEquals(4, Task6.a_n(2, 2), "2^2 should be 4");
        assertEquals(8, Task6.a_n(2, 3), "2^3 should be 8");
    }

    @Test
    public void testA_nWithDifferentBase() {
        assertEquals(9, Task6.a_n(3, 2), "3^2 should be 9");
    }

    @Test
    public void testA_nWithExampleFromProblem() {
        assertEquals(1024, Task6.a_n(2, 10), "2^10 should be 1024");
    }

    @Test
    public void testA_nWithNegativeN() {
        assertThrows(IllegalArgumentException.class, () -> Task6.a_n(2, -1), "Should throw exception for negative n");
    }
}