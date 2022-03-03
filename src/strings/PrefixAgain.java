package strings;

import java.util.Scanner;

public class PrefixAgain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String word;


        word = str.substring(0, n);
        str = str.substring(n);
        System.out.println(str.contains(word));


    }
}
