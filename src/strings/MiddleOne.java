package strings;

import java.util.Scanner;

public class MiddleOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int i;
        if (word.length() == 1) {
            System.out.println(word.repeat(3));

        } else if (word.length() == 2) {
            System.out.println(word.repeat(2));

        } else if (word.length() % 2 == 1) {
            System.out.println(word.charAt(word.length() / 2));

        } else {
            i = word.length() / 2;
            System.out.println(word.substring(i - 1, i + 1));
        }
    }
}
