import java.util.*;

public class Strings {
    public static void main(String argu[]) {
        System.out.println("Strings In Java");
        Scanner sc = new Scanner(System.in);

        // ! Method of Strings in Java
        // * 1, Concatenation
        String firstName = "Bhavishya";
        String LastName = "Tripathi";
        System.out.println(firstName + " " + LastName);

        // * 2, length()
        System.out.println(firstName.length());
        System.out.println();
        // * 3, charAt()

        for (int i = 0; i < firstName.length(); i++) {
            System.out.print(firstName.charAt(i) + " ");
        }

        // * 4, compare

        if (firstName.compareTo(LastName) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are Not Equal");
        }

        // * 5, Sub string (Slicing same like python and javascript)
        String newStrings = "My Name is Bhavishya";

        System.out.println(newStrings.substring(11));

        // * 6, parseInt

        String num = "123";
    }
}
