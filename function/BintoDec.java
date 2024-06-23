package function;

public class BintoDec {

    public static void bintoDec(int binnum) {

        int pow = 0;
        int dec = 0;
        while (binnum > 0) {
            int lastDigit = binnum % 10;

            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;

        }

        System.out.println(dec);

    }

    public static int decToBin(int decNum) {
        int pow = 0;
        int bin = 0;

        while (decNum > 0) {
            int remainder = decNum % 2;

            bin = bin + remainder * (int) Math.pow(10, pow);
            pow++;

            decNum = decNum / 2;
        }
        return bin;
    }

    public static void main(String[] args) {

        // bintoDec(1011);

        System.out.println(decToBin(5));

    }
}