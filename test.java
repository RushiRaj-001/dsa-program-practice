// public class test {

//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     public static float sum(int a, float b, int c) {
//         return a + b + c;
//     }

//     public static void increment(int x) {
//         System.out.println(x++ + ++x);
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(2, 3));
//         System.out.println(sum(2, 4.2f, 5));
//         increment(5);
//     }
// }

// import java.util.Scanner;
// import java.util.concurrent.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number to calculate its factorial: ");
//         int number = scanner.nextInt();

//         ExecutorService executor = Executors.newSingleThreadExecutor();
//         Future<Long> future = executor.submit(new FactorialTask(number));

//         System.out.println("Calculating factorial...");

//         try {
//             long result = future.get();
//             System.out.println("Factorial: " + result);
//         } catch (InterruptedException | ExecutionException e) {
//             System.err.println("An error occurred during calculation: " + e.getMessage());
//         }

//         executor.shutdown();
//     }

//     static class FactorialTask implements Callable<Long> {
//         private final int number;

//         FactorialTask(int number) {
//             this.number = number;
//         }

//         @Override
//         public Long call() {
//             long factorial = 1;
//             for (int i = 1; i <= number; i++) {
//                 factorial *= i;
//             }
//             return factorial;
//         }
//     }
// }

public class test {

    public static void main(String[] args) {
        String str1 = "nitin";
        String str2 = str1.toLowerCase();
        char len[] = str2.toCharArray();
        boolean a = true;
        for (int i = 0; i < len.length; i++) {
            for (int j = len.length - 1; j > 0; j--) {
                if (len[i] == len[j]) {
                    a = false;
                    break;
                }
            }
        }
        if (a) {
            System.out.println("word is palindrome");
        } else {
            System.out.println("word is not palindrome");
        }
    }
}