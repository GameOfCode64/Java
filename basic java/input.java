import java.util.*;

public class input {
    public static void main(String[] argu) {
        System.out.println("How to Take Input in JAVA");
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // Next Function Only Accept 1 token at a Time
        String fullName = sc.nextLine(); // NextLine Function Accept all token
        System.out.println(name);
        System.out.println(fullName);

        // Todo: We have many method in Scanner class to take inputs
        // * NextInt()
        // * NextFloat()
        // * NextDouble()
        // * all 8

        // ! Test : Take a Input form user and calculate the sum of two numbers

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
