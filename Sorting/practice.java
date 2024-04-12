package Sorting;

public class practice {

    public static void bubbleSort(int arr[]) { // Time Complexity O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selection_sort(int arr[]) { // Time Complexity O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }

    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void sorted(int arr[]) {
        int i = 0;
        for (i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nlength of array : " + i);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3, 11, 1, 3, 6, 34, 2, 2, 3, 30 };

        // bubbleSort(arr);
        // selection_sort(arr);
        // insertion_sort(arr);
        counting_sort(arr);
        sorted(arr);
    }
}
