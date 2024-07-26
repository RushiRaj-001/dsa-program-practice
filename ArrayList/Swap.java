package ArrayList;

import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        int temp = list.get(4);
        list.set(4, list.get(5));
        list.set(5, temp);

        System.out.println(list);
    }
}
