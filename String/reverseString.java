package String;

import java.util.Scanner;

public class reverseString {

    private static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
        System.out.println(reverse(str));
    }
}
