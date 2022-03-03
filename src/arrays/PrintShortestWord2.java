package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");

        int min = words[0].length();

        for (String word : words) {
            if (word.length() <= min)
                min = word.length();
        }

        int count = 0;

        for (String word : words) {
            if (word.length() == min)
                count++;
        }

        String[] wordsmin = new String[count];

        int i = 0;

        for (String word : words) {
            if (word.length() == min) {
                wordsmin[i] = word;
                i++;
            }


        }

        Arrays.sort(wordsmin);

        System.out.println(Arrays.toString(wordsmin));


    }
}
