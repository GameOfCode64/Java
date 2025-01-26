public class recursion4 {

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int indX, String newString) {
        if (indX == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indX);

        if (map[currChar - 'a']) {
            removeDuplicates(str, indX + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, indX + 1, newString);
        }
    }

    public static void main(String argu[]) {
        System.out.println("Day 4 of Recursion in Java");
        String str = "aabcbdc";
        removeDuplicates(str, 0, "");
    }
}
