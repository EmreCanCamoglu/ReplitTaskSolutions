package statements;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String product = s.nextLine();

        int bl, ch, ha, he, pa, pi, so, us;
        bl = 60;
        ch = 25;
        ha = 25;
        he = 30;
        pa = 50;
        pi = 40;
        so = 5;
        us = 10;


        switch (product) {

            case "Blanket":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - bl) + "$");
                break;


            case "Charger":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - ch) + "$");
                break;


            case "Hat":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - ha) + "$");
                break;


            case "Headphones":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - he) + "$");
                break;


            case "Laptop":


            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;


            case "Pants":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - pa) + "$");
                break;


            case "Pillow":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - pi) + "$");
                break;


            case "Socks":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - so) + "$");
                break;


            case "USB cable":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + (100 - us) + "$");
                break;


            default:
                System.out.println("Invalid item!");

        }


    }
}
