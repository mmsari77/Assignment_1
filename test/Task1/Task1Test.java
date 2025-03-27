package Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    @Test
    public void testSolveWithPositiveNumbers() {
        int[] array = {5, 2, 8, 1, 9};
        assertEquals(1, Task1.solve(array), "Should return the minimum element");
    }

    @Test
    public void testSolveWithNegativeNumbers() {
        int[] array = {-3, -1, -5, -2};
        assertEquals(-5, Task1.solve(array), "Should return the minimum element");
    }

    @Test
    public void testSolveWithSingleElement() {
        int[] array = {42};
        assertEquals(42, Task1.solve(array), "Should return the only element");
    }

    @Test
    public void testSolveWithExampleFromProblem() {
        int[] array = {10, 1, 32, 3, 45};
        assertEquals(1, Task1.solve(array), "Should return the minimum element from problem example");
    }
}