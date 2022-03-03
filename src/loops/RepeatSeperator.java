package loops;

import java.util.Scanner;

public class RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();


        System.out.print((word + separator).repeat(count - 1));
        System.out.print(word);


    }
}
