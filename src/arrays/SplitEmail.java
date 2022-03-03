package arrays;

import java.util.Scanner;

public class SplitEmail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        if (email.contains("@")) {
            email = email.replaceFirst("@", "&");
            if (email.contains("@")) {
                System.out.println("invalid email");
                System.exit(0);
            }
        } else {
            System.out.println("invalid email");
            System.exit(0);
        }

        String[] split = email.split("&");
        String id, domain;
        id = split[0];
        domain = split[1];

        System.out.println("Email id: " + id);
        System.out.println("Email domain: " + domain);


    }
}
