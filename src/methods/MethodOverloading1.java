package methods;

import java.util.Scanner;

public class MethodOverloading1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if (runInt) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    public static double findMax(double[] array) {
        double max = array[0];
        for (double i : array) {
            if (i > max) max = i;
        }
        return max;
    }
}
