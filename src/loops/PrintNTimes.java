package loops;

import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String a = "*";
        System.out.println(a.repeat(n));
    }
}
