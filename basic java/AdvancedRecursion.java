public class AdvancedRecursion {

    public static void Permutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currStr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            Permutation(newStr, permutation + currStr);
        }
    }

    public static int CountPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }

        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // * Move down
        int downPath = CountPaths(i + 1, j, n, m);

        // * Move Right
        int rightPath = CountPaths(i, j + 1, n, m);

        return downPath + rightPath;
    }

    public static void main(String str[]) {
        System.out.println("Advanced Recursion");

        // * Q1, Print all permutations of a String "abc"
        String newStr = "abc";
        Permutation(newStr, "");

        // * Q2, Count total paths in a maze to move from (0, 0) to (n, m)
        int n = 3, m = 3;
        int totalPaths = CountPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
