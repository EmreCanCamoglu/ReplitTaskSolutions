package strings;

import java.util.Scanner;

public class Withoutx_X {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String b, c;


        b = "" + word.charAt(0);

        if (b.equalsIgnoreCase("x")) {

            word = word.substring(1);
        }
        c = "" + word.charAt(word.length() - 1);
        if (c.equalsIgnoreCase("x")) {

            word = word.substring(0, word.length() - 1);
        }
        System.out.println("word = " + word);


    }
}
