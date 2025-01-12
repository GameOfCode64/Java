import java.util.Scanner;

public class HomeWork3 {
    // * Question 1
    public static int calculateAvg(int a, int b) {
        return (a + b) / 2;
    }

    // * Question 2
    public static int printOddSum(int n) {
        int sumOddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                sumOddSum += n;
            }
        }

        return sumOddSum;
    }

    // * Question 3
    public static int printGreatest(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    // * Question 4
    public static double calculateRadius(int radius) {
        double PI = 3.14;
        double circleRadius = 2 * PI * radius;
        return circleRadius;
    }

    // * Question 5
    public static void checkAdult(int age) {
        if (age < 18) {
            System.out.println("Not Adult");
        } else {
            System.out.println("Adult");
        }
    }

    // * Question 6
    public static void infiniteLoop() {
        boolean startLoop = true;
        while (startLoop) {
            System.out.println("InfiniteLoop");
        }
    }

    // * Question 7
    public static int findPower(int n, int x) {
        int power = (int) Math.pow(n, x);
        return power;
    }

    // * Question 8
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // * Question 9
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    // * Question 10
    public static void countNumbers() {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }

    public static void main(String[] argu) {
        System.out.println("HomeWork 3");
        System.out.println(calculateRadius(3));

    }
}
