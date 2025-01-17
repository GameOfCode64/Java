public class Operators {
    public static void main(String argu[]) {
        System.out.println("Operators in Java");

        // * Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("a / b = " + (a / b)); // division
        System.out.println("a % b = " + (a % b)); // modulus

        // * Unary Operators
        int c = +a;
        int d = -b;
        System.out.println("Unary plus: " + c);
        System.out.println("Unary minus: " + d);
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--b));

        // * Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // * Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // * Bitwise Operators
        int e = 5, f = 3;
        System.out.println("e & f: " + (e & f));
        System.out.println("e | f: " + (e | f));
        System.out.println("e ^ f: " + (e ^ f));
        System.out.println("~e: " + (~e));
        System.out.println("e << 1: " + (e << 1));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));

        // * Assignment Operators
        int g = 10;
        g += 5;
        System.out.println("g += 5: " + g);
        g -= 3;
        System.out.println("g -= 3: " + g);
        g *= 2;
        System.out.println("g *= 2: " + g);
        g /= 4;
        System.out.println("g /= 4: " + g);
        g %= 3;
        System.out.println("g %= 3: " + g);

        // * Ternary Operator
        int h = (a > b) ? a : b;
        System.out.println("Ternary operator: " + h);
    }
}
