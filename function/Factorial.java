package function;

public class Factorial {
    public static int fact(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static void main(String args[]) {

        int n = 5;
        int factorial = fact(n);

        System.out.println(factorial);
    }
}
