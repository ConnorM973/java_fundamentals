package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int a = 2; a >= 0; a--){
            for (int b = 2; b >= 0; b--) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}