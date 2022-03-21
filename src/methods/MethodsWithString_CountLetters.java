package methods;

import java.util.Scanner;

public class MethodsWithString_CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        String check = "", output = "";
        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (check.contains("" + str.charAt(i)))
                continue;
            else {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }
                check += "" + str.charAt(i);
            }
            output += count + "" + str.charAt(i);

        }
        return output;
    }
}
