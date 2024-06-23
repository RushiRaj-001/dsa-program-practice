import java.util.ArrayList;

public class max_sub {

    // Function to find maximum of each subarray of size k.
    static void max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        for (int i = 0; i <= i + k - 1 && i < n; i++) {

            int max = Integer.MIN_VALUE;
            if (max < arr[i]) {
                max = arr[i];
            }
            // max_of_subarrays.add(max);
        }

        // for (int i : max_of_subarrays) {
        // System.out.print(i + " ");
        // }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };

        max_of_subarrays(arr, 9, 3);
    }
}
