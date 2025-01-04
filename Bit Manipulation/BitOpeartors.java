public class BitOpeartors {

    public static void evenOdd(int n) {

        int BitMask = 1;
        if ((n & BitMask) == 0) {
            System.out.println("number is even.");
        } else {
            System.out.println("number is odd.");
        }
    }

    public static int getIthBit(int n, int i) {
        int BitMask = 1 << i;

        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }

    public static int clearIthBit(int n, int i) {

        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static Boolean checkPower(int n) {
        // if ((n - 1 & n) == 0) {
        // return true;
        // } else {
        // return false;
        // }
        return (n - 1 & n) == 0;
    }

    public static void main(String[] args) {
        
        System.out.println("Binary AND of 5 & 6 : " + (5 & 6));
        System.out.println("Binary OR of 5 | 6 : " + (5 | 6));
        System.out.println("Binary XOR of 5 ^ 6 : " + (5 ^ 6));
        // System.out.println("Binary 1's complimaint of 5 : " + (~5));
        // System.out.println("Binary 1's complimaint of 5 : " + (5 << 3));
        // System.out.println("Binary 1's complimaint of 5 : " + (double) (5 >> 1));

        // evenOdd(2);
        // ev̥enOdd(3);
        // evenOdd(3);
        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(10, 0));
        // System.out.println(clearIthBit(10, 2));
        System.out.println(checkPower(64));
    }
}
