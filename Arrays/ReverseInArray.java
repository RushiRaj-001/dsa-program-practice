
public class ReverseInArray {

    public static void reverse(String number[]) {
        int start = 0;
        int last = number.length - 1;

        while (last > start) {

            String temp = number[start];
            number[start] = number[last];
            number[last] = temp;

            start++;
            last--;
        }
    }

    public static void main(String[] args) {

        String numbers[] = { "rushi", "rajapure", "is", "boy" };

        reverse(numbers);
        // for (int i : numbers) {
        // System.out.print(i + " ");
        // }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
