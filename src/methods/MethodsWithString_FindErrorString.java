package methods;

import java.util.Scanner;

public class MethodsWithString_FindErrorString {
    public static boolean isError(String line) {

        return line.startsWith("error");
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }
}
