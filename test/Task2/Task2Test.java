package Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {
    @Test
    public void testAvarageOfArrayNumbersWithPositiveNumbers() {
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5};
        assertEquals(3.5, Task2.avarageOfArrayNumbers(array), 0.0001, "Should return the average of the array");
    }

    @Test
    public void testAvarageOfArrayNumbersWithNegativeNumbers() {
        double[] array = {-1.5, -2.5, -3.5};
        assertEquals(-2.5, Task2.avarageOfArrayNumbers(array), 0.0001, "Should return the average of the array");
    }

    @Test
    public void testAvarageOfArrayNumbersWithSingleElement() {
        double[] array = {42.0};
        assertEquals(42.0, Task2.avarageOfArrayNumbers(array), 0.0001, "Should return the only element");
    }
}