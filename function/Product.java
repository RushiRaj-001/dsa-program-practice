package function;

public class Product {

    public static int multiply(int a, int b) {

        int sum = a * b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        System.out.println(multiply(num1, num2));
    }
}
