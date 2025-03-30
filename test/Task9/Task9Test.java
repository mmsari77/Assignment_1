package Task9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task9Test {
    @Test
    public void testBinomialWithBaseCases() {
        assertEquals(1, Task9.calculateBinomial(5, 0));
        assertEquals(1, Task9.calculateBinomial(5, 5));
    }

    @Test
    public void testBinomialWithSmallNumbers() {
        assertEquals(10, Task9.calculateBinomial(5, 2));
        assertEquals(6, Task9.calculateBinomial(4, 2));
    }

    @Test
    public void testBinomialWithKEqualsOne() {
        assertEquals(5, Task9.calculateBinomial(5, 1));
    }

    @Test
    public void testBinomialWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Task9.calculateBinomial(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Task9.calculateBinomial(5, -2));
        assertThrows(IllegalArgumentException.class, () -> Task9.calculateBinomial(5, 6));
    }
}