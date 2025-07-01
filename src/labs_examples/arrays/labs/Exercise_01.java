package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_01 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want in the array? ");
        int size = scanner.nextInt();

        System.out.println("Input " + size + " numbers");
        int[] tenNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            int a = scanner.nextInt();
            tenNumbers[i] = a;
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + tenNumbers[i];
        }
        System.out.println("The sum is " + sum);

        double average = (double) sum / size;
        System.out.println("The average is " + average);
//        System.out.println(Arrays.toString(tenNumbers));

    }
}