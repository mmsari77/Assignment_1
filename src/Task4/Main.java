package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " is: " + Task4.factorial(n));
    }
}