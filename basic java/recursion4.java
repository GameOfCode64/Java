import java.util.HashSet;

public class recursion4 {

    public static boolean[] map = new boolean[26];
    public static String[] keys = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

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

    public static void findSubSequences(String str, int indX, String newString) {

        if (indX == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indX);
        // to be
        findSubSequences(str, indX + 1, newString + currChar);

        // to not to be
        findSubSequences(str, indX + 1, newString);
    }

    public static void findSubSequencesUnique(String str, int indX, String newString, HashSet<String> set) {
        if (indX == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(indX);
        // to be
        findSubSequencesUnique(str, indX + 1, newString + currChar, set);
        // to not to be
        findSubSequencesUnique(str, indX + 1, newString, set);
    }

    public static void printCombo(String str, int indX, String combination) {
        if (indX == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(indX);
        String mapping = keys[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombo(str, indX + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String argu[]) {
        HashSet<String> set = new HashSet<>();

        // Normal
        System.out.println("Day 4 & 5 & 6 of Recursion in Java");

        // Variables
        String str = "aabcbdc";
        String str1 = "abc";
        String str2 = "23";

        // Function Call
        removeDuplicates(str, 0, "");
        findSubSequences(str1, 0, "");
        findSubSequencesUnique("aaa", 0, "", set);
        printCombo(str2, 0, "");
    }
}
