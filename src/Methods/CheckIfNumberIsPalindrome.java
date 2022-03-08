package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        int temp = num, count = 0;

        while (true) {
            temp /= 10;
            count++;
            if (temp == temp % 10) {
                count++;
                break;
            }
        }

        int[] arr1 = new int[count];
        int[] arr2 = new int[count];
        int temp2 = num, divider;

        for (int i = 0; i < count; i++) {
            divider = (int) Math.pow(10, count - i - 1);
            arr1[i] = temp2 / divider;
            temp2 %= divider;
        }

        temp2 = num;

        for (int i = 0; i < count; i++) {
            divider = (int) Math.pow(10, count - i - 1);
            arr2[count - 1 - i] = temp2 / divider;
            temp2 %= divider;
        }
        System.out.println(Arrays.equals(arr1, arr2));
    }

}
