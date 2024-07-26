
public class rotatedArr {

    public static int search(int arr[], int tar, int si, int ei) {

        int mid = si + (ei - si) / 2;

        if (si > ei) {
            return -1;
        }

        if (tar == arr[mid]) {
            return mid;
        }

        if (arr[si] < arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int si = 0;
        int ei = arr.length - 1;
        int target = 2;
        System.out.println(search(arr, target, si, ei));
    }
}
