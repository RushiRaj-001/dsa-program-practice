import java.util.Queue;
import java.util.LinkedList;;

public class FirstCharacter {

    static Queue<Character> q = new LinkedList<>();
    static int freq[] = new int[26];

    static void first_character(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {

        String str = "aabccxb";
        first_character(str);
    }
}
