package loops;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        int i = 0;
        while (i < word.length()) {

            System.out.println(word.charAt(i));
            i++;
        }


    }
}
