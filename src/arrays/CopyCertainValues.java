package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        int count = 0;

        for (String s : arr) {
            if (s.contains("e")) count++;


        }

        String[] fewValues = new String[count];

        int index = 0;
        for (String s : arr) {
            if (s.contains("e")) {
                fewValues[index] = s;
                index++;
            }

        }

        return fewValues;

    }
}