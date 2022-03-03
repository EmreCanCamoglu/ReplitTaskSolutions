package statements;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();


        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }


    }
}
