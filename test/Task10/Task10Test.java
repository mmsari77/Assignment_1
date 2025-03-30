package Task10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task10Test {
    @Test
    public void testGcdWithEqualNumbers() {
        assertEquals(5, Task10.gcd(5, 5));
    }

    @Test
    public void testGcdWithCoprimeNumbers() {
        assertEquals(1, Task10.gcd(15, 28));
    }

    @Test
    public void testGcdWithOneZero() {
        assertEquals(10, Task10.gcd(10, 0));
        assertEquals(20, Task10.gcd(0, 20));
    }

    @Test
    public void testGcdWithNegativeNumbers() {
        assertEquals(5, Task10.gcd(-15, 10));
        assertEquals(5, Task10.gcd(15, -10));
        assertEquals(5, Task10.gcd(-15, -10));
    }

    @Test
    public void testGcdWithTypicalNumbers() {
        assertEquals(6, Task10.gcd(54, 24));
        assertEquals(12, Task10.gcd(48, 36));
    }
}