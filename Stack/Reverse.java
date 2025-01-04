package Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        String str = "abs";

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.peek());
            s.pop();
        }
        System.out.println(result);
    }
}
