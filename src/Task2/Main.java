package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        double[] array = new double[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        System.out.println(Task2.avarageOfArrayNumbers(array));
    }
}