package labs_examples.static_nonstatic.labs.Exercise_01Package;

public class Class1 {

    public int number;

    public static void staticMethod(){
        System.out.println("Static Method1 from Class 1");
    }


    public void nonStaticMethod1(){
        System.out.println("Non static method from Class 1");
    }

    public void nonStaticMethod2(){
        nonStaticMethod1();
        System.out.println("Second non static method from Class 1");
    }

}
