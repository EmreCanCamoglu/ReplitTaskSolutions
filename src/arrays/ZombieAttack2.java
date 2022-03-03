package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] inhb2;
        boolean b = true;
        int i;
        int h = 0;

        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        do {
            i = 0;
            inhb2 = Arrays.copyOf(inhabitants, 8);
            for (int j = 0; j < 8; j++) {
                if (j == 0 || j == 7) {
                    if (j == 0) {
                        if (inhabitants[1] == 0) {

                            inhabitants[j] /= 2;
                            if (inhabitants[j] != 0) ++i;

                        }
                    } else if (inhb2[6] == 0) {
                        inhabitants[j] /= 2;
                        if (inhabitants[j] != 0) ++i;

                    }
                } else {
                    if (inhb2[j - 1] == 0 || inhabitants[j + 1] == 0) {
                        inhabitants[j] /= 2;
                        if (inhabitants[j] != 0) ++i;
                    }
                }
            }
            h++;
            System.out.println("Day " + h + " " + Arrays.toString(inhabitants));
            if (i == 0 && inhabitants[0] == 0 && inhabitants[7] == 0) {
                System.out.println("---- EXTINCT ----");
                b = false;
            }

        } while (b);


    }
}
