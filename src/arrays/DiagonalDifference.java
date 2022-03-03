package arrays;


import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{{scan.nextInt(), scan.nextInt(), scan.nextInt()}, {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result, result1, result2;

        result1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
        result2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
        result = result1 - result2;

        System.out.println(Math.abs(result));

    }
}
