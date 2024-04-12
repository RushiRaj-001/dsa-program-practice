package Arrays;

public class LargestInArray {
    public static int Largest(int number[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("The samllest number is : " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 10, 2, 30, 40, 5, 6, };
        System.out.println(Largest(number));
    }
}
