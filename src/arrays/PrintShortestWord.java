package arrays;

import java.util.Scanner;

public class PrintShortestWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};


        int min = str[0].length();

        String minword = "";

        for (String word : str) {

            if (word.length() <= min) {
                minword = word;
                min = word.length();
            }
        }


        System.out.println(minword);


    }
}
