

public class sortString {

    public static String[] mergeSort(String arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si == ei) {
            String[] A = { arr[si] };
            return A;
        }

        String[] arr1 = mergeSort(arr, si, mid);
        String[] arr2 = mergeSort(arr, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String temp[] = new String[m + n];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                temp[idx] = arr1[i];
                i++;
            } else {
                temp[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        while (i < m) {
            temp[idx++] = arr1[i++];
        }
        while (j < n) {
            temp[idx++] = arr2[j++];
        }

        return temp;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 1, 54, 5, 7, 3, -1, 2, 12 };

        String arr[] = { "sun", "mars", "earth", "mercury" };
        int n = arr.length - 1;

        String a[] = mergeSort(arr, 0, n);
        for (String i : a)
            System.out.print(i + " ");
    }
}