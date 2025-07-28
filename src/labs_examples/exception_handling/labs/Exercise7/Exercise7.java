package labs_examples.exception_handling.labs.Exercise7;

public class Exercise7 {
    public static void main(String[] args) {
        Driver driver= new Driver(15);
        try{
            drive(driver);
        }
        catch(Age16Exception exc){
            System.out.println(exc.toString());
        }
    }

    public static void drive(Driver driver) throws Age16Exception{
        int a= driver.getAge();
        if(a<16){
            throw new Age16Exception();
        }
        else{
            System.out.println("This person aged "+a+" is driving");
        }
    }
}
