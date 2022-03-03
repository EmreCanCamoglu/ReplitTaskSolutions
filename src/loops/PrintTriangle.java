package loops;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        int i = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = "*";


        while (i <= n) {
            System.out.println(s.repeat(i));
            i++;


        }


    }
}
