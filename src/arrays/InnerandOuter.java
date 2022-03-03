package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InnerandOuter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        ///////////////////////////////////////////////////

        boolean b = false;

        for (int i : inner) {

            b = false;

            for (int i1 : outer) {

                if (i == i1) {
                    b = true;
                    break;
                }
            }

            if (b) {
            } else
                break;
        }

        System.out.println(b);

    }
}
