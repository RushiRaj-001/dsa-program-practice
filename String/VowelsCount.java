package String;

import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String : ");
        StringBuilder str = new StringBuilder(scanner.nextLine());

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Total Numbers of vowels are : " + count);
        scanner.close();
    }
}
