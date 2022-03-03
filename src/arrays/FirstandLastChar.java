package arrays;

import java.util.Scanner;

public class FirstandLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        for (String word : words) {
            System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));

        }


    }
}
