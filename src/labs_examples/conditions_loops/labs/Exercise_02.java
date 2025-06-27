package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write completed here
        System.out.println("Enter a number from 1-7");
        int i = scanner.nextInt();
        if (i ==1){
            System.out.println("The day is Monday");
        }
        else if (i==2){
            System.out.println("The day is Tuesday");
        } else if (i==3) {
            System.out.println("The day is Wednesday");
        } else if (i==4){
            System.out.println("The day is Thursday");
        } else if (i==5){
            System.out.println("The day is Friday");
        } else if (i==6){
            System.out.println("The day is Saturday");
        } else if (i==7){
            System.out.println("The day is Sunday");
        } else{
            System.out.println("That isn't a number from 1-7");
        }
    }
}
