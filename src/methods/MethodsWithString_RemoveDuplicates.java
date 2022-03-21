package methods;

import java.util.Scanner;

public class MethodsWithString_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        String check = "", output = "";
        for (int i = 0; i < str.length(); i++) {
            if (check.contains("" + str.charAt(i))) continue;
            check += "" + str.charAt(i);
            output += "" + str.charAt(i);
        }
        return output;
    }
}
