public class Questions {

    public static int question_1(int x) {
        return x ^ x;
    }

    public static void question_2(int x, int y) {

        System.out.println("x : " + x + " and y : " + y + " before swapping.");
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x : " + x + " and y : " + y + " after swapping. ");
    }

    public static void question_3(int x) {
        System.out.println(x + " + " + 1 + " : " + -~x);
    }

    public static void question_4() {

        String str = "RUsHi";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print((char) (ch[i] | ' '));
        }
    }

    public static void main(String[] args) {
        // System.out.println(question_1(3));
        // question_2(43, 56);
        // question_3(-4);
        question_4();

    }
}
