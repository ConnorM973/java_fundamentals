package labs_examples.packages.labs.Example1;

import labs_examples.packages.labs.Example2.Class2;

public class Class2Child extends Class2 {
    public static void main(String[] args) {
        Class2Child class2= new Class2Child();

        class2.printMe();
        //although this is in a separate package, as this class is a child class of Class2 from the Example2 package, we can use the protected method there.


    }

}
