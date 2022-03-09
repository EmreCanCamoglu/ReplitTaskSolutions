package Methods;

import java.util.Scanner;

public class MethodsWithString_RemoveFirstChar {
    public static String removeFirst(String target) {
        return target.substring(1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }
}
