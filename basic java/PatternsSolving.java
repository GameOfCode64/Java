import java.util.Scanner;

public class PatternsSolving {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Rows: ");
        int rows = sc.nextInt();
        System.out.println("");
        System.out.print("Enter No Col: ");
        int col = sc.nextInt();

        // * Print Solid Rectangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        // * Print Holo Rectangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == rows || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // * Print RightAngle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // * inverse Print RightAngle

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
