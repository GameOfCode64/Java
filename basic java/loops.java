import java.util.*;

public class loops {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Loops in Java");

        // Todo: for loop in Java
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello World!");
        }

        // Todo: While Loop in Java
        System.out.println("Enter a number");
        int table = sc.nextInt();
        int counter = 1;
        while (counter <= 10) {
            System.out.println(table + "X" + counter + "=" + counter * table);
            counter++;
        }

        // Todo: do while in Java
        int j = 0;
        do {
            System.out.println("Inside a DO while Loop");
        } while (j < 0);

        // ! Test: Find the sum of N Natural Number
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of" + " " + n + " is: " + sum);
    }
}
