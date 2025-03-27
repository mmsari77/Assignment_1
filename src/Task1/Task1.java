package Task1;

public class Task1 {
    /**
     * Finds the minimum element in an array using iteration.
     * @param array The input array of integers.
     * @return The minimum element in the array.
     * Time complexity: O(n), where n is the length of the array.
     */
    public static int solve(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}