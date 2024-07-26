package BackTracking;

public class permutation {

    static void permut(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permut(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        permut("abc", "");
    }
}
