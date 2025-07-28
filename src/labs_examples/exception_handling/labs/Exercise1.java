package labs_examples.exception_handling.labs;

public class Exercise1 {
    public static void main(String[] args) {
        int i=10;
        int j= 0;
        try{
            double a=i/j;
        }
        catch(ArithmeticException exc){
            System.out.println(exc.getMessage());
        }
    }
}
