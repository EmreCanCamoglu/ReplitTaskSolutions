package methods;

import java.util.Scanner;

public class BadProducts {
    public static boolean badP(int[] products, int limit) {
        int count = 0;
        for (int product : products) {
            if (product == 0) count++;
        }
        return count < limit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();

        System.out.println(badP(nums, limit));
    }
}
