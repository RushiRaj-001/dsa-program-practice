


public class PartyCouples {

    static int check(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }
  

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 7, 3, 2, 5 };
        System.out.println(check(arr));
        
    }
}
