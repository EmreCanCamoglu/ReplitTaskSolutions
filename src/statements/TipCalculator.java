package statements;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int people;
        double tip = 0, pay, total = 0;
        String quality, sONS;


        System.out.println("Split:");
        sONS = scan.nextLine();

        System.out.println("Number of people:");
        people = scan.nextInt();

        System.out.println("Check amount:");
        pay = scan.nextDouble();

        System.out.println("Service Quality:");
        quality = scan.next();

        System.out.print("Number of people entered: ");
        for (int num = 0; num < people; num += 1) {
            System.out.print("&");
        }
        System.out.println();


        switch (quality) {


            case "Excellent":
                tip = (pay * 25) / 100;
                total = pay + tip;
                break;


            case "Great":
                tip = (pay * 20) / 100;
                total = pay + tip;
                break;

            case "Good":
                tip = (pay * 15) / 100;
                total = pay + tip;
                break;

            case "Fair":
                tip = (pay * 10) / 100;
                total = pay + tip;
                break;
            case "Poor":
                tip = (pay * 5) / 100;
                total = pay + tip;
                break;


        }


        System.out.println("Total to pay: " + total);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + (total / people));
        System.out.println("Tip per person: " + (tip / people));


    }
}
