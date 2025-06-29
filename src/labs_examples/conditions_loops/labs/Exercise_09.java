package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 * <p>
 * Demonstrate the use of the "break" statement to exit a loop.
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 7) {
                System.out.println("Done");
                break;
            }
        }

    }
}
