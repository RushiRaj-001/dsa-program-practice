package function;

public class Exercise {
    // Question:1 Write a Java method to compute the average of three numbers..
    public static double avg(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println(average);
        return average;
    }

    /*
     * Question:2 Write a method named isEven that accepts an int argument. The
     * method
     * should return true if the argument is even, or false otherwise. Also write a
     * program to test your
     * method
     */

    public static boolean isEven(int num) {
        if (num % 2 == 0){
            return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        // avg(4, 6, 8);

        System.out.println(isEven(5));
    }
}
