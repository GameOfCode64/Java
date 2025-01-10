import java.util.Scanner;

public class Function {

    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static int Factorial(int num) {
        int factorial = 1;
        for (int i = num; i >= num; i++) {
            factorial = factorial * num;
        }
        return factorial;
    }

    public static void main(String[] argu) {
        System.out.println("Function in Java");
        Scanner sc = new Scanner(System.in);

        // * Inputs

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("ENter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // * Function Call

        printName(name);
        calculateSum(a, b);
        calculateProduct(a, b);
        Factorial(b);
    }
}
