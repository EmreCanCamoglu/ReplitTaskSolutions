package strings;

import java.util.Scanner;

public class CarInsurance {

    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount;
        int daysDrivenToWorkOrSchool;
        int milesToWorkOrSchool;
        String vehicleOwnership;
        String vehicleUsage;
        String continuousInsurance;
        String education;
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");

        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");

        String license = scan.nextLine();


        if ("Yes".equals(license)) {
        } else {
            System.out.println("Invalid data!");
            System.exit(0);
        }


        System.out.println("Enter your zip code");

        int zipcode = scan.nextInt();
        scan.nextLine();

        if (zipcode == 20910 || zipcode == 20740)
            premium += 60;
        else if (zipcode == 22102 || zipcode == 22103)
            premium += 30;
        else {
            premium += 50;

        }


        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.nextLine();
        if ("Owned".equals(vehicleOwnership)) {
            premium += 10;
        } else {
            premium += 20;
        }


        System.out.println("How is this vehicle primarily used?");

        vehicleUsage = scan.nextLine();

        switch (vehicleUsage) {
            case "Business":
                premium += 50;
                break;
            case "Pleasure":
                premium += 10;
                break;
            case "Commute":
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                scan.nextLine();
                premium += daysDrivenToWorkOrSchool * 5;
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                scan.nextLine();
                premium += milesToWorkOrSchool;


        }


        System.out.println("How old are you?");

        int age = scan.nextInt();
        scan.nextLine();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age < 18)
            premium *= 20;
        else if (age <= 21)
            premium *= 6;
        else if (age < 25)
            premium *= 2;


        System.out.println("How many years you've been driving?");
        int experience = scan.nextInt();
        scan.nextLine();


        if (experience > 0)
            if ((age - experience) >= 16)
                premium -= experience * 5;
            else {
                System.out.println("Invalid data!");
                System.exit(0);
            }
        else {
            System.out.println("Invalid data!");
            System.exit(0);
        }


        System.out.println("Have you had any accidents in the last 5 years?");

        String hadAccident = scan.nextLine();
        if (hadAccident.equalsIgnoreCase("Yes")) {
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();
            scan.nextLine();
            premium += 0.2 * accidentsAmount * premium;
        }


        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.nextLine();
        if (continuousInsurance.equalsIgnoreCase("No"))
            premium *= 2;


        System.out.println("What is the highest level of education you have completed?");

        education = scan.nextLine();
        switch (education) {


            case "PhD":
            case "Bachelors":
            case "Masters":
                premium -= premium * 0.05;
                break;
            case "Doctors":
                premium -= premium * 0.1;
                break;
            case "Less than High School":
                premium += premium * 0.05;

        }


        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);

        System.out.println("Reference number: " + name.substring(0, 2).toUpperCase() + age + name.substring(name.length() - 2).toUpperCase().replace("İ", "I") + zipcode + education.toUpperCase().replace(" ", ""));

    }
}
