public class InvertedNum {
    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int k = 1;
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                System.out.print(k + " ");
                a++;
                k++;
            }
            System.out.println();
        }
    }

    public static void zer_one_triangle(int n) {

        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern(5);

        // floyd_triangle(5);
        zer_one_triangle(5);
    }

}