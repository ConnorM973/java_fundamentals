package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        byte c = 25;
        byte d = 30;
        if (c <= d){
            System.out.println("c is less than or equal to d");
        }
        byte e  = 50;
        byte f = 49;
        if (e > f){
            System.out.println("e is greater than f");
        } else{
            System.out.println("e is less than or equal to f");
        }
        byte g  = 50;
        byte h = 50;
        if (g >= h){
            System.out.println("g is greater than or equal to h");
        }
        byte i = 30;
        byte j = 30;
        if (i==j){
            System.out.println("i and j are equal");
        }
    }
    }



