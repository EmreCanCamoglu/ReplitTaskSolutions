package methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArrays_AddElements {
    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] total = new int[5];

        for (int i = 0; i < 5; i++) {
            total[i] = ints1[i] + ints2[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }
}
