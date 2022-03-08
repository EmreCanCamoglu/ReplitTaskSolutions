package Methods;

import java.util.Scanner;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        int count;
        for (int num : nums) {
            count = 0;
            for (int i : nums) {
                if (num == i) count++;
            }
            if (count == 1) System.out.println(num);
        }


    }
}
