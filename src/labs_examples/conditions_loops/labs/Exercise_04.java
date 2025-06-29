package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 4: Even numbers
 * <p>
 * Using a "for-loop", print out all even numbers from 1-100.
 */

public class Exercise_04 {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
//            int remainder = i % 2;
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
        for (int i = 100; i >= 2; i = i - 2) {
            System.out.println(i);
        }
    }
}
