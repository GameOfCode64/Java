import java.util.Scanner;

public class PatternsSolving2 {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter a No of Col: ");
        int col = sc.nextInt();

        // * Rotate RightAngle by 180deg

        // for (int i = 1; i <= rows; i++) {
        // for (int space = 1; space <= rows - i; space++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // * Number Right Angle

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" "+j);
        // }
        // System.out.println();
        // }

        // * Number Inverse Right Angle
        // for (int i = rows; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + j);
        // }
        // System.out.println();
        // }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // * Floyd's Triangle

        // Print 0 1 Triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
