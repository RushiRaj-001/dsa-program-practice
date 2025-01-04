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
        // // int fnm1 = x-1;
        // int fn = x * factorial(x - 1);
        // return fn;
        return x * factorial(x - 1);
    }

    static int sumOfN(int n) {

        if (n == 1) {
            return 1;
        }
        int fn = n + sumOfN(n - 1);
        return fn;
    }

    public static int fibonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fibonaci(n - 1);
        int f2 = fibonaci(n - 2);

        return f1 + f2;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        } else if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // public static int power(int a,int n){ O(n)
    // if(n == 0) return 1;
    // return a * power(a, n-1);
    // }

    // O(logn)
    public static int power(int a, int n) {
        if (n == 0)
            return 1;

        int halfsqr = power(a, n / 2);
        int halfsqrt = halfsqr * halfsqr;

        if (n % 2 != 0) {
            halfsqrt = a * halfsqrt;
        }
        return halfsqrt;
    }

    public static int tiles(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        int fnm1 = tiles(n - 1);
        // horizontal
        int fnm2 = tiles(n - 2);
        return fnm1 + fnm2;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }

    }

    private static int frndPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return frndPairing(n - 1) + (n - 1) * frndPairing(n - 2);
    }

    private static void binaryString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }

    private static int countSubstringsFrom(String S, int start) {
        // Base case: If start is beyond the string length, return 0
        if (start >= S.length()) {
            return 0;
        }

        char currentChar = S.charAt(start);
        int count = 0;

        // Count substrings starting from the current character
        for (int end = start; end < S.length(); end++) {
            if (S.charAt(end) == currentChar) {
                count++;
            }
        }

        // Recursive call to process the rest of the string
        return count + countSubstringsFrom(S, start + 1);
    }

    public static void main(String[] args) {
        // decrease(20);
        // increase(20);
        System.out.println(factorial(5));
        // System.out.println(sumOfN(5));
        System.out.println(fibonaci(10));
        // int arr[] = { 1, 2, 3, 10, 8, 3, 4, 5, 3, 3, 3 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 2, 0));
        // System.out.println(lastOccurance(arr, 3, 0));
        // System.out.println(power(2, 5));
        // System.out.println(tiles(4));
        // String str = "appnnacoollege";
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(frndPairing(3));
        // binaryString(3, 0, "");
        // System.out.println(countSubstringsFrom("abcab", 0));
    }
}
