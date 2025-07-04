package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayLists
 * <p>
 * Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 * Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 * typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 * shows a list of methods.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> practice = new ArrayList<>();
        practice.add("Dog");
        practice.add("Cat");
        practice.add("Bird");

        for (String animals : practice) {
            System.out.println(animals + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("I will return the value at the index of:");

        int input = scanner.nextInt();
        System.out.println(practice.get(input));

        int size = practice.size();
        System.out.println("The array is size " + size);
    }
}
