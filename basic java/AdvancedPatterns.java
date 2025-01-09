import java.util.Scanner;

public class AdvancedPatterns {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Col: ");
        int col = sc.nextInt();

        // * Butterfly Pattern

        // Upper half
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (rows - i);

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (rows - i);

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

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

        // * Print Diamond
        // Upper Half
        for (int i = 1; i <= rows; i++) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower Half
        for (int i = rows; i >= 1; i--) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
