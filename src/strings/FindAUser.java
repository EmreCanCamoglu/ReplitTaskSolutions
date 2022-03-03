package strings;

import java.util.Scanner;

public class FindAUser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        String name = scan.nextLine();

        if (name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake")) {

            System.out.println("User Found");


        }


    }
}
