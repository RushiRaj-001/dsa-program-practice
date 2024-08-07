// Problem Statement –

// A chocolate factory is packing chocolates into the packets. The chocolate
// packets here represent an array of N number of integer values. The task is to
// find the empty packets(0) of chocolate and push it to the end of the conveyor
// belt(array).

// Example 1 :

// N=8 and arr = [4,5,0,1,9,0,5,0].

// There are 3 empty packets in the given set. These 3 empty packets represented
// as O should be pushed towards the end of the array

// Input :

// 8 – Value of N

// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is
// separated by newline

// Output:

// 4 5 1 9 5 0 0 0

import java.util.ArrayList;
import java.util.Scanner;

public class ChoclateFact {

    public static void moveZerosToEnd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] != 0) {
                left++;
            }

            while (left < right && arr[right] == 0) {
                right--;
            }

            // Swap non-zero element at left pointer with zero element at right pointer
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    // public static void moveZero(int arr[]) {
    

    // int zeroPosition = 0;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != 0) {
    // arr[zeroPosition] = arr[i];
    // zeroPosition++;
    // }
    // }
    // for (int i = zeroPosition; i < arr.length; i++) {
    // arr[i] = 0;
    // }
    // }

    static void moveZero(int arr[]) {
    //     ArrayList<Integer> temp = new ArrayList<>(); 

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != 0) {
    //            temp.add(arr[i]);
    //         }
    //     }
    //   for(int i = 0; i < temp.size();i++){
    //     arr[i] = temp.get(i);
    //   }
    //   for(int i=temp.size();i<arr.length;i++){
    //     arr[i] = 0;
    //   }

    int j = -1;
    for(int i = 0; i< arr.length;i++){
        if(arr[i] == 0){
            j = i;
            break;
        }
    }
    for(int i = j+1;i<arr.length;i++){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the length of Array : ");
        // int n = sc.nextInt();

        int arr[] = { 1, 2, 3, 0, 4, 0, 0, 7, 3 };

        // System.out.println("Enter the elements.");
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }
        sc.close();
        moveZero(arr);
        // moveZerosToEnd(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}