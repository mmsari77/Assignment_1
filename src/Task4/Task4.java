package Task4;

public class Task4 {
    /**
     * Calculates the factorial of a number using recursion.
     * @param n The number to calculate the factorial for.
     * @return The factorial of the number.
     * @throws IllegalArgumentException If the number is negative.
     * Time complexity: O(n), where n is the input number.
     * Note: This method may cause integer overflow for large values of n (n > 12).
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}