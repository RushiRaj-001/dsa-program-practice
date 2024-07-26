import java.util.ArrayList;
import java.util.HashSet;

public class Union {

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 3, 2, 2, 3, 6, 5 };
        int arr2[] = { 1, 3, 2, 12, 22, 11, 23, 44 };

        // union(arr1, arr2);

        System.out.println(union(arr1, arr2));
    }

    static ArrayList<Integer> union(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        return list;
    }
}
