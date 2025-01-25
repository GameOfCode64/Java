public class recursion3 {
    public static int first = -1;
    public static int last = -1;

    public static void reverseString(String str, int indX) {
        if (indX == 0) {
            System.out.println(str.charAt(indX));
            return;
        }
        System.out.println(str.charAt(indX));
        reverseString(str, indX - 1);
    }

    public static void findOccurrence(String str, String element, int indX) {
        if (indX == 0) {
            System.out.println("First: " + first + " last: " + last);
            return;
        }

        if (str.charAt(indX) == element.charAt(0)) {
            if (last == -1) {
                last = indX;
            } else {
                first = indX;
            }
        }

        findOccurrence(str, element, indX - 1);

    }

    public static void main(String argu[]) {
        System.out.println("Day 3 of Recursion in Java");
        String str = "abaacdaefaah";
        String element = "a";
        // reverseString(str, str.length() - 1);
        findOccurrence(str, element, str.length() - 1);

    }
}
