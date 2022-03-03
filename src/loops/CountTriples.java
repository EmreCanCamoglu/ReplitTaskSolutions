package loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        String b, c, d;
        int i = 0;
        while (i < str.length() - 2) {

            b = "" + str.charAt(i);
            c = "" + str.charAt(i + 1);
            d = "" + str.charAt(i + 2);
            if (b.equals(c) && b.equals(d)) count++;


            i++;

        }


        System.out.println(count);


    }
}
