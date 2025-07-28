package labs_examples.exception_handling.labs;

public class Exercise4 {
    public static void main(String[] args) {
        int[] nums= {2,0,3,1};
        try {
            int i = divide(nums[0],nums[3]);
            System.out.println(i);
            try {
                int j = divide(nums[4],nums[0]);
            } catch (ArrayIndexOutOfBoundsException exc2) {
                System.out.println("Array index out of bounds");
            }
            int j=divide(nums[0],nums[1]);
            System.out.println(j);
        }
        catch(ArithmeticException exc){
            System.out.println("Cannot divide by 0");
        }
    }

    public static int divide(int a, int b){
        return a/b;
    }
}
