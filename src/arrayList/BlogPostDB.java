package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BlogPostDB {

    public static String blogDb(ArrayList<String[]> r, String id) {

        String result = "";

        for (String[] strings : r) {
            if (strings[0].equals(id)) {
                result = strings[1] + "\n" + strings[2];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String id = in.next();
        in.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
        }

        System.out.println(blogDb(list, id));

    }
}
