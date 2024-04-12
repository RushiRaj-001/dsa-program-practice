package String;

import java.util.Stack;

public class BackspaceString {

    public static String compare(String str) {
        Stack<Character> strStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                strStack.push(str.charAt(i));
            } else if (!strStack.isEmpty()) {
                strStack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : strStack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "ab#c#";
        String str2 = "adc##";
        System.out.println(compare(str1)); // Output: "c"
        System.out.println(compare(str2)); // Output: "c"

        System.out.println(compare(str1).equals(compare(str2))); // Output: true
    }
}
