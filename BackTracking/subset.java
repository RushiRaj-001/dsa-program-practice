package BackTracking;

class subset {

    static void subSet(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // yes
        subSet(str, i + 1, ans + str.charAt(i));
        // no
        subSet(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSet(str, 0, "");
    }
}