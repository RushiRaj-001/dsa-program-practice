package String;

public class palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "nitiN racecar nitin";

        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome string.");
        } else {
            System.out.println(str + " is not palindrome string.");
        }
    }
}
