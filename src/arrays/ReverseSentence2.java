package arrays;

import java.util.Scanner;

public class ReverseSentence2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "", temp;

        String[] reverse = sentence.split(" ");
        int lenght = reverse.length / 2;

        for (int j = 0; j < lenght; j++) {
            temp = reverse[j];
            reverse[j] = reverse[reverse.length - j - 1];
            reverse[reverse.length - j - 1] = temp;
        }


        for (int i = 0; i < reverse.length; i++) {

            if (i == reverse.length - 1) {
                reversed += reverse[i];
                continue;
            }
            reversed += reverse[i] + " ";

        }


        System.out.println(reversed);
    }

}
