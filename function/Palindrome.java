package function;
// Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a

// palindrome, 321 is not)
// Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321

public class Palindrome {

    public static boolean isCheck(int num) {
        int myNumer = num;
        int reverse = 0;

        while (num > 0) {
            int lastdigit = num % 10;
            reverse = (reverse * 10) + lastdigit;
            num = num / 10;

        }
        if (reverse == myNumer) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("121 is palindrome : " + isCheck(121));
        System.out.println("123 is palindrome : " + isCheck(123));
    }
}
