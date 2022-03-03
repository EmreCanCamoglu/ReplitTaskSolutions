package arrays;

import java.util.Scanner;

public class FindingMaxLenghtInStringArray {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }
        int max = words[0].length();
        String longest = "";
        for (String word : words) {
            if (word.length() > max) {
                max = word.length();
                longest = word;
            }

        }


        System.out.println(longest);


    }
}
