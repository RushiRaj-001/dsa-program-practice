package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConWater {

    static int storeWater(ArrayList<Integer> height) {
        // Brute Force : Time Complexity O(n^2);
        // int max_water = 0;
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int ht = Math.min(height.get(i), height.get(j));
        // int wt = j - i;
        // int water = ht * wt;
        // max_water = Math.max(water, max_water);
        // }
        // }
        // System.out.println(max_water);
        // }

        // optimal approch : two pointer

        int lp = 0;
        int rp = height.size() - 1;
        int max_water = 0;
        while (lp < rp) {

            int wt = rp - lp;
            int lp_ht = height.get(lp);
            int rp_ht = height.get(rp);
            int ht = Math.min(rp_ht, lp_ht);
            int water = wt * ht;

            max_water = Math.max(max_water, water);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return max_water;
    }

    public static void main(String[] args) {

        // int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int ans = storeWater(height);
        System.out.println(ans);
    }
}
