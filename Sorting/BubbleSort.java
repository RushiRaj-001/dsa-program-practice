package Sorting;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
               if(arr[j+1] < arr[j]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
               }
            }

            
        }
    }

    public static void sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 43, 62, 6, 87, 2, 1 };
        sort(arr);
        sorted(arr);
    }
}
