package arrays;

import java.util.Scanner;

public class LargestNumber {
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


        for (int j = 0; j < rows; j++) {

            for (int i = 0; i < cols; i++) {
                if (max < arr[j][i]) {
                    max = arr[j][i];
                }


            }


        }
        System.out.println(max);
    }
}
