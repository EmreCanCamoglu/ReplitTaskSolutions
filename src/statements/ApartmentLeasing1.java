package statements;

import java.util.Scanner;

public class ApartmentLeasing1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice;


        switch (numberOfBedrooms) {

            case 1:
                System.out.println("One Bedroom Selected");
                startingPrice = 1100;
                System.out.println("Starting Price: " + startingPrice);
                break;
            case 2:
                System.out.println("Two Bedroom Selected");
                startingPrice = 1850;
                System.out.println("Starting Price: " + startingPrice);
                break;
            case 3:
                System.out.println("Three Bedroom Selected");
                startingPrice = 2550;
                System.out.println("Starting Price: " + startingPrice);
                break;
            default:
                System.out.println("No such Bedrooms available");


        }


    }
}
