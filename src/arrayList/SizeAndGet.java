package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeAndGet {
    public static int sum(ArrayList<Integer> nums) {

        int sum = 0;

        for (Integer num : nums) {
            sum += num;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(sum(list));

    }

}
