public class StringBuilders {
    public static void main(String argu[]) {
        System.out.println("String Builder in Java ");
        StringBuilder sc = new StringBuilder("Bhavishya");

        System.out.println(sc);
        // * Methods in String Builder

        // * append()
        sc.append(" Tripathi");

        // * insert()
        sc.insert(9, "a");

        // * replace()

        // * delete()
        sc.delete(10, sc.length());

        // * reverse()
        sc.reverse();

        System.out.println(sc);

        String str = "Bhavishya";
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
            sb.setCharAt(sb.length() - 1 - i, temp);
        }

        System.out.println(sb.toString());
    }
}
