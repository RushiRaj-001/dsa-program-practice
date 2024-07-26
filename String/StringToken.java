import java.io.*;
import java.util.*;

public class StringToken {

    // Method to remove leading non-letter characters
    static String removeLeadingNonLetters(String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        return s.substring(i);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); // Read a line of input

        // Remove leading non-letter characters
        s = removeLeadingNonLetters(s);

        // Check special cases
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split the string into words using a regex that matches non-alphabetic
        // sequences
        String arrOfstr[] = s.split("[^A-Za-z]+");

        // Print the number of words
        System.out.println(arrOfstr.length);

        // Print each word on a new line
        for (String a : arrOfstr) {
            System.out.println(a);
        }

        scan.close(); // Close the scanner
    }
}
