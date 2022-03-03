package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }


        int[] num2 = new int[2];
        if (num.length < 3) {

            System.out.println(Arrays.toString(num));
        } else {

            for (int i = 0; i < 2; i++) {

                num2[i] = num[i];

            }
            System.out.println(Arrays.toString(num2));
        }


        /////////ALSO IT CAN BE DONE WITH SYSTEM.ARRAYCOPY()!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    }
}
