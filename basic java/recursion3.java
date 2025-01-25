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
        if (indX == str.length()) {
            System.out.println("First: " + first + " last: " + last);
            return;
        }

        if (str.charAt(indX) == element.charAt(0)) {
            if (first == -1) {
                first = indX;
            } else {
                last = indX;
            }
        }
        findOccurrence(str, element, indX + 1);
    }

    public static boolean checkArray(int arr[], int indXI, int indXJ) {
        boolean isSorted = false;
        if (indXI == arr.length || indXJ == arr.length) {
            return isSorted;
        }

        if (arr[indXI] == arr[indXJ]) {
            isSorted = true;
            return isSorted;
        }

        return checkArray(arr, indXI + 1, indXJ + 1);

    }

    public static void moveX(String str, int indX, int count, String newString) {

        if (indX == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += "X";
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(indX);
        if (currChar == 'x') {
            count++;
            moveX(str, indX + 1, count, newString);
        } else {
            newString += currChar;
            moveX(str, indX + 1, count, newString);
        }

    }

    public static void main(String argu[]) {
        System.out.println("Day 3 of Recursion in Java");
        String element = "a";
        String str = "abaacdaefaah";
        String str1 = "axbcxxd";
        int arr[] = { 1, 2, 3, 4, 5 };

        reverseString(str, str.length() - 1);
        findOccurrence(str, element, 0);
        System.out.println(checkArray(arr, 0, 1));
        moveX(str1, 0, 0, "");
    }
}
