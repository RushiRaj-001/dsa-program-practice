package String;

public class String_builder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("A to Z : ");
        // char ch = 'A';
        for (char i = 'A'; i <= 'Z'; i++) {
            str.append(i + " ");
        }
        System.out.println(str);
    }
}
