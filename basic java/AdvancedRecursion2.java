import java.util.*;

public class AdvancedRecursion2 {

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // * Vertically
        int vertically = placeTiles(n - m, m);
        // * Horizontally
        int horizontally = placeTiles(n - 1, m);

        return vertically + horizontally;
    }

    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }

        // single
        int ways1 = callGuests(n - 1);

        // pair
        int ways2 = (n - 1) * callGuests(n - 2);
        return ways1 + ways2;
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubSets(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
            return;
        }

        // add in subset
        subset.add(n);
        findSubSets(n - 1, subset);
        // test commit
        // remove in subset
        subset.remove(subset.size() - 1);
        findSubSets(n - 1, subset);
    }

    public static void main(String[] args) {

        ArrayList<Integer> subset = new ArrayList<>();

        // * Place Tiles of Size 1xm in a floor of size nxm

        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));

        // * Find the number of ways in which you can invite n people to your party or
        // * in pairs.
        System.out.println(callGuests(n));

        // * print all subsets of a set of first n natural number
        // * give inputs as n and empty subset;
        findSubSets(n, subset);
    }
}
