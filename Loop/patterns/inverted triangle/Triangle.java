
public class Triangle {

    public static void main(String[] args) {

        int n = 5;

        // for (int i = 0; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *****other logic*****

        for (int line = 0; line < n; line++) {
            for (int star = 0; star <= n - (line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
