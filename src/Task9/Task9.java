package Task9;

public class Task9 {
    private static int[][] memo;

    /**
     * Calculates the binomial coefficient C(n, k) using recursion with memoization.
     * Time complexity: O(n * k), where n and k are the parameters for the binomial coefficient.
     * Memoization avoids recomputing the same values repeatedly, improving efficiency.
     * Note: This method may cause integer overflow for large values of n and k.
     * @param n The total number of elements (bottom of the binomial coefficient).
     * @param k The number of elements to choose (top of the binomial coefficient).
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCef(int n, int k) {
        if (k == 0 || k == n) return 1;
        if (memo[n][k] != 0) return memo[n][k];
        memo[n][k] = binomialCef(n - 1, k - 1) + binomialCef(n - 1, k);
        return memo[n][k];
    }

    /**
     * Initializes the memoization array and calculates the binomial coefficient.
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     * @throws IllegalArgumentException If n or k is negative, or k exceeds n.
     */
    public static int calculateBinomial(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid input: n and k must be non-negative, and k must not exceed n");
        }
        memo = new int[n + 1][k + 1];
        return binomialCef(n, k);
    }
}