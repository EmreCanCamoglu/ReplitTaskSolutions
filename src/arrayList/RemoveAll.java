package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAll {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }

    public static ArrayList<String> removeAll(ArrayList<String> list, String target) {

        int count = 0;

        while (count < list.size()) {
            if (list.get(count).equals(target)) {
                list.remove(count);
                count = 0;
            }
            count++;
        }

        return list;
    }
}
