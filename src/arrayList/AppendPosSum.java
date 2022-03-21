package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList<Integer> newint = new ArrayList<>();
        int sum = 0;
        for (Integer integer : list) {
            if (integer > 0) {
                newint.add(integer);
                sum += integer;
            }

        }
        newint.add(sum);

        return newint;
    }
}
