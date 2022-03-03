package statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner cent = new Scanner(System.in);
        System.out.println("Enter cents:");

        int exchange = cent.nextInt();

        if (exchange >= 0 && exchange <= 100) {
            int quarters = exchange / 25;
            exchange -= quarters * 25;
            int dimes = exchange / 10;
            exchange -= dimes * 10;
            int nickels = exchange / 5;
            exchange -= nickels * 5;
            int pennies = exchange;

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");


        } else {
            System.out.println("Invalid cents amount");
        }


    }
}
