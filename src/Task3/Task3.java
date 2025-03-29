package Task3;

public class Task3 {
    /**
     * Checks if a number is prime using iteration.
     * @param number The number to check.
     * @return true if the number is prime, false otherwise.
     * Time complexity: O(√n), where n is the input number.
     */
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}