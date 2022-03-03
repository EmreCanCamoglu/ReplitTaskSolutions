package loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guest, list = "", answer;


        do {
            System.out.println("Please enter guest name:");
            guest = input.nextLine();
            list += guest;


            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();
            if (answer.equals("no")) {
                break;
            }

            list += ", ";

        } while (true);


        System.out.println("Guest's list: " + list);


    }
}
