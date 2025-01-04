import java.util.ArrayList;

public class max_sub {

    // Function to find maximum of each subarray of size k.
    static int max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        int right = 0, left = 0;
        int maxLength = 0;
        int sum = arr[0];

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int arr[] = { 2, 0, 0, 0, 3 };
        int n = arr.length;
        int ans = max_of_subarrays(arr, n, 3);
        System.out.println(ans);
    }
}
