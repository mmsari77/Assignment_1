package Task5;

public class Task5 {
    /**
     * Calculates the nth Fibonacci number using recursion.
     * @param n The index of the Fibonacci number to calculate (n >= 0).
     * @return The nth Fibonacci number.
     * @throws IllegalArgumentException If n is negative.
     * Time complexity: O(2^n), where n is the input number.
     * Note: This method may cause integer overflow for large values of n (n > 46).
     */
    public static int findFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci number is not defined for negative indices");
        }
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}