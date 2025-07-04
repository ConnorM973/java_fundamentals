package labs_examples.arrays.labs;

/**
 * 2D Array
 * <p>
 * Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int numofRows = 5;
        int numofCols = 5;
        int[][] matrix = new int[numofRows][numofCols];
        int start = 3;
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                matrix[a][b] = start;
                start = start + 3;
                System.out.print(matrix[a][b] + "\t");
            }
            System.out.println();
        }
    }
}