package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    // Question 1:For a given integer array of size N.You have to find all the
    // occurrences(indices)of a given element(Key) and print them.Use a recursive
    // function to solve this problem
    public static void occurrences(int arr[], int key, int i) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        occurrences(arr, key, i + 1);

    }

    // question 2 : You are given a number (eg - 2019), convert it into a String of
    // english like“two zero one nine”. Use a recursive function to solve this
    // problem.
    public static void convert(int number) {
        String stack[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (number == 0) {
            return;
        }

        int n = number % 10;
        convert(number / 10);
        System.out.print(stack[n] + " ");

    }

    // Question 3 :Write a program to find Length of a String using Recursion.
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    // question 4:contiguous substring
    // public static int substring(String str){
    // if(str.length() == 1){
    // return 1;
    // }

    // }
    static void getInput() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of test cases
        sc.nextLine(); // Consume the newline character left after nextInt()

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the whole line as a string
            int a = sc.nextInt(); // Read the next integer
            sc.nextLine(); // Consume the newline character after the integer

            // Your code here

            System.out.println(s);
            System.out.println(a);
        }
        sc.close();
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // occurrences(arr, key, 0);
        // convert(1947);
        // System.out.println(length("abc"));
        getInput();
    }
}
