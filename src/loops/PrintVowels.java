package loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        int i = 0;
        char a;

        while (i < word.length()) {

            a = word.charAt(i);


            switch (a) {

                case 'a':
                case 'u':
                case 'o':
                case 'i':
                case 'e':
                    System.out.print(a);


            }


            i++;


        }


    }
}
