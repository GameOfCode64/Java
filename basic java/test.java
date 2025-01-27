public class test {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fac(n - 1) * n;
    }

    public static void main(String argu[]) {
        System.out.println(fib(5));
        System.out.println(fac(5));
    }
}
