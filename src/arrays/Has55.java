package arrays;

import java.util.Scanner;

public class Has55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        boolean b = false;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1] && nums[i] == 5) {
                b = true;
                break;
            }
        }


        System.out.println(b);
    }
}
