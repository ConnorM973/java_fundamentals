package labs_examples.exception_handling.labs;

public class Exercise3 {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        try{
            int c=divide(a,b);
        }
        catch(ArithmeticException exc){
            System.out.println("Cannot divide by 0");
        }
        finally{
            System.out.println("Printing finally block");
        }
    }
    public static int divide(int a, int b){
        return a/b;
    }
}
