import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class test {

    // public static void reverseString(char[] s) {
    // Stack<Character> s1 = new Stack<>();

    // for (char a : s) {
    // s1.push(a);
    // }

    // int i = 0;
    // while (!s1.isEmpty()) {
    // s[i] = s1.pop();
    // i++;
    // }
    // for (char c : s) {
    // System.out.print(c + ",");
    // }
    // }

    // public static void trap(int[] height) {

    // if (height.length == 1 || height.length == 2) {
    // System.out.println("it not trap water");
    // return;
    // }

    // int left_max[] = new int[height.length];
    // int right_max[] = new int[height.length];

    // left_max[0] = height[0];
    // for (int i = 1; i < left_max.length; i++) {
    // if (left_max[i - 1] > height[i]) {
    // left_max[i] = left_max[i - 1];
    // } else {
    // left_max[i] = height[i];
    // }
    // }

    // for (int i : left_max) {
    // System.out.print(i + " ");
    // }

    // System.out.println();
    // right_max[right_max.length - 1] = height[height.length - 1];
    // for (int i = right_max.length - 2; i >= 0; i--) {
    // if (right_max[i + 1] > height[i]) {
    // right_max[i] = right_max[i + 1];
    // } else {
    // right_max[i] = height[i];
    // }
    // }
    // for (int i : right_max) {
    // System.out.print(i + " ");
    // }

    // int trapWater = 0;
    // for (int i = 0; i < height.length; i++) {
    // int waterlevel = Math.min(left_max[i], right_max[i]);
    // trapWater += waterlevel - height[i];
    // }

    // System.out.println();
    // System.out.println(trapWater);
    // }

    public static void main(String[] args) {

        // int[] height = { 2, 1, 2 };

        // trap(height);
        // char[] s = { 'h', 'e', 'l', 'l', 'o' };

        // reverseString(s);

        // String name = JOptionPane.showInputDialog("Enter name");
        // // int a = JOptionPane
        // // JOptionPane.showMessageDialog(null, args, name, a);
        // JOptionPane.showConfirmDialog(null, args, name, 1);
        // JOptionPane.showMessageDialog(null, "Hello " + name);

        // System.out.println();

        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];

        }

        // asscending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("final Value : " + finalVal);
    }
}