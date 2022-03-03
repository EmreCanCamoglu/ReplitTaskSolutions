package strings;

import java.util.Scanner;

public class DiscordTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String space = " ";
        String number;
        int i = 0;


        while (i <= num) {
            number = "" + i;
            System.out.println(space.repeat(2 * num - 2 * i) + number.repeat(4 * i + 1));
            i++;

        }


    }
}
