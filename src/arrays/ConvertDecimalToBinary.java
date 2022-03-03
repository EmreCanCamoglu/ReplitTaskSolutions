package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        int i = 0;
        String s = Integer.toBinaryString(decimal);
        System.out.println("s = " + s);


        for (int j = 0; j < 8; j++) {
            binary[j] = 0;
        }


        do {
            if (decimal % 2 == 0) {
                binary[7 - i] = 0;
                decimal /= 2;
            } else if (decimal % 2 == 1) {
                binary[7 - i] = 1;
                decimal /= 2;
            }
            i++;
        } while (decimal != 0);


        System.out.println(Arrays.toString(binary));


    }
}

