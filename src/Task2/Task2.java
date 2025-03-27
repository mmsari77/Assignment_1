package Task2;

public class Task2 {
    /**
     * Calculates the average of all numbers in an array using iteration.
     * @param array The input array of doubles.
     * @return The average of the array elements.
     * Time complexity: O(n), where n is the length of the array.
     */
    public static double avarageOfArrayNumbers(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}