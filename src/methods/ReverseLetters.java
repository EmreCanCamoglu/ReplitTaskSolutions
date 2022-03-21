package methods;

import java.util.Scanner;

public class ReverseLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        String str2 = str;

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 123)) {
                str = str.replace("" + str.charAt(i), "");
                i = -1;
            }
        }
        int j = 0;
        for (int i = 0; i < str2.length(); i++) {
            if ((str2.charAt(i) > 64 && str2.charAt(i) < 91) || (str2.charAt(i) > 96 && str2.charAt(i) < 123)) {
                str2 = str2.substring(0, i) + str2.substring(i).replace(str2.charAt(i), str.charAt(str.length() - 1 - j++));

            }

        }

        return str2;
    }
}
