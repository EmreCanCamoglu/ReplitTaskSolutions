package arrays;

import java.util.Scanner;

public class CountEvens {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int i = 0, count = 0;
        while (i < 5) {

            if (nums[i] % 2 == 0)
                count++;


            i++;


        }


        System.out.println(count);
    }
}
