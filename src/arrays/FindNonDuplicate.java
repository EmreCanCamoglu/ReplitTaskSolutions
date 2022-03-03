package arrays;

import java.util.Scanner;

public class FindNonDuplicate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int count;

        for (int j = 0; j < 7; j++) {
            count = 0;
            for (int i = 0; i < 7; i++) {

                if (nums[j] == nums[i])
                    count++;

            }
            if (count == 1) {
                System.out.println(nums[j]);
                System.exit(0);
            }
        }


    }
}
