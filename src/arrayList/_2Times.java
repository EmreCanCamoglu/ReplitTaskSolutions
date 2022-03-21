package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _2Times {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        System.out.println(twoTimes(list));

    }

    private static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {

        ArrayList<Integer> newlist = new ArrayList<>();
        for (Integer integer : list) {
            newlist.add(integer);
            newlist.add(integer);
        }
        return newlist;

    }

}
