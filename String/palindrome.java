

public class palindrome {
    public static boolean isPalindrome(String str) {

        str = str.replaceAll("[-+^:]*", ""); 
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "a";
        
        str = str.replaceAll("[^a-zA-Z0-9]", "");    
        str = str.toLowerCase();
        Character.isLetterOrDigit(0);

        // System.out.println(str);

        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome string.");
        } else {
            System.out.println(str + " is not palindrome string.");
        }
    }
}
