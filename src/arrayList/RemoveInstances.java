package arrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RemoveInstances {

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

        for (int i = 0; i < r.size(); i++) {
            if (Objects.equals(r.get(i), n)) {
                r.remove(i);
                i = -1;
            }
        }
        return r;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }
}
