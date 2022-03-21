package methods;

import java.util.Scanner;

public class MethodsWithString_Cover {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        if (main.contains(coverME))
            main = main.replace(coverME, "[" + coverME + "]");
        else
            main = "[" + main + "]";

        return main;
    }
}
