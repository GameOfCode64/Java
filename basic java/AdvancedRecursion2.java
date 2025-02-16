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

    public static void main(String[] args) {
        // * Place Tiles of Size 1xm in a floor of size nxm
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
