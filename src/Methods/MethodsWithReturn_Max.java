package Methods;

import java.util.Scanner;

public class MethodsWithReturn_Max {
    public static int max(int x, int max) {
        if (max < x)
            return x;
        else return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }
}
