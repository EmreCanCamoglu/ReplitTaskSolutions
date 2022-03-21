package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    public static String search(ArrayList<String> r, String find) {

        for (String s : r) {
            if (s.contains(find))
                return s;
        }

        return "search failed";
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }
}
