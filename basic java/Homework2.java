import java.util.Scanner;

public class Homework2 {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("col: ");
        int col = sc.nextInt();

        // * Print hollow Butterfly
        // upper half
        // for (int i = 0; i <= rows; i++) {

        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // for (int space = 1; space <= 2 * (rows - i); space++) {
        // System.out.print(" ");
        // }

        // for (int k = 1; k <= i; k++) {
        // if (k == 1 || k == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // System.out.println();
        // }
        // // Lower Half
        // for (int i = rows; i >= 1; i--) {

        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // for (int space = 1; space <= 2 * (rows - i); space++) {
        // System.out.print(" ");
        // }

        // for (int k = 1; k <= i; k++) {
        // if (k == 1 || k == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }

        // System.out.println();
        // }

        // * Print hollow Rhombus

        for (int i = 1; i <= rows; i++) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                if (j == 1 || i == 1 || i == col || j == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
