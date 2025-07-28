package labs_examples.exception_handling.labs;

public class Exercise2 {
    public static void main(String[] args) {
        int [] array= {10,0,3};
        try{
            int a=array[0]/array[1];
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println(exc.getMessage());
        }
        catch(ArithmeticException exc2){
            System.out.println((exc2.getMessage()));
        }
    }
}
