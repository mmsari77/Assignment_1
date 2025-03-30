package Task8;

public class Task8 {
    /**
     * Checks if the given string consists only of digits using recursion.
     * @param str The string to check.
     * @return true if the string consists only of digits, false otherwise.
     * @throws IllegalArgumentException If the string is null.
     * Time complexity: O(n), where n is the length of the string.
     * Space complexity: O(n) due to the recursion stack.
     */
    public static boolean checkDigits(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (str.isEmpty()) {
            return true;
        }
        return checkDigitsRecursive(str, 0);
    }

    /**
     * Helper method to recursively check if the string consists only of digits.
     * @param str The string to check.
     * @param index The current index to check.
     * @return true if the remaining substring consists only of digits, false otherwise.
     */
    private static boolean checkDigitsRecursive(String str, int index) {
        if (index == str.length()) {
            return true;
        }
        char current = str.charAt(index);
        if (!Character.isDigit(current)) {
            return false;
        }
        return checkDigitsRecursive(str, index + 1);
    }
}