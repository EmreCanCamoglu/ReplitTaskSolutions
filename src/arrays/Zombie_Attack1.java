package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie_Attack1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        boolean b = true;
        int i;
        int h = 0;
        int a;

        do {
            i = 0;
            System.out.println("Day " + h + " " + Arrays.toString(inhabitants));
            for (int j = 0; j < 8; j++) {
                a = inhabitants[j];
                inhabitants[j] /= 2;
                if (a / 2 != 0) ++i;
            }
            h++;
            if (i == 0) {
                System.out.println("Day " + h + " " + Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");
                b = false;
            }

        } while (b);


    }


}

