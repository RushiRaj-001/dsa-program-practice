package function;

public class Swap {


    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

       swap(a, b);
    }
}
