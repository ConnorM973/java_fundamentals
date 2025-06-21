package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");

            // write your code below
            boolean c = true;
            boolean d = true;
            if (c & d) System.out.println("c and d are true, both evaluated");

            boolean e = true;
            boolean f = true;
            if (e && f) System.out.println("e and f are true, e evaluated first, followed by f");

            boolean g = false;
            boolean h = true;
            if (g | h) System.out.println("g or h is true");

            int i = 10;
            int j = 20;
            if ((i > 5) || (j > 5)) System.out.println("i or j is greater than 5, i evaluated first");

            boolean k = true;
            boolean l = false;
            if (k ^ l) System.out.println("k and l are different");

            boolean m = true;
            boolean n = false;
            if (m=!n) System.out.println("m is not equal to n");
        }

    }}