import java.util.*;

public class Array2d {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2D Array In Java ");
        int[][] numbers = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // * Take array as a input from user and search the element given element

        System.out.print("Enter a number you want to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (numbers[i][j] == search) {
                    System.out.print("Index is: " + "(" + i + "," + j + ")");
                }
            }
        }

    }
}
