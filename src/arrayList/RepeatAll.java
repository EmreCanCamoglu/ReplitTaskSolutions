package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

    private static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list) {

        list.addAll(list);


        return list;
    }
}
