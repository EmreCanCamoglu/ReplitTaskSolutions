package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int temp;

        for (int j = 0; j < 3; j++) {
            temp = nums[j];
            nums[j] = nums[6 - j];
            nums[6 - j] = temp;
        }

        System.out.println(Arrays.toString(nums));

    }
}
