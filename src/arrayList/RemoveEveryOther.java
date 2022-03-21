package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEveryOther {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }

    private static ArrayList<String> removeEveryOther(ArrayList<String> list) {

        int range;
        if (list.size() % 2 == 0)
            range = list.size();
        else
            range = list.size() - 1;

        ArrayList<String> newlist = new ArrayList<>();
        for (int i = 1; i < range; i += 2) {
            newlist.add(list.get(i));
        }

        return newlist;
    }
}
