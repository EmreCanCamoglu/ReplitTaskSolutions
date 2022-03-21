package methods;

import java.util.Scanner;

public class MethodsWithString_WordCount {
    public static int wordCount(String words) {
        String[] arr = words.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
