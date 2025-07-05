package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowels = "aeiou";
        System.out.println("Type in any word");
        String word = scanner.next();
        int i = 0;
        while (i <= word.length() - 1) {
            char character = word.charAt(i);
            for (int j = 0; j <= vowels.length() - 1; j++) {
                if (character == vowels.charAt(j)) {
                    System.out.println("the first vowel in the word, " + word + " is " + vowels.charAt(j));

                    return;
                }
            }
            i++;
        }
    }
}
