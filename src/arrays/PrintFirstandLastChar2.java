package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstandLastChar2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        int i = 0;
        String[] words2 = new String[words.length];
        for (String word : words) {

            words2[i] = word.charAt(0) + "" + word.charAt(word.length() - 1);
            i++;

        }

        System.out.println(Arrays.toString(words2));
    }
}
