package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer:
 *When the constructor of a subclass is called, it implicitly calls the constructor of the parent class, unless told otherwise with the super() command. So, it calls the class b constructor method, which calls its parent class A's method, then runs back down the chain of command.
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {   super();
        new Object();
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }

    @Override
    public String toString() {
        return "C_1{}";
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
        System.out.println(c.toString());
    }
}
