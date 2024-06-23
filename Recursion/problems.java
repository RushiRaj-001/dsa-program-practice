package Recursion;

public class problems {

    public static void decrease(int n) {
        if (n == 1) {
            System.out.print(n);
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        decrease(n - 1);
    }

    public static void increase(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increase(n - 1);
        System.out.print(n + " ");
    }

    private static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        // int fnm1 = x-1;
        int fn = x * factorial(x - 1);
        return fn;
    }

    static int sumOfN(int n) {

        if (n == 1) {
            return 1;
        }
        int fn = n + sumOfN(n - 1);
        return fn;
    }

    public static int fibonaci(int n){
        if(n== 0 || n==1){
            return n;
        }
        int f1 = fibonaci(n-1);
        int f2 = fibonaci(n-2);

        return f1 + f2;
    }

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        else if(arr[i] > arr[i+1]){ 
            return false;    
        }
            return isSorted(arr, i+1);
    }

    public static int firstOccurance(int arr[],int key, int i){
        if (i == arr.length) {
            return -1;
        }
        
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[],int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // public static int power(int a,int n){ O(n)
    //     if(n == 0) return 1;
    //     return a * power(a, n-1);
    // }

    // O(logn)
    public static int power(int a,int n){
        if(n == 0) return 1;

        int halfsqr = power(a, n/2);
        int halfsqrt = halfsqr * halfsqr;

        if(n % 2 != 0){
            halfsqrt = a * halfsqrt;
        }
        return halfsqrt;
    }

    public static void main(String[] args) {
        // decrease(20);
        // increase(20);
        // System.out.println(factorial(5));
        // System.out.println(sumOfN(5));
        // System.out.println(fibonaci(25));
        int arr[] = {1,2,3,10,8,3,4,5,3,3,3};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 2, 0));
        // System.out.println(lastOccurance(arr, 3, 0));
        System.out.println(power(2, 5));
    }
}
