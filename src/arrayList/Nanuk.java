package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int nanukCount = 0, huntCount = 0;

        for (String s : r) {
            if (s.equals("nanuk"))
                nanukCount++;
            else
                huntCount += Integer.parseInt(s);
        }
        return (nanukCount <= way_stones && huntCount >= boast);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(nanuk(list, stones, boast));

    }
}
