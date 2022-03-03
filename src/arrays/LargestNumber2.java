package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber2 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }
        }

        int max = arr[0][0];


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        for (int a = 0; a <= rows - 1; a++) {
            for (int h = 0; h <= cols - 1; h++) {
                arr[a][h] = max;
            }
        }


        System.out.println(Arrays.deepToString(arr));
    }
}
