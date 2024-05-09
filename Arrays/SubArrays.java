

public class SubArrays {
    // brute force time complexity(n^3)
    // public static void Sub_Arrays_I(int numbers[]) {
    // int max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i; j < numbers.length; j++) {
    // System.out.print("[ ");
    // int sum = 0;
    // for (int k = i; k <= j; k++) {
    // sum += numbers[k];
    // System.out.print(numbers[k] + " ");
    // }
    // System.out.print("] sum : " + sum);
    // System.out.println();
    // if (min > sum) {
    // min = sum;
    // } else if (max < sum) {
    // max = sum;
    // }
    // }
    // System.out.println();
    // }
    // System.out.println("min : " + min);
    // System.out.println("max : " + max);
    // }

    /*
     * public static void Sub_Arrays_II(int[] numbers) { // more optimal TC(n^2)
     * 
     * int sum;
     * int max = Integer.MIN_VALUE;
     * int min = Integer.MAX_VALUE;
     * 
     * int prefix_arr[] = new int[numbers.length];
     * prefix_arr[0] = numbers[0];
     * for (int i = 1; i < prefix_arr.length; i++) {
     * prefix_arr[i] = numbers[i] + prefix_arr[i - 1];
     * }
     * 
     * for (int i = 0; i < numbers.length; i++) {
     * int start = i;
     * for (int j = i; j < numbers.length; j++) {
     * int end = j;
     * sum = start == 0 ? prefix_arr[end] : prefix_arr[end] - prefix_arr[start - 1];
     * if (min > sum) {
     * min = sum;
     * } else if (max < sum) {
     * max = sum;
     * }
     * }
     * }
     * System.out.println("Max sum :" + max);
     * System.out.println("Min sum :" + min);
     * }
     */

    public static void kadanes(int numbers[]) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            curr_sum += numbers[i];

            if(max_sum < curr_sum){
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
           
            
        }
        System.out.println("max sum : " + max_sum);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 10, 5};
        kadanes(numbers);
    }
}
