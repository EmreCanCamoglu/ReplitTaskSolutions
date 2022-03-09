package Methods;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String check) {
        check = check.replace(" ", "");
        String result = "";
        for (int i = 0; i < check.length(); i++) {
            result += check.charAt(check.length() - 1 - i) + "";
        }
        return check.equalsIgnoreCase(result);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
