public class recursion {

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printNumber(n - 1);
        }
    }

    public static void printNum(int n) {
        if (n == 6) {
            return;
        } else {
            System.out.println(n);
            printNum(n + 1);
        }
    }

    public static int printSum(int n) {
        int sum = 0;

        if (n == 0) {
            return sum;
        } else {
            sum = n + printSum(n - 1);
        }
        return sum;
    }

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int calcPower(int x, int n) {

        if (n == 1) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        int xPower = calcPower(x, n - 1);
        int xPowr = x * xPower;
        return xPowr;
    }

    public static int calcPower1(int x, int n) {

        if (n == 1) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPower1(x, n / 2) * calcPower1(x, n / 2);
        } else {
            return calcPower1(x, n / 2) * calcPower1(x, n / 2) * x;
        }

    }

    public static void main(String argu[]) {
        printNumber(5);
        printNum(1);
        System.out.println(printSum(5));
        System.out.println(Factorial(5));
        System.out.println(fibonacci(5));
    }
}