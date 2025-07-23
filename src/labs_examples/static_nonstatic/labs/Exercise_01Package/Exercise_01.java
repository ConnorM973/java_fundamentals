package labs_examples.static_nonstatic.labs.Exercise_01Package;

public class Exercise_01 {
    public static void main(String[] args) {
        int a= 5;
        int b= 6;
        int result=multiply(a,b);
        System.out.println(result);
        //example 1: calling a static method from another static method.

        Exercise_01 demo= new Exercise_01();
        demo.sayHello();
        //example 2: calling a non-static method from a static method. Need to create an instance of the class first.

        Class1.staticMethod();
        //example 3: calling a static method from a static method of a different class. Need to call it from the class itself, hence the Class1. syntax in uppercase.

        Class1 class1 = new Class1();
        class1.nonStaticMethod1();
        //example 4: calling a non static method from a static method of a different class. We do this one a lot when we call object methods from the main method.

    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayHelloGoodbye(){
        sayHello();
        System.out.println("Goodbye");
    }
    // example 5: The sayHelloGoodbye method first calls the sayHello method then prints out goodbye. This is an easy way to save time instead of writing code to print out "Hello" again.

    public void sayGoodNight(){
        Class1 class2 = new Class1();
        class2.nonStaticMethod1();
    }
    // example 6: The sayGoodNight method creates an object of Class1 then can call the method from Class1 on it.

    public int multiplyThenDivide(int a, int b){
        int x= multiply(a,b);
        return x/a/b;
    }
    //example 7: The multiplyThenDivide method can freely use the static method of the same class.

    public void goodMorning(){
        Class1.staticMethod();
        System.out.println("Good Morning");
    }
    //example 8: The non-static method can call the static method from another class by using the Class.method syntax. The static method belongs to the class itself, and not instances of the class.
}
