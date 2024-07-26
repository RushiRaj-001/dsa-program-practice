

public class CharacterPattern {

    public static void main(String[] args) {
        char n = 'A';

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
