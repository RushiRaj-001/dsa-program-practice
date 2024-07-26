public class practice {
    // question 1 : Print the number of 7’s that are inthe 2d array.
    public static int find(int arr[][]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    // question 2: Print out the sum of the numbers inthe second row of the “nums”
    // array
    static int sum(int nums[][]) {
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[1][j];
        }
        return sum;
    }
    // question 3: Write a program to Find Transpose of a Matrix

    public static void transpose(int arr[][]) {


        int row = 2 , column = 4;
        

        int tran[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
               tran[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < tran.length; i++) {
            for (int j = 0; j < tran[i].length; j++) {
                System.out.print(tran[i][j] + " ");
            }
            ;
        }



    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
        };

        // System.out.print(find(arr));
        // System.out.print(sum(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            ;
        }
        System.out.println();
        transpose(arr);
        
    }

}
