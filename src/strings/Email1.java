package strings;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            System.out.println(email.substring(email.indexOf("_") + 1, email.indexOf("@")) + "_" + email.substring(0, email.indexOf("_")) + email.substring(email.indexOf("@")));

        } else
            System.out.println(email);
        System.out.println();


        System.out.println("First name: " + email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf("_")));
    }


}

