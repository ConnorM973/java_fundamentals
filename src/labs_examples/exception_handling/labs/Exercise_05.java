package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        int a= 5;
        int b= 0;
        try{
            int c=divide(a,b);
            System.out.println("Answer equals "+c);
        }
        catch(ArithmeticException exc){
            System.out.println("Exception caught "+exc.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("Divide by zero exception");
        }
        else{
        return a/b;
        }
    }
}