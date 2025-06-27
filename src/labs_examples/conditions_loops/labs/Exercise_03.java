package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1-12");
        int i = scanner.nextInt();
        String monthofYear;
        switch(i){
                case 1:
                        monthofYear="January";
                        break;
                case 2:
                        monthofYear="February";
                        break;
                case 3:
                        monthofYear="March";
                        break;
                case 4:
                        monthofYear="April";
                        break;
                case 5:
                        monthofYear="May";
                        break;
                case 6:
                        monthofYear="June";
                        break;
                case 7:
                        monthofYear="July";
                        break;
                case 8:
                        monthofYear="August";
                        break;
                case 9:
                        monthofYear="September";
                        break;
                case 10:
                        monthofYear="October";
                        break;
                case 11:
                        monthofYear="November";
                        break;
                case 12:
                        monthofYear="August";
                        break;
                default:
                        monthofYear="N/A";
                        break;


        }
        System.out.println("The month of the year is "+monthofYear);
}}
