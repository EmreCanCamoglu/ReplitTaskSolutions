package methods;

import java.util.Scanner;

public class MethodsWithString_MergeThem {
    public static String mergeStrings(String one, String two) {
        String merged = "";
        for (int i = 0; i < Math.min(one.length(), two.length()); i++) {
            merged += one.charAt(i) + "" + two.charAt(i);
        }
        if (one.length() < two.length())
            merged = merged + two.substring(one.length());
        else
            merged = merged + one.substring(two.length());

        return merged;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
