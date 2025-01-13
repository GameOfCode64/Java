import java.util.*;

public class Array {
    public static void main(String argu[]) {
        System.out.println("Array In Java");
        Scanner sc = new Scanner(System.in);

        // * How to declare a array in java
        int[] marks = new int[4];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        marks[3] = 49;

        System.out.println(marks[0]);

        for (int i = 0; i <= 3; i++) {
            System.out.println(marks[i]);
        }

        // * another way of declare a array in java

        int marks2[] = { 85, 57, 77, 88 };

        System.out.println(marks2[0]);

        // * Take array as a input from user and search the element given element

        System.out.print("Size of Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter a Element to Search: ");
        int element = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == element) {
                System.out.println("Element Index: " + i);
                break;
            } else {
                System.out.println("Element Not Found");
            }
        }
    }
}
