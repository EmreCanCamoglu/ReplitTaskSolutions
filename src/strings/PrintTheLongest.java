package strings;

import java.util.Scanner;

public class PrintTheLongest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println();
        if (word1.length() < word2.length())
            System.out.println(word2);
        else
            System.out.println(word1);
    }
}
