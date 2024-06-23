
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

     static long kadanes(int arr[],int n) {
        // int max_sum = Integer.MIN_VALUE;
        // int curr_sum = 0;

        // for (int i = 0; i < arr.length; i++) {
        // // curr_sum += numbers[i];

        // // if(max_sum < curr_sum){
        // // max_sum = curr_sum;
        // // }
        // // if (curr_sum < 0) {
        // // curr_sum = 0; 
        // // }

        // curr_sum += arr[i];

        // if(curr_sum > arr[i]){
        // max_sum = curr_sum;
        // }

        // }
        // System.out.println("max sum : " + max_sum);

        int max_sum = arr[0];
        int curr_sum = arr[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Update current sum by including current element or starting fresh from current element
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            
            // Update the maximum sum found so far
            max_sum = Math.max(max_sum, curr_sum);
        }
        
        return max_sum;
    }


    public static void main(String[] args) {
        int[] numbers = { -10 - 2 - 3 - 4 };
        int n = numbers.length;
      
        System.out.println(kadanes(numbers, n));
    }
}
