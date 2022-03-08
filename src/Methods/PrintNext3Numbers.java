package Methods;

import java.util.Scanner;

public class PrintNext3Numbers {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();
        next3(num);

    }

    public static void next3(int a) {
        System.out.println("next 3 are:");
        System.out.println((a + 1) + " " + (a + 2) + " " + (a + 3));
    }

}
