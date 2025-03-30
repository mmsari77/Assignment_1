package Task10;

public class Task10 {
    /**
     * Calculates the Greatest Common Divisor (GCD) of two numbers using the recursive Euclidean Algorithm.
     * Time complexity: O(log(min(a, b))), where a and b are the numbers being evaluated.
     * The algorithm recursively reduces the problem using the formula GCD(a, b) = GCD(b, a % b).
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor of a and b.
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}