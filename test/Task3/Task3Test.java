package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    public void testIsPrimeWithSmallPrimeNumbers() {
        assertTrue(Task3.isPrime(2), "2 should be prime (iterative)");
        assertTrue(Task3.isPrime(3), "3 should be prime (iterative)");
        assertTrue(Task3.isPrime(7), "7 should be prime (iterative)");
    }
    @Test
    public void testIsPrimeWithSmallCompositeNumbers() {
        assertFalse(Task3.isPrime(4), "4 should be composite (iterative)");
        assertFalse(Task3.isPrime(6), "6 should be composite (iterative)");
        assertFalse(Task3.isPrime(9), "9 should be composite (iterative)");

    }

    @Test
    public void testIsPrimeWithNegativeAndZero() {
            assertFalse(Task3.isPrime(-1), "-1 should not be prime (iterative)");
            assertFalse(Task3.isPrime(0), "0 should not be prime (iterative)");
            assertFalse(Task3.isPrime(1), "1 should not be prime (iterative)");
        }

    @Test
    public void testIsPrimeWithLargerPrimeNumber() {
        assertTrue(Task3.isPrime(17), "17 should be prime (iterative)");
    }

    @Test
    public void testIsPrimeWithLargerCompositeNumber() {
        assertFalse(Task3.isPrime(100), "100 should be composite (iterative)");
    }
}