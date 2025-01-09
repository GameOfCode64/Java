import java.util.Scanner;

public class HomeWorkPatterns {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no Col: ");
        int col = sc.nextInt();

        // * Print Rhombus

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // * Print a number pyramid.
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        // * Print a palindromic number pyramid
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
