package methods;

import java.util.Scanner;

public class MethodsWithString_CleanString {
    public static String clean(String text, String badWord) {

        text = text.replace(badWord, "");
        text = text.replace("  ", " ");
        text = text.trim();
        return text;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}
