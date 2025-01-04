package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Questions {

    static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    static void reverse(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    // stock span
    static void stocksSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];

            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }

    }

    static void nextGrater(int arr[], int next[]) {

        Stack<Integer> s = new Stack<>();

        s.push(arr[arr.length - 1]);
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                next[i] = -1;
            } else {
                next[i] = arr[s.peek()];
            }
            s.push(i);
        }

    }

    static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')
                        || (s.peek() == '(' && ch == ')')) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    private static int largestRectangle(int height[]) // Largest Rectangle
    {
        int nsl[] = new int[height.length];
        int nsr[] = new int[height.length];

        Stack<Integer> s = new Stack<>();

        s.push(height[height.length - 1]);

        // for next small right
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.empty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();      
            }
            s.push(i);
        }

        s = new Stack<>();
        s.push(height[0]);
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = height.length;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            int ht = height[i];
            int wt = nsr[i] - nsl[i] - 1;
            int currArea = ht * wt;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        // reverse(s);

        // while (!s.empty()) {
        // System.out.println(s.pop());
        // }

        // int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stocks.length];

        // stocksSpan(stocks, span);
        // for (int i : span) {
        // System.out.print(i + " ");
        // }

        // int arr[] = { 6, 8, 0, 1, 3 };
        // int next[] = new int[arr.length];
        // nextGrater(arr, next);

        // for (int i : next) {
        // System.out.print(i + " ");
        // }

        // String str = "({})[]";
        // System.out.println(isValid(str));

        // String str1 = "((a+b))";
        // String str2 = "(a+b)";

        // System.out.println(isDuplicate(str1));
        // System.out.println(isDuplicate(str2));

        int height[] = { 2, 1, 5, 6, 2, 3 };
        int ans = largestRectangle(height);
        System.out.println(ans);
    }
}