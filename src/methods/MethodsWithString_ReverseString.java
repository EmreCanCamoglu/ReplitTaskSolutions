package methods;

import java.util.Scanner;

public class MethodsWithString_ReverseString {
    public static String reverse(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(input.length() - 1 - i) + "";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
