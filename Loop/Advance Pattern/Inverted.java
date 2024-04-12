public class Inverted {

    public static void my_logic(int totalRow) {

        for (int i = 1; i <= totalRow; i++) {

            for (int j = 1; j <= totalRow - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        my_logic(10);
    }
}
