package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Dog {
    int age;
    String breed;

    public void ageInMonths() {
        age = age * 12;
        System.out.println(age);
    }

    public static void main(String[] args) {
        double a = multiply(4, 5);
        double b = multiply(32.3, 10.4);
        System.out.println(a);
        System.out.println(b);
        //1: the above and the reference to the "multiply" methods below are examples of method overloading- same method name and "double" return type but the args are different primitive types.

        Dog bella = new Dog();
        bella.age = 10;
        bella.breed = "Pug";
        bella.ageInMonths();
        System.out.println("After method the new value of age is " + bella.age);
        //2: the above shows that after calling the method of converting age in years to months, the original age variable has changed. This is different than the result below as the value of
        //x changed in the method, but does not affect the original variable.
        int x = 20;
        int add5Result = add5(x);
        System.out.println("The number with 5 added is " + add5Result);
        System.out.println("The value of the original number has not changed, it is still " + x);


        System.out.println("Input 4 numbers to find the largest of the 4");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int z = largestOf4(num1, num2, num3, num4);
        System.out.println("The largest number is " + z);
        //3. The above is the code for calling the "largestOf4" method, which returns the largest of 4 numbers.

        String testString= "elephant";
        int consonantResult= numConsonants(testString);
        System.out.println("The number of consonants in the word is "+consonantResult);
        //4. The above is the code for calling the "numConsonants" method, which returns the number of consonants in a string.

        int primeNumTest1 = 281;
        int primeNumTest2 = 499;
        int primeNumTest3 = 100;
        int primeNumTest4= 349;
        boolean primeTest1= isPrime(primeNumTest1);
        boolean primeTest2= isPrime(primeNumTest2);
        boolean primeTest3= isPrime(primeNumTest3);
        boolean primeTest4= isPrime(primeNumTest4);
        System.out.println("True or false: the number " +primeNumTest1+" is prime..  "+primeTest1);
        System.out.println("True or false: the number " +primeNumTest2+" is prime..  "+primeTest2);
        System.out.println("True or false: the number " +primeNumTest3+" is prime..  "+primeTest3);
        System.out.println("True or false: the number " +primeNumTest4+" is prime..  "+primeTest4);

        System.out.println("The largest and smallest numbers are "+ Arrays.toString(smallestLargest(new int[]{1, 4, 67, 2, 7})));
    }
    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int add5(int a) {
        a = a + 5;
        return a;
    }

    public static int largestOf4(int a, int b, int c, int d) {
        int[] array = {a, b, c, d};
        int largest = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int numConsonants(String a) {
        char[] charArray = a.toCharArray();
        int consonantCount = 0;
        String vowels = "aeiou";
        for (char c : charArray) {
            if (vowels.indexOf(c) == -1) {
                consonantCount = consonantCount + 1;
            }
        }
        return consonantCount;


    }
    public static boolean isPrime(int a){
        boolean prime = true;
        for(int b=2;b<=a/2;b++){
            if(a%b==0){
                prime = false;
                return prime;
            }

        } return prime;
    }
    public static int[] smallestLargest(int[] x){
        int lengthArray= x.length;
        int largestValue= x[0];
        int smallestValue= x[0];
        for(int a=0;a<lengthArray;a++){

            if (x[a]>largestValue){
                largestValue =x[a];
            }
            if (x[a]<smallestValue){
                smallestValue=x[a];
            }
        }
        System.out.println("The smallest value is "+smallestValue+ " and the largest value is "+largestValue);
        //int[]result=new int[2];
        //result[0]=smallestValue;
        //result[1]=largestValue;
        //return result;
        return new int[]{smallestValue,largestValue};
    }
}

