package methods;

import java.util.Scanner;

public class MethodsWithReturn_3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        return (a && b) || c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(), in.nextBoolean()));
    }
}
