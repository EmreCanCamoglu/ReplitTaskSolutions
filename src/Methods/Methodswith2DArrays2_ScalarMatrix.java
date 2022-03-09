package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Methodswith2DArrays2_ScalarMatrix {

    public static int[][] scalar(int[][] matrix, int n) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = n * matrix[i][j];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] i = new int[][]
                {
                        {in.nextInt(), in.nextInt(), in.nextInt()},
                        {in.nextInt(), in.nextInt(), in.nextInt()}
                };
        int factor = in.nextInt();
        i = scalar(i, factor);
        System.out.println(Arrays.deepToString(i));

    }
}
