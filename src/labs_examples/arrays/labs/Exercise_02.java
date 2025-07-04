package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1-10 to find the index of that number");
        int position = scanner.nextInt();
        for(int i=0;i<10;i++){
            if (array[i]==position){
                System.out.println("The index of the number is " + i);
            }
        }

    }
}