package arrays;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        int max = nums[0];

        for (int num : nums) {
            if (num > max)
                max = num;

        }

        System.out.println(max);


    }
}
