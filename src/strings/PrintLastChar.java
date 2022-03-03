package strings;

import java.util.Scanner;

public class PrintLastChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.length() - 1));


    }
}
