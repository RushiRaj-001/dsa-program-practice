package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(45);
        list.add(3);
        list.add(4);

        System.out.println(list);
        // get
        System.out.println(list.get(3));
        System.out.println(list.get(0));

        // set
        // System.out.println(list.set(3, 10));

        // remove
        System.out.println(list.remove(0));

        // contains
        // System.out.println(list.contains(3));

        // indexOf
        // System.out.println(list.indexOf(3));

        // size
        System.out.println(list.size());
        System.out.println(list);

        // sort
        Collections.sort(list); // asscending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
