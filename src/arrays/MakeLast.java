package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int last = nums[size - 1];


        int[] zeronums = new int[size * 2];
        for (int i = 0; i < size * 2; i++) {
            if (i != (size * 2) - 1)
                zeronums[i] = 0;
            else
                zeronums[i] = last;
        }
        System.out.println(Arrays.toString(zeronums));


    }
}
