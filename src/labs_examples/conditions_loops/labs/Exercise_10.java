package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 * <p>
 * Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for (int a = 0; a <= 10; a++) {
            if (a == 7) {
                continue;
            }
            System.out.println(a);
        }


    }
}
