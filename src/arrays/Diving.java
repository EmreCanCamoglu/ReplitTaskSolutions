package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];


        float total = 0, diff;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter score for judge " + i + ":");
            score[i - 1] = input.nextFloat();
        }


        System.out.println("Enter difficulty:");
        diff = input.nextFloat();
        Arrays.sort(score);

        for (int i = 1; i < 6; i++) {
            total += score[i];

        }

        total *= diff;
        total *= 0.6f;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
