package methods;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }

    public static void plus_minus(int[] r) {
        int pos = 0, neg = 0, zero = 0;
        for (int i : r) {
            if (i < 0) neg++;
            else if (i > 0) pos++;
            else zero++;
        }

        System.out.println("positives:" + pos + ", negatives:" + neg + ", zeros:" + zero);


    }
}
