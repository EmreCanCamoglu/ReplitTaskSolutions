package basics;

import java.util.Scanner;

public class PrintVariable3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        System.out.println("num= " + num);
        System.out.println("cost= " + cost);
    }
}
