package String;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "cAre";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            Boolean result = Arrays.equals(str1Array, str2Array);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams string.");
            } else {
                System.out.println("Strings are not anagrams.");
            }
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}
