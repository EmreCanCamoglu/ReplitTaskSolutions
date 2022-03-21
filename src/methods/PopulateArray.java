package methods;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {

    public static void populate(int[] r) {

        for (int i = 0; i < r.length; i++) {

            r[i] = i + 1;

        }
    }

    public static void main(String[] args) {
        int[] i = new int[new Scanner(System.in).nextInt()];
        populate(i);
        System.out.println(Arrays.toString(i));

    }
}
