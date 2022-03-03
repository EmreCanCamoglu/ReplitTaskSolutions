package loops;

import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        int i = 0;
        while (start <= end) {

            System.out.print((char) (start + i));

            start++;


        }
    }
}
