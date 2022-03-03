package arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double total = 0;
        double avgTemp;
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};


        for (double temp : temps) {
            total += temp;
        }
        avgTemp = total / 8;
        System.out.println(avgTemp);


    }
}
