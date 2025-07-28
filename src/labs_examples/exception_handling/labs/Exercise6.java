package labs_examples.exception_handling.labs;

public class Exercise6 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=addMultiplyThenDivide(10,0);
        System.out.println(c);
    }


    public static int addMultiplyThenDivide(int a, int b){
        int x= (a+b)*(a+b);
        try{
            int y= divide(x,b);
            return y;
        }
        catch(ArithmeticException exc){
            System.out.println("Exception caught from divide method. Returning -1");
            return -1;
        }

    }

    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cannot divide by 0");
        }
        else{
            return a/b;
        }
    }
}
