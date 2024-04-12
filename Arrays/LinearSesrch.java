package Arrays;

public class LinearSesrch {

    public static int search(String menu[], String key) {

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "vadapav", "pavvada", "samosa", "dosa" };
        String key = "samosa";

        int index = search(menu, key);

        if (index == -1) {
            System.err.println("not FOUND");
        } else {
            System.out.println("The index of : " + index);
        }
    }
}
