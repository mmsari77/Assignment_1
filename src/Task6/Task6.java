package Task6;

public class Task6 {
    /**
     * Calculates a raised to the power of n using recursion.
     * @param a The base number.
     * @param n The exponent (n >= 0).
     * @return The value of a^n.
     * @throws IllegalArgumentException If n is negative.
     * Time complexity: O(n), where n is the exponent.
     * Note: This method may cause integer overflow for large values of a and n.
     */
    public static int a_n(int a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Exponentiation is not defined for negative n");
        }
        if (n == 0) {
            return 1; // a^0 = 1
        }
        if (n == 1) {
            return a; // a^1 = a
        }
        return a * a_n(a, n - 1);
    }
}