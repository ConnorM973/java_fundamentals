package labs_examples.packages.labs.Example1;

import labs_examples.packages.labs.Example2.Class2;

public class Class1 {
    public static void main(String[] args) {
        Class1 class1= new Class1();
        class1.printMe();
        class1.sayHi();
        class1.publicPrint();
        // these 3 methods will all print because we are in the same class.

        Class2 class2= new Class2();
        class2.printMe();
        //class2.sayHi();
        // as the method is in a separate package and protected, we cannot access the "sayHi" method.
        //class2.sayHello();
        //as the method is private, we cannot access it anywhere other than the class itself.
    }

    protected void printMe(){
        System.out.println("Printing from Class1");
    }
    private void sayHi(){
        System.out.println("Hi from Class1");
    }

    public void publicPrint(){
        System.out.println("Printing from Class1, can be printed from any class");
    }
}
