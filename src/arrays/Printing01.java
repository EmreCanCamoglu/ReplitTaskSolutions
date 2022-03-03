package arrays;

import java.util.Scanner;

public class Printing01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextLine();
        }


        for (String s : arr) {
            System.out.println(s.substring(0, 3));
        }


    }

}
