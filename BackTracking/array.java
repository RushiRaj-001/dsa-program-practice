package BackTracking;

public class array {

    static void backTrack(int arr[], int i, int val) {

        if (i == arr.length) {
            printArr(arr);
            return;
        }

        arr[i] = val;
        backTrack(arr, i + 1, val + 1);
        arr[i] -= 2;
    }

    static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backTrack(arr, 0, 0);
        System.out.println();
        printArr(arr);
    }
}
