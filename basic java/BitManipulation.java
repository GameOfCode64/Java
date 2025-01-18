public class BitManipulation {
    public static void main(String[] args) {
        System.out.println("Bit Manipulation in Java");

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("bit was Zero");
        } else {
            System.out.println("Bit was One");
        }

        // * Set Bit Operation
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        // * Clear Bit

        int notBitMask = ~(bitMask);
        int notNewNumber = notBitMask & n;
        System.out.println(notNewNumber);

        // * Update Bit

        int opt = 1;

        System.out.println(opt);
        System.out.println(newNumber); // * if opt is 1 set operation else clear operation
        System.out.println(notNewNumber);
    }
}
