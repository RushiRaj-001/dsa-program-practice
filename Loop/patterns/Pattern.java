public class Pattern {
    public static void main(String[] args) {

        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i % 2; j++) {
                    System.out.print(" ");
                    
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
