package methods;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {

        int count;
        for (String word : words) {
            count = 0;
            for (String word2 : words) {
                if (word.equals(word2)) count++;
            }
            if (count == 1) System.out.println(word);
        }
    }
}
