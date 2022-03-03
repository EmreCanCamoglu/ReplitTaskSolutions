package variables;

import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");
        int dose = s.nextInt();

        int numOfMilligrams = 10000 / dose;

        System.out.println("It would take about " + numOfMilligrams + " drinks for a lethal overdose.");


    }
}
